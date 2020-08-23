//Class by Joel Schaller made at 11:45 on 23.08.2020

package ch.queksy.gadgets.TNTBallGadget;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractListener implements Listener {

    @EventHandler
    public void onShoot(PlayerInteractEvent event) {

        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getItem().getItemMeta().getDisplayName().equals(TNTBallGadget.getName())) {
                event.getPlayer().getLocation().getWorld().spawnEntity(event.getPlayer().getLocation(), EntityType.FIREBALL);
                event.getPlayer().sendMessage("you shot a Fireball");
            }
        }
    }
}
