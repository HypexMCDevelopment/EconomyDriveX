package me.starboy.files;

import me.starboy.files.Commands.Rewards;
import me.starboy.files.Commands.Transfer;
import me.starboy.files.HoloGrams.TOP;
import org.bukkit.entity.NPC;
import org.bukkit.plugin.java.JavaPlugin;

public class MainEconomyDriveX extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Ready for some cash!");
        this.getCommand("eco").setExecutor(new Transfer());
        this.getCommand("quests").setExecutor(new Rewards());
        this.getCommand("leaderboard").setExecutor(new TOP());


    }


    @Override
    public void onDisable() {
        getLogger().info("Banks are shutting down!");
    }
}







