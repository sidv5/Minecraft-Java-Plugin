package com.mc.plugin;

import lombok.extern.java.Log;
import org.bukkit.plugin.java.JavaPlugin;

@Log
public class PluginStarter extends JavaPlugin {

    @Override
    public void onEnable(){

        log.info("5iD - Lives Plugin Started");
        getServer().getPluginManager().registerEvents(new LoginListener(), this);

    }

    @Override
    public void onDisable(){
        log.info("5iD - Lives Plugin Stopped");
    }

}
