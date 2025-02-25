plugins {
    kotlin("jvm") version "2.0.0"
    kotlin("plugin.serialization") version "2.1.0"
}

group = "xyz.mon0mon"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        version = 21
    }
}

repositories {
    mavenCentral()
}

val kotlinCoroutineVer = "1.10.1"
val retrofitVer = "2.11.0"
val jacksonVer = "2.18.2"

dependencies {
    // kotlin
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutineVer")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-slf4j:$kotlinCoroutineVer")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-debug:$kotlinCoroutineVer")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")

    // network
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.retrofit2:retrofit:$retrofitVer")
    implementation("com.squareup.retrofit2:converter-kotlinx-serialization:$retrofitVer")
//    implementation("com.fasterxml.jackson.core:jackson-core:$jacksonVer")
//    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVer")
//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVer")

    // logging
    implementation("ch.qos.logback:logback-classic:1.5.16")
//    implementation("org.fusesource.jansi:jansi:2.4.1")
    implementation("io.github.oshai:kotlin-logging-jvm:7.0.4")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$kotlinCoroutineVer")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.12.0")
    testImplementation("com.squareup.retrofit2:retrofit-mock:$retrofitVer")
}

tasks.test {
    useJUnitPlatform()
}
