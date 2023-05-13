plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    js(IR) {
        browser()
    }
    jvm()

    sourceSets["commonMain"].dependencies {
        dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(project(":icons"))
        }
    }

    sourceSets["jvmMain"].dependencies {
        implementation(compose.desktop.currentOs)
    }
}