package com.github.synczinbr.cogudrops.outros;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import com.github.synczinbr.cogudrops.Drops;

public class Listeners implements Listener {
	
	private boolean useActionbar = Drops.getInstance().getConfig().getBoolean("actionbar.use");	
	private String actionbarMessage = Drops.getInstance().getConfig().getString("actionbar.msg").replace("&", "§");
	
	@EventHandler
	public void onRedMushroom(BlockBreakEvent e) {
	    Block block = e.getBlock();
	    if (block.getType() == Material.RED_MUSHROOM) {
	        e.setCancelled(true);
	        do {
	            block.setType(Material.AIR);
	        } while (block.getType() == Material.RED_MUSHROOM);
	        e.getPlayer().getInventory().addItem(new ItemStack(Material.RED_MUSHROOM));
	        
	        if(useActionbar == true) {
	        	ActionBarAPI.sendActionBarMessage(e.getPlayer(), actionbarMessage);
	        }       
	}
	}
	
	@EventHandler
	public void onBrownMushroom(BlockBreakEvent e) {
	    Block block = e.getBlock();
	    if (block.getType() == Material.BROWN_MUSHROOM) {
	        e.setCancelled(true);
	        do {
	            block.setType(Material.AIR);
	        } while (block.getType() == Material.BROWN_MUSHROOM);
	        e.getPlayer().getInventory().addItem(new ItemStack(Material.BROWN_MUSHROOM));
	        
	        if(useActionbar == true) {
	        	ActionBarAPI.sendActionBarMessage(e.getPlayer(), actionbarMessage);
	        }
	    }
	}
}