package de.pyuu.csop.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;




public class InteractListener implements Listener {
	
	int high = 11;
	int countdown;
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		
		
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(p.getItemInHand().getType().equals(Material.TRIPWIRE_HOOK)) {
				e.setCancelled(true);
				
				if(p.getItemInHand().getAmount() == 1) p.getInventory().remove(p.getItemInHand());
				p.getItemInHand().setAmount(p.getItemInHand().getAmount() -1);
				p.updateInventory();
				p.performCommand("cso 15");
	     	}
		}	
	}
}
