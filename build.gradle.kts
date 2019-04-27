import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.31"
    application
    id("org.openjfx.javafxplugin") version "0.0.7"
}

group = "br.net"
version = "1.0-SNAPSHOT"

javafx {
    version = "12.0.1"
    modules = listOf("javafx.controls", "javafx.fxml", "javafx.web")
}

application {
    mainClassName = "br.neto.javafxpot.MainAppKt"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.2.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-javafx:1.2.1")

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

