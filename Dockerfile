FROM gradle:9.1-jdk21 AS build
WORKDIR /app
COPY . .
RUN gradle clean installDist --no-daemon

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/build/install/ledger /app
CMD ["/app/bin/ledger"]