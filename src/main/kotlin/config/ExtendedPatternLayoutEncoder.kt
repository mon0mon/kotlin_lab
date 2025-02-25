package config

import ch.qos.logback.classic.PatternLayout
import ch.qos.logback.classic.encoder.PatternLayoutEncoder

class ExtendedPatternLayoutEncoder: PatternLayoutEncoder() {
    override fun start() {
        PatternLayout.DEFAULT_CONVERTER_MAP["process_id"] = ProcessIdConverter::class.java.name

        super.start()
    }
}
