plugins {
    kotlin("multiplatform")
    id("org.jlleitschuh.gradle.ktlint")
}

kotlin {
    jvm {
        withJava()

        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }

    js {
        browser {
            binaries.executable()
        }
    }

    linuxX64()

    sourceSets {
        val commonMain by getting
        val jvmMain by getting
        val jsMain by getting
        val linuxX64Main by getting
    }
}
