//Class by Joel Schaller made at 18:53 on 22.08.2020

package ch.queksy.classes;

import ch.queksy.gadgets.FirechargeGadget.InteractListener;
import ch.queksy.gadgets.FirechargeGadget.FirechargeGadget;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class BedwarsLaborMain extends JavaPlugin implements Listener {

    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new InteractListener(), this);
        for (Player players : Bukkit.getOnlinePlayers()) {
            players.getInventory().addItem(new FirechargeGadget());
        }
    }

    public void onDisable() {


    }
}
