package de.pyuu.csop.listener;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class givekey implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player)sender;
		
		ItemStack key = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta keymeta = key.getItemMeta();
		keymeta.setDisplayName("§e§lCSO Key");
		key.setItemMeta(keymeta);
		
		if(p.hasPermission("cso.give.away")) {
		
		if(cmd.getName().equalsIgnoreCase("csgivekey")) {
			
			for(Player ps : Bukkit.getOnlinePlayers()) {
				ps.getInventory().addItem(key);
			}
			return true;
		}
		}
		return false;
	}
	

}
