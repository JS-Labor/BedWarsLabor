//Class by Joel Schaller made at 18:30 on 24.08.2020

package ch.joelschaller.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            GameMode gameMode = player.getGameMode();
            if (args.length == 0) {
                if (!gameMode.equals(GameMode.CREATIVE)) {
                    player.setGameMode(GameMode.CREATIVE);
                } else {
                    player.setGameMode(GameMode.SURVIVAL);
                }
            } else {
                if (args[0].equalsIgnoreCase("0")) {
                    gameMode = GameMode.SURVIVAL;
                    player.setGameMode(gameMode);
                } else if (args[0].equalsIgnoreCase("1")) {
                    gameMode = GameMode.CREATIVE;
                    player.setGameMode(gameMode);
                } else if (args[0].equalsIgnoreCase("2")) {
                    gameMode = GameMode.ADVENTURE;
                    player.setGameMode(gameMode);
                } else if (args[0].equalsIgnoreCase("3")) {
                    gameMode = GameMode.SPECTATOR;
                    player.setGameMode(gameMode);
                } else {
                    player.sendMessage(ChatColor.RED + "please use /gm (0-3)");
                }
            }
        } else {
            sender.sendMessage(ChatColor.RED + "You must be a Player to execute this command!");
        }
        return false;
    }
}
