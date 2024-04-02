import org.gradle.api.tasks.JavaExec
import org.gradle.kotlin.dsl.*

plugins {
    java
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.displee:rs-cache-library:6.8.1")
    implementation("com.google.code.gson:gson:2.8.8")
    implementation("org.bitbucket.akornilov.kotlin:binary-streams:0.33")
    implementation(fileTree("lib") {
        include("*.jar")
    })
    implementation(files("lib/jogamp-fat.jar"))
    implementation(files("lib/dockfx-0.4-SNAPSHOT.jar"))
    implementation("com.google.inject:guice:5.0.1")
    implementation("com.jfoenix:jfoenix:9.0.10")
    implementation("org.jsoup:jsoup:1.14.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
    implementation("org.apache.commons:commons-compress:1.21")
    implementation("javax.media:jmf:2.1.1e")
    implementation("com.dropbox.core:dropbox-core-sdk:6.1.0")
    implementation(fileTree("libs") {
        include("*.jar")
    })
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
}


tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
    archiveBaseName = "shadow"
    archiveClassifier.set("all")
    mergeServiceFiles()
    manifest {
        attributes["Main-Class"] = "RSMapperClient"
    }
}

tasks.register<JavaExec>("run") {
    group = "application"
    mainClass.set("RSMapperClient")
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.register<Jar>("regularJar") {
    archiveBaseName = "regular"
    manifest {
        attributes["Main-Class"] = "RSMapperClient"
    }
    from(sourceSets["main"].output)
}

// Add the following to resolve the compilation errors
tasks.withType<JavaCompile>().configureEach {
    options.compilerArgs.add("-Xlint:unchecked")
    options.compilerArgs.add("-Xlint:deprecation")
}