object Dependencies {
    object Kotlin {
        val version = "1.4.10"
        val classpath = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
    }

    object Spigot {
        val version = "1.16.5-R0.1-SNAPSHOT"
        val api = "org.spigotmc:spigot-api:$version"
        val annotations = "org.spigotmc:plugin-annotations:1.2.3-SNAPSHOT"
        val repository = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/"
    }

    object Paper {
        val version = "1.16.5-R0.1-SNAPSHOT"
        val api = "com.destroystokyo.paper:paper-api:$version"
        val repository = "https://papermc.io/repo/repository/maven-public/"
    }
}