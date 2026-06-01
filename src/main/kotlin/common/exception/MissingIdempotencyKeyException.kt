package common.exception

class MissingIdempotencyKeyException : RuntimeException("missing idempotency-key header")