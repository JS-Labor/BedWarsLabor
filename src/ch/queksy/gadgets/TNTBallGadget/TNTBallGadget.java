//Class by Joel Schaller made at 21:40 on 22.08.2020

package ch.queksy.gadgets.TNTBallGadget;

import ch.queksy.utils.itemBuilder.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class TNTBallGadget extends ItemStack {

    private ItemMeta fireballMeta = null;
    ArrayList<String> fireballLore = new ArrayList<String>();

    public TNTBallGadget() {

        super(Material.FIREBALL, 1);
        fireballMeta = getItemMeta();
        create();
    }

    public void create() {

        fireballMeta.setDisplayName(ChatColor.GOLD + "TNTBall");

        fireballLore.add(ChatColor.GREEN + "Use this Ball to shoot like a Ghast!");
        fireballMeta.setLore(fireballLore);

        setItemMeta(fireballMeta);
    }


}
