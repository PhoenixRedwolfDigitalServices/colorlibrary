import com.varabyte.kobweb.gradle.library.util.configAsKobwebLibrary

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.library)
    `maven-publish`
}

group = "com.phoenixredwolfdigitalservices.colorlibrary"
version = "0.0.1"

kotlin {
    configAsKobwebLibrary(includeServer = false)

    @Suppress("UNUSED_VARIABLE")
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk.core)
            }
        }
    }
}

publishing {
    publications {
        register("mavenJsLibrary", MavenPublication::class) {
            from(components["kotlin"])
            groupId = "com.github.phoenixredwolfdigitalservices"
            artifactId = "ColorLibrary"
            version = "0.0.1"
        }
    }
}
