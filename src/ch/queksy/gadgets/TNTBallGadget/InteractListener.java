//Class by Joel Schaller made at 11:45 on 23.08.2020

package ch.queksy.gadgets.TNTBallGadget;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class InteractListener implements Listener {

    private HashMap<String, Long> cooldown = new HashMap<>();

    @EventHandler
    public void onShoot(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        ItemStack fireballItem = event.getItem();

        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            try {
                if (fireballItem.getItemMeta().getDisplayName().equals(TNTBallGadget.getName())) {
                    if (cooldown.containsKey(player.getName())) {
                        if (System.currentTimeMillis()  - cooldown.get(player.getName()) <= 400) {
                            player.sendMessage(ChatColor.RED + "please don't spam!");
                            return;
                        }
                    }
                    Fireball fireball = (Fireball)  player.launchProjectile(Fireball.class);
                    World world = fireball.getWorld();
                    fireball.setIsIncendiary(true);
                    fireball.setYield(3);
                    if (!player.getGameMode().equals(GameMode.CREATIVE)) {
                        if (fireballItem.getAmount() == 1) {
                            player.getInventory().setItemInHand(new ItemStack(Material.AIR));
                        } else {
                            fireballItem.setAmount(fireballItem.getAmount() - 1);
                            cooldown.put(player.getName(), Long.valueOf(System.currentTimeMillis()));
                        }
                    }
                }
            } catch (Exception e) {

            }
        }
    }
}

