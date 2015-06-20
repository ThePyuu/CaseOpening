package de.pyuu.csop.listener;

import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

import de.pyuu.csop.Main;
import de.pyuu.csop.api.FlyingItems;
import de.pyuu.csop.methoden.Items;

public class cso implements CommandExecutor {
	
	Integer counter;
	Integer counter1;
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("cso")) {
			if(args.length == 0) {
				p.sendMessage("§c§lGebe noch eine Zahl an.");
			}
			if(args.length == 1) {
				try {	
					String Time = args[0];
					int time = Integer.parseInt(Time);
					
					String Timer = args[0];
					int timer = Integer.parseInt(Timer);
					
					count(time, p);
					countest(timer, p);
				} catch(NumberFormatException e) {
					p.sendMessage("§c§lGebe noch eine Zahl an.");
				}
			}
		}
		
		return false;
	}
	private void countest(final int i, Player p) {
		
		counter1 = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {
			int timer = i + 1;
			@Override
			public void run() {
				timer--;
				if(timer != 0) {
				 World world = p.getWorld();
	                List<Entity> entList = world.getEntities();
	               
	                for(Entity current : entList){
	                    if (current instanceof Item){
	                        current.remove();
	                    }
	                }
				} else {
				Bukkit.getScheduler().cancelTask(counter1);
				p.sendMessage("§a§lErfolgreich geöffnet!");
				Main.sperre.remove(p.getName());
			}
			}
			
		}, 10L, 15L);
		
	}
	
	private void count(final int i, Player p) {
	
		
		Location loc = p.getLocation().add(3, 0, 0);
		
		FlyingItems fly = new FlyingItems();
		fly.setLocation(loc);
		fly.setHeight(1.3D);
		fly.setMaterial(Material.DIAMOND_BLOCK);
		fly.setText("§b§lLegendär");
		
		FlyingItems fly2 = new FlyingItems();
		fly2.setLocation(loc);
		fly2.setHeight(1.3D);
		fly2.setMaterial(Material.GOLD_BLOCK);
		fly2.setText("§e§lMittel");
		
		FlyingItems fly3 = new FlyingItems();
		fly3.setLocation(loc);
		fly3.setHeight(1.3D);
		fly3.setMaterial(Material.EMERALD_BLOCK);
		fly3.setText("§7§lGut");
		
		FlyingItems fly4 = new FlyingItems();
		fly4.setLocation(loc);
		fly4.setHeight(1.3D);
		fly4.setMaterial(Material.IRON_BLOCK);
		fly4.setText("§b§lSchlecht");
		
		FlyingItems fly5 = new FlyingItems();
		fly5.setLocation(loc);
		fly5.setHeight(1.3D);
		fly5.setMaterial(Material.REDSTONE_BLOCK);
		fly5.setText("§5§lULTRA");
		
		FlyingItems fly6 = new FlyingItems();
		fly6.setLocation(loc);
		fly6.setHeight(1.3D);
		fly6.setMaterial(Material.IRON_BLOCK);
		fly6.setText("§b§lSchlecht");
		

		
		
		counter = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {
			int time = i + 1;
			@Override
			public void run() {
				time--;
				if(time != 0) {
					p.getLocation().getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
					p.setLevel(time);
					
						Random r = new Random();
						int zufall = r.nextInt(14);	
						switch(zufall) {
						case 0:
							fly.spawn();
							break;
						case 1:
							fly6.spawn();
							break;
						case 2:
							fly3.spawn();
							break;
						case 3:
							fly4.spawn();
							break;
						case 4:
							fly5.spawn();
							break;
						case 5:
							fly6.spawn();
							break;
						case 6:
							fly4.spawn();
							break;
						case 7:
							fly6.spawn();
							break;
						case 8:
							fly4.spawn();
							break;
						case 9:
							fly3.spawn();
							break;
						case 10:
							fly2.spawn();
							break;
						case 11:
							fly4.spawn();
							break;
						case 12:
							fly4.spawn();
							break;
						case 13:
							fly6.spawn();
							break;
						}
						
				} else {
					
					Bukkit.getScheduler().cancelTask(counter);
					p.getLocation().getWorld().playSound(p.getLocation(), Sound.ZOMBIE_WOODBREAK, 1.0F, 1.0F);
					Random r1 = new Random();
					int zufall1 = r1.nextInt(10);	
					switch(zufall1) {
					case 0:
						p.sendMessage("§a§lDu hast ein(e) §b§lDiamant Schwert §a§lgezogen.");
						p.sendMessage("§e§lHerzlichen Glückwunsch!");
						Items.setdiasword(p);
						break;
					case 1:
						p.sendMessage("§a§lDu hast ein(e) §e§lHolz Schwert §a§lgezogen.");
						p.sendMessage("§e§lHerzlichen Glückwunsch!");
						Items.setwoodsword(p);
						break;
					case 2:
						p.sendMessage("§a§lDu hast ein(e) §3§lLeder Helm §a§lgezogen.");
						p.sendMessage("§e§lHerzlichen Glückwunsch!");
						Items.setlederhelm(p);
						break;
					case 3:
						p.sendMessage("§a§lDu hast ein(e) §e§lGoldene Schaufel §a§lgezogen.");
						p.sendMessage("§e§lHerzlichen Glückwunsch!");
						Items.setgoldschaufel(p);
						break;

					case 4:
						p.sendMessage("§a§lDu hast ein(e) §b§lDiamant Schuhe §a§lgezogen.");
						p.sendMessage("§e§lHerzlichen Glückwunsch!");
						Items.setdiaboots(p);
						break;
					case 5:
						p.sendMessage("§a§lDu hast ein(e) §3§lEisen Brustplatte §a§lgezogen.");
						p.sendMessage("§e§lHerzlichen Glückwunsch!");
						Items.setironchest(p);
						break;
					case 6:
						p.sendMessage("§a§lDu hast ein(e) §3§lLeder Helm §a§lgezogen.");
						p.sendMessage("§e§lHerzlichen Glückwunsch!");
						Items.setlederhelm(p);
						break;
					case 7:
						p.sendMessage("§a§lDu hast ein(e) §3§lLeder Brustplatte §a§lgezogen.");
						p.sendMessage("§e§lHerzlichen Glückwunsch!");
						Items.setlederbrustplatte(p);
						break;
					case 8:
						p.sendMessage("§a§lDu hast ein(e) §3§lLeder Brustplatte §a§lgezogen.");
						p.sendMessage("§e§lHerzlichen Glückwunsch!");
						Items.setlederbrustplatte(p);
						break;
					case 9:
						p.sendMessage("§a§lDu hast ein(e) §3§lLeder Helm §a§lgezogen.");
						p.sendMessage("§e§lHerzlichen Glückwunsch!");
						Items.setlederhelm(p);
						break;
					}
				}
			}
			
		}, 0L, 15L);
	}
}