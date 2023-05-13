plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
}

kotlin {
    dependencies {
        implementation(compose.desktop.currentOs)
        implementation(project(":icons"))
    }
}