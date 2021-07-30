package net.atlantis.noplugincommand

import net.atlantis.noplugincommand.ext.registerListener
import net.atlantis.noplugincommand.listener.CommandListener
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.plugin.java.annotation.plugin.ApiVersion
import org.bukkit.plugin.java.annotation.plugin.Plugin
import org.bukkit.plugin.java.annotation.plugin.author.Author

@Plugin(name = "NoPluginCommand", version = "1.0-SNAPSHOT")
@Author("ReyADayer")
@ApiVersion(ApiVersion.Target.v1_15)
class NoPluginCommand : JavaPlugin() {
    override fun onEnable() {
        registerListener(CommandListener())
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}