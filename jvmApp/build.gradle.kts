plugins {
    kotlin("jvm")
    id("org.jlleitschuh.gradle.ktlint")
    application
}

dependencies {
    implementation(project(":shared"))
}

application {
    mainClass.set("MainKt")
}