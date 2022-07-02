package com.mc.plugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerLoginEvent;

public class LoginListener implements Listener {

    @EventHandler
    public void onLogin(PlayerLoginEvent playerLoginEvent){
        System.out.println(playerLoginEvent);
    }

    @EventHandler
    public void blockBreakEvent(BlockBreakEvent blockBreakEvent){
        System.out.println("Block Broken!");
    }
}
