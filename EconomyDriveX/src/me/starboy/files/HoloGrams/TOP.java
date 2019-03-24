package me.starboy.files.HoloGrams;


import me.starboy.files.Utils.Color;
import me.starboy.files.Utils.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class TOP implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command,String cmd,String[] args) {
        if(cmd.equalsIgnoreCase("leaderboard")) {
            if(args.length == 0) {
                sender.sendMessage(Color.add("&7You mean &A/leaderboard eco set"));
                return true;
            } else {
                if(args[0].equalsIgnoreCase("eco")) {

                }
            }

            if(args.length == 1) {
                sender.sendMessage(Color.add("&7You mean &A/leaderboard eco set"));
                return true;
            } else {
                if(args[1].equalsIgnoreCase("set")) {

                }
            }
            if(!(sender instanceof Player)) {
                sender.sendMessage("Does not work in console");
                return true;
            }



           Player player = (Player) sender;


            Inventory selector = Bukkit.createInventory(null,54,Color.add("&B&LLeaderBoard &F&LSelector"));


            ItemStack TOP = Item.create(Material.REDSTONE_BLOCK,1,"&B&LQuick &F&LSetup","&7This method is only designed for lazy staff!");









            selector.setItem(21,TOP);
            player.openInventory(selector);
        }
        return true;
    }
}
