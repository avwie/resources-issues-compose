group = "nl.avwie.resourcestest"

allprojects {
    version = "0.0.1-SNAPSHOT"

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

subprojects {
    val subGroup = path.replace(':', '.').replace('-', '_')
    group = "${rootProject.group}$subGroup"
}

plugins {
    @Suppress("DSL_SCOPE_VIOLATION")
    kotlin("multiplatform").version(libs.versions.jetbrains.kotlin).apply(false)

    @Suppress("DSL_SCOPE_VIOLATION")
    id("org.jetbrains.compose").version(libs.versions.jetbrains.compose).apply(false)
}