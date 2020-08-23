//Class by Joel Schaller made at 21:40 on 22.08.2020

package ch.queksy.gadgets.TNTBallGadget;

import ch.queksy.utils.itemBuilder.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class TNTBallGadget extends ItemStack {

    private static String name = ChatColor.GOLD + "TNTBall";

    public static String getName() {
        return name;
    }

    public TNTBallGadget() {

        super(new ItemBuilder(Material.FIREBALL).setDisplayName(name).setLore("Use this Gadget to shoot like a Ghast!").build());
    }
}
