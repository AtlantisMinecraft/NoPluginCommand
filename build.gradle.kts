plugins {
    java
    kotlin("jvm").version(Dependencies.Kotlin.version)
    kotlin("kapt").version(Dependencies.Kotlin.version)
    id(Dependencies.ShadowJar.id).version(Dependencies.ShadowJar.version).apply(true)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

group = "net.atlantis"
val pluginName = "NoPluginCommand"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
    maven(Dependencies.Spigot.repository)
    maven(Dependencies.Paper.repository)
}

dependencies {
    api(Dependencies.Paper.api)
    compileOnly(Dependencies.Spigot.annotations)
    kapt(Dependencies.Spigot.annotations)
    api(Dependencies.Kotlin.stdlib)
    testImplementation(Dependencies.JUnit.core)
}

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.Kotlin.classpath)
    }
}

tasks {
    shadowJar {
        archiveBaseName.set(pluginName)
        archiveClassifier.set("")
        archiveVersion.set(archiveVersion.get())
        mergeServiceFiles()
        dependencies {
            exclude(dependency(Dependencies.Paper.api))
        }
    }

    withType<Test>().configureEach {
        useJUnitPlatform()
    }
}