# Cashi Ledger Task

A fintech-focused fee calculation and ledger recording service built with **Kotlin**, **Ktor**, **Restate**, and **TigerBeetle**.

GitHub: https://github.com/Bayonle010/tigger-bettle-ledger-implementation

---

## Overview

This application calculates transaction fees, records fee movements in TigerBeetle using double-entry ledger principles, and uses Restate to make ledger recording durable and retry-safe.

The application supports:

- Fee calculation for multiple transaction types
- Idempotent request handling
- Durable workflow execution with Restate
- Ledger recording with TigerBeetle
- Docker-based deployment

---

## Architecture

```text
┌─────────────┐
│ HTTP Client │
└──────┬──────┘
       │
       ▼
┌──────────────────┐
│ cashi-api        │
│ Ktor API :8081   │
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│ Restate Server   │
│ :8080 / :9070    │
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│ cashi-workflow   │
│ Restate Worker   │
│ :9080            │
└────────┬─────────┘
         │
         ▼
┌──────────────────┐
│ TigerBeetle      │
│ Ledger :3000     │
└──────────────────┘
```

---

## Technology Stack

| Technology | Purpose |
|---|---|
| Kotlin | Main programming language |
| Ktor | HTTP API server |
| Restate | Durable workflow orchestration |
| TigerBeetle | Financial ledger |
| Koin | Dependency injection |
| Kotest | Testing |
| MockK | Mocking |
| Docker Compose | Local container orchestration |

---

## Project Structure

```text
src/main/kotlin
├── common/          # Common response and exception utilities
├── di/              # Dependency injection configuration
├── domain/          # Core business domain models
├── dto/             # Request and response DTOs
├── enums/           # Application enums
├── ledger/          # TigerBeetle integration and ledger setup
├── mapper/          # Mapping utilities
├── routes/          # Ktor routes
├── service/         # Business logic and fee calculation
├── workflow/        # Restate workflow and workflow client
├── Application.kt   # Ktor application entry
├── Routing.kt       # Route registration
├── Serialization.kt # JSON serialization config
└── StatusPages.kt   # Global error handling
```

---

## Running the Project

### Prerequisites

Install:

- Docker
- Docker Compose

Verify:

```bash
docker --version
docker compose version
```

---

### Start All Services

From the project root, first pull the latest changes from the `main` branch:

```bash
git pull origin main
```

Then start all services:

```bash
docker compose up --build
```

This starts:

| Service | Purpose | Port |
|---|---|---|
| cashi-api | Ktor API | 8081 |
| cashi-workflow | Restate workflow endpoint | 9080 |
| cashi-init-ledger | Initializes TigerBeetle accounts | N/A |
| restate | Restate server/admin | 8080 / 9070 / 9071 |
| tigerbeetle | Ledger engine | 3000 |

---

### Register Restate Workflow

After the containers are running, register the workflow endpoint with Restate:

```bash
curl -X POST http://localhost:9070/deployments \
  -H "Content-Type: application/json" \
  -d '{"uri":"http://cashi-workflow:9080"}'
```

Expected response should include:

```json
{
  "services": [
    {
      "name": "FeeRecordingWorkflow"
    }
  ]
}
```

---

## API Documentation

### Calculate Transaction Fee

```http
POST /transaction/fee
```

Required header:

```text
idempotency-key: 9d2c7b7e-5d4e-4d3c-8cc1-0d3d41f99c12
```

Example request:

```bash
curl -X POST http://localhost:8081/transaction/fee \
  -H "Content-Type: application/json" \
  -H "idempotency-key: 9d2c7b7e-5d4e-4d3c-8cc1-0d3d41f99c12" \
  -d '{
    "amount": "1000.00",
    "asset": "USD",
    "asset_type": "FIAT",
    "type": "MOBILE_TOP_UP",
    "state": "PENDING",
    "created_at": "2023-08-30T15:42:17.610059Z"
  }'
```

Example response:

```json
{
  "status": true,
  "statusCode": 0,
  "message": "Fee Retrieved Successfully",
  "data": {
    "transaction_id": "22dbfd28-dbbe-419d-98ca-3e0ef3e399f5",
    "amount": "1000.00",
    "asset": "USD",
    "type": "Mobile Top Up",
    "fee": "1.50",
    "rate": "0.0015",
    "description": "Mobile top-up fee at 0.15%"
  }
}
```

Duplicate request response:

```json
{
  "status": true,
  "statusCode": 0,
  "message": "Fee Retrieved Successfully",
  "details": "Duplicate request detected. Returning previous response."
}
```

---

## Supported Transaction Types

| Transaction Type | Rate | Description |
|---|---:|---|
| MOBILE_TOP_UP | 0.0015 | 0.15% |
| BILL_PAYMENT | 0.0020 | 0.20% |
| BANK_TRANSFER | 0.0030 | 0.30% |
| CARD_PAYMENT | 0.0250 | 2.50% |
| CRYPTO_PURCHASE | 0.0100 | 1.00% |

Formula:

```text
Fee = Amount × Rate
```

Example:

```text
1000.00 × 0.0015 = 1.50
```

---

## Ledger Design

TigerBeetle is used as the financial ledger.

The application initializes two system accounts:

| Account | Purpose |
|---|---|
| CUSTOMER_LIABILITY_POOL | Represents customer funds |
| PLATFORM_FEE_REVENUE | Represents platform fee revenue |

Fee recording moves value from the customer liability pool into the platform fee revenue account.

---

## Restate Workflow

The workflow service exposes:

```text
FeeRecordingWorkflow
```

Responsibilities:

- Receive fee recording command
- Execute TigerBeetle ledger transfer
- Retry safely on failure
- Preserve durable workflow execution
- Prevent unsafe duplicate side effects

---

## Idempotency

The API requires an `idempotency-key` header.

When the same request is submitted again with the same key, the application returns the previous response instead of recalculating and re-recording the fee.

---

## Testing

Run tests locally:

```bash
./gradlew test
```

Expected result:

```text
BUILD SUCCESSFUL
```

---

## Useful Docker Commands

View running containers:

```bash
docker ps
```

View logs:

```bash
docker compose logs -f
```

View API logs:

```bash
docker logs -f cashi-api
```

View workflow logs:

```bash
docker logs -f cashi-workflow
```

Stop services:

```bash
docker compose down
```

Stop services and remove volumes:

```bash
docker compose down -v
```

---

## Troubleshooting

### Workflow not found

Register the workflow again:

```bash
curl -X POST http://localhost:9070/deployments \
  -H "Content-Type: application/json" \
  -d '{"uri":"http://cashi-workflow:9080"}'
```

---

### TigerBeetle connection issue

Check that the TigerBeetle container is running:

```bash
docker ps
```

Expected container:

```text
cashi-tigerbeetle
```

---

### API not reachable

Check that the API container is running:

```bash
docker logs -f cashi-api
```

The API should respond on:

```text
http://localhost:8081
```

---

## Design Decisions

### Why Restate?

Restate is used to make the fee recording workflow durable. It helps with retries, failure recovery, and safe execution of side effects.

### Why TigerBeetle?

TigerBeetle is designed for financial ledger workloads. It provides fast, atomic, double-entry ledger operations.

### Why not use PostgreSQL as the ledger?

PostgreSQL is better suited for business records, reporting, search, and historical views.

TigerBeetle is better suited for ledger correctness and financial movement tracking.

In a production system, both would usually exist:

```text
PostgreSQL  -> Business history and reporting
TigerBeetle -> Financial ledger source of truth
Restate     -> Durable workflow execution
```

---

## Assumptions

- USD is the primary supported asset.
- Fee rates are statically configured.
- The `idempotency-key` header is required.
- TigerBeetle stores ledger movements.
- Restate handles durable workflow execution.
- Transaction history persistence is outside the current scope.