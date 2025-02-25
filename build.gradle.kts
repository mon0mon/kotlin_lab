plugins {
    kotlin("jvm") version "2.0.0"
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

dependencies {
    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core-jvm
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
