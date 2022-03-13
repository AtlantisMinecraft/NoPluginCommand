package net.atlantis.noplugincommand.listener

import net.atlantis.noplugincommand.IgnoreCommands
import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerCommandPreprocessEvent

class CommandListener : Listener {
    @EventHandler
    fun onCommandUse(event: PlayerCommandPreprocessEvent) {
        val player = event.player

        val command = event.message.split(" ").firstOrNull()?.replace("/", "")
        if (IgnoreCommands.isIgnored(command)) {
            player.sendMessage("${ChatColor.RED}You're not allowed to do this!")
            event.isCancelled = true
        }
    }
}