package com.cashi

import com.cashi.configureRouting
import com.cashi.configureSerialization
import com.cashi.configureStatusPages
import io.ktor.server.application.Application

fun Application.module() {
    configureSerialization()
    configureStatusPages()
    configureRouting()
}