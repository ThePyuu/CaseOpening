package de.pyuu.csop;


import java.util.ArrayList;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import de.pyuu.csop.listener.InteractListener;
import de.pyuu.csop.listener.cso;
import de.pyuu.csop.listener.givekey;

public class Main extends JavaPlugin implements Listener {
	
	public static Plugin pl;
	public static ArrayList<String> sperre = new ArrayList<>();
	
	@Override
	public void onEnable() {
		System.out.println("CaseOpening wurde gestartet.");
	
		pl = this;
		
		this.getServer().getPluginManager().registerEvents(new InteractListener(), this);
		this.getCommand("cso").setExecutor(new cso());
		this.getCommand("csgivekey").setExecutor(new givekey());
		
		super.onEnable();
	}
	@Override
	public void onDisable() {
		pl = null;
		System.out.println("CaseOpening wurde gestoppt.");
		super.onDisable();
	}
	
	public static Plugin getPlugin() {
		return pl;		
	}
	
}
