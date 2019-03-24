package me.starboy.files.Commands;

import me.starboy.files.Utils.Color;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Rewards implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args){
        if(cmd.equalsIgnoreCase("quests")) {


            if(args.length == 0) {
                sender.sendMessage(Color.add("&CInvalid Command please use /rewards open"));
                return true;
            } else {
                if(args[0].equalsIgnoreCase("open")) {



                }

            }





            if(!(sender instanceof Player)) {
                sender.sendMessage(Color.add("Does not work"));
                return true;
            }

            Player player = (Player) sender;

            Inventory inventory = Bukkit.createInventory(null, 54,Color.add("&C&LRewards"));

            player.openInventory(inventory);


        }
        return true;
        }
    }

