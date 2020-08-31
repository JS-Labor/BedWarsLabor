//Class by Joel Schaller made at 18:53 on 22.08.2020

package ch.queksy.classes;

import ch.queksy.commands.GamemodeCommand;
import ch.queksy.gadgets.FirechargeGadget.InteractListener;
import ch.queksy.gadgets.FirechargeGadget.FirechargeGadget;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class BedwarsLaborMain extends JavaPlugin implements Listener {

    private static BedwarsLaborMain plugin;

    public static BedwarsLaborMain getPlugin() {
        return plugin;
    }

    public void onEnable() {

        plugin = this;

        loadConfiguration();

        getCommand("gm").setExecutor(new GamemodeCommand());

        Bukkit.getPluginManager().registerEvents(new InteractListener(), this);
        for (Player players : Bukkit.getOnlinePlayers()) {
            players.getInventory().addItem(new FirechargeGadget());
        }
    }

    public void onDisable() {


    }

    public void loadConfiguration() {
        //See "Creating you're defaults"
        plugin.getConfig().options().copyDefaults(true);
        plugin.saveConfig();
    }
}
