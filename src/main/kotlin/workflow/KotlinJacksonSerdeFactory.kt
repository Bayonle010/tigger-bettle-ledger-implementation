package com.cashi.workflow

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import dev.restate.serde.jackson.JacksonSerdeFactory

class KotlinJacksonSerdeFactory : JacksonSerdeFactory(
    ObjectMapper()
        .registerKotlinModule()
        .registerModule(JavaTimeModule())
)