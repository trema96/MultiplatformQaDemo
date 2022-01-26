plugins {
    kotlin("multiplatform").version("1.6.10")
    id("org.danilopianini.gradle-kotlin-qa").version("0.9.0")
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
}
