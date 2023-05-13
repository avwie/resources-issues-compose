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
            @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
            implementation(compose.components.resources)
        }
    }

    sourceSets["jvmMain"].dependencies {
        implementation(compose.desktop.currentOs)
    }
}