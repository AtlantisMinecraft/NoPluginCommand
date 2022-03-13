package net.atlantis.noplugincommand

object IgnoreCommands {
    private val commands: List<String> = listOf(
        "?",
        "pl",
        "about",
        "version",
        "ver",
        "plugins",
        "bukkit:?",
        "bukkit:pl",
        "bukkit:about",
        "bukkit:version",
        "bukkit:ver",
        "bukkit:plugins",
        "minecraft:pl",
        "minecraft:plugins",
        "minecraft:about",
        "minecraft:version",
        "minecraft:ver"
    )

    fun isIgnored(command: String?): Boolean {
        command ?: return false
        return commands.contains(command)
    }
}