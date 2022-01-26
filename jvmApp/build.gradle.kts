plugins {
    kotlin("jvm").version("1.6.10")
    id("org.danilopianini.gradle-kotlin-qa").version("0.9.0")
    application
}

dependencies {
    implementation(project(":shared"))
}

application {
    mainClass.set("MainKt")
}