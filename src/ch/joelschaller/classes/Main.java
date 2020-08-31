//Class by Joel Schaller made at 18:53 on 22.08.2020

package ch.joelschaller.classes;

import ch.joelschaller.commands.GamemodeCommand;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    public void onEnable() {

        plugin = this;

        getCommand("gm").setExecutor(new GamemodeCommand());
    }

    public void onDisable() {


    }


    private static Main plugin;

    public static Main getPlugin() {
        return plugin;
    }
}
