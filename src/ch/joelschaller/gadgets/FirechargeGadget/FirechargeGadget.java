//Class by Joel Schaller made at 21:40 on 22.08.2020

package ch.joelschaller.gadgets.FirechargeGadget;

import ch.joelschaller.utils.itemBuilder.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class FirechargeGadget extends ItemStack {

    private static String name = ChatColor.GOLD + "TNTBall";

    public static String getName() {
        return name;
    }

    public FirechargeGadget() {

        super(new ItemBuilder(Material.FIREBALL).setDisplayName(name).setLore("Use this Gadget to shoot like a Ghast!").build());
    }
}
