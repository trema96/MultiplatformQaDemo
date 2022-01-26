include(":shared")
include(":jvmApp")

plugins {
    kotlin("jvm").version("1.6.10") apply false
    kotlin("multiplatform").version("1.6.10") apply false
    id("org.jlleitschuh.gradle.ktlint").version("10.0.0") apply false
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
