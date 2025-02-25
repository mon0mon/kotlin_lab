package config

import ch.qos.logback.classic.pattern.ClassicConverter
import ch.qos.logback.classic.spi.ILoggingEvent
import java.lang.management.ManagementFactory

class ProcessIdConverter: ClassicConverter() {

    companion object {
        private val PROCESS_ID = ManagementFactory.getRuntimeMXBean().pid
    }

    override fun convert(event: ILoggingEvent?): String {
        return PROCESS_ID.toString()
    }

}
