package me.starboy.files.Commands;

import me.starboy.files.Utils.Color;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.nio.Buffer;

public class Transfer implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {
        if(cmd.equalsIgnoreCase("eco")) {
            if(args.length == 0) {     //if the player only use /eco it will say the command is /eco transfer
                sender.sendMessage(Color.add("&CNot enough arguments please use /eco transfer open"));
                return true;
            } else {
                if(args[0].equalsIgnoreCase("transfer")) {


                }
            }

            if(args.length == 1) {
                sender.sendMessage(Color.add("&CNot enough arguments use /eco transfer open"));
                return true;
            } else {
                if(args[1].equalsIgnoreCase("open")) {

                }
            }

            if(!(sender instanceof Player)) {
                sender.sendMessage("Does not work");
                return true;
            }

            Player player = (Player) sender;

            Inventory transfer = Bukkit.createInventory(null,54,Color.add("&B&LTransfer"));
            player.openInventory(transfer);

            }
        return true;







    }
}
