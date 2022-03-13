object Dependencies {
    object Kotlin {
        val version = "1.6.10"
        val classpath = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
    }

    object Spigot {
        val version = "1.18.1-R0.1-SNAPSHOT"
        val api = "org.spigotmc:spigot-api:$version"
        val annotations = "org.spigotmc:plugin-annotations:1.2.3-SNAPSHOT"
        val repository = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/"
    }

    object Paper {
        val version = "1.18.1-R0.1-SNAPSHOT"
        val api = "io.papermc.paper:paper-api:$version"
        val repository = "https://papermc.io/repo/repository/maven-public/"
    }

    object JUnit {
        val core = "org.junit.jupiter:junit-jupiter:5.8.2"
    }

    object ShadowJar {
        val version = "7.1.2"
        val id = "com.github.johnrengelman.shadow"
    }
}