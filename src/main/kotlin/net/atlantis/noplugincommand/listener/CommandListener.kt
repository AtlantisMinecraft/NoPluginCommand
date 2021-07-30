package net.atlantis.noplugincommand.listener

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerCommandPreprocessEvent

class CommandListener : Listener {
    @EventHandler
    fun onCommandUse(event: PlayerCommandPreprocessEvent) {
        val player = event.player
        val commands: List<String> = listOf(
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

        val command = event.message.split(" ").firstOrNull()?.replace("/", "")
        if (commands.contains(command)) {
            player.sendMessage("${ChatColor.RED}You're not allowed to do this!")
            event.isCancelled = true
        }
    }
}