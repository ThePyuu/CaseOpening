package de.pyuu.csop.methoden;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class Items {

	public static void setironchest(Player p) {
		
		ItemStack ironchest = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta ironchestmeta = ironchest.getItemMeta();
		ironchestmeta.setDisplayName("§3§lEisen Brustplatte");
		ironchest.setItemMeta(ironchestmeta);
		
		p.getInventory().addItem(ironchest);
		p.updateInventory();
	}
	public static void setdiaboots(Player p) {
		
		ItemStack diaboots = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta diabootsmeta = diaboots.getItemMeta();
		diabootsmeta.setDisplayName("§b§lDiamant Schuhe");
		diaboots.setItemMeta(diabootsmeta);
		p.getInventory().addItem(diaboots);
		p.updateInventory();
	}
	public static void setlederhelm(Player p) {
		
		ItemStack lederhelm = new ItemStack(Material.LEATHER_HELMET);
		ItemMeta lederhelmmeta = lederhelm.getItemMeta();
		lederhelmmeta.setDisplayName("§3§lLeder Helm");
		lederhelm.setItemMeta(lederhelmmeta);
		p.getInventory().addItem(lederhelm);
		p.updateInventory();
	}
	public static void setlederbrustplatte(Player p) {
		
		ItemStack lederbrust = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemMeta lederbrustmeta = lederbrust.getItemMeta();
		lederbrustmeta.setDisplayName("§3§lLeder Brustplatte");
		lederbrust.setItemMeta(lederbrustmeta);
		p.getInventory().addItem(lederbrust);
		p.updateInventory();
	}
	public static void setgoldschaufel(Player p) {
		
		ItemStack goldspade = new ItemStack(Material.GOLD_SPADE);
		ItemMeta goldspademeta = goldspade.getItemMeta();
		goldspademeta.setDisplayName("§e§lGoldene Schaufel");
		goldspade.setItemMeta(goldspademeta);
		p.getInventory().addItem(goldspade);
		p.updateInventory();
	}
	public static void setdiasword(Player p) {
		
		ItemStack diasword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta diaswordmeta = diasword.getItemMeta();
		diaswordmeta.setDisplayName("§b§lDiamant Schwert");
		diasword.setItemMeta(diaswordmeta);
		p.getInventory().addItem(diasword);
		p.updateInventory();
	}
	public static void setwoodsword(Player p) {
		
		ItemStack woodsword = new ItemStack(Material.WOOD_SWORD);
		ItemMeta woodswordmeta = woodsword.getItemMeta();
		woodswordmeta.setDisplayName("§e§lHolz Schwert");
		woodsword.setItemMeta(woodswordmeta);
		p.getInventory().addItem(woodsword);
		p.updateInventory();
	}
}
