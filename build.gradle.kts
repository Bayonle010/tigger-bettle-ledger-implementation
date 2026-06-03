
plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(ktorLibs.plugins.ktor)
    alias(libs.plugins.kotlin.serialization)
    id("org.jetbrains.kotlin.kapt") version "2.3.21"
}

group = "com.cashi"
version = "1.0.0-SNAPSHOT"

application {
    mainClass = "io.ktor.server.netty.EngineMain"
}

kotlin {
    jvmToolchain(21)
}
dependencies {
    implementation(ktorLibs.serialization.kotlinx.json)
    implementation(ktorLibs.server.callLogging)
    implementation(ktorLibs.server.config.yaml)
    implementation(ktorLibs.server.contentNegotiation)
    implementation(ktorLibs.server.core)
    implementation(ktorLibs.server.netty)
    implementation(ktorLibs.server.statusPages)
    implementation(libs.logback.classic)
    implementation(libs.tigerbeetle.java)
    implementation("io.insert-koin:koin-ktor:4.1.0")
    implementation("io.insert-koin:koin-logger-slf4j:4.1.0")

    kapt("dev.restate:sdk-api-gen:2.4.1")
    implementation("dev.restate:sdk-java-http:2.4.1")

    implementation("io.ktor:ktor-client-core:3.5.0")
    implementation("io.ktor:ktor-client-cio:3.5.0")
    implementation("io.ktor:ktor-client-content-negotiation:3.5.0")
    implementation("io.ktor:ktor-serialization-kotlinx-json:3.5.0")

    testImplementation(kotlin("test"))
    testImplementation(ktorLibs.server.testHost)

    testImplementation("io.kotest:kotest-runner-junit5:5.9.1")
    testImplementation("io.kotest:kotest-assertions-core:5.9.1")
    testImplementation("io.mockk:mockk:1.14.6")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

tasks.register<JavaExec>("runRestate") {
    group = "application"
    description = "Runs the Restate workflow service"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.cashi.workflow.RestateApplicationKt")
}
