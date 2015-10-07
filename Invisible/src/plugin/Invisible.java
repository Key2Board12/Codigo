package plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;

public class Invisible extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	
	
	
	
	@EventHandler
	public void onLeftClick(PlayerInteractEvent evv){
		//crear variable de tipo Player
		Player jugador = evv.getPlayer();
		
		//Comprobar si tienes un palo en la mano
		ItemStack enMano = jugador.getItemInHand();
		if(enMano.getType() == Material.STICK){
			
			//Comprobar si has hecho left click
			if(evv.getAction()== Action.RIGHT_CLICK_BLOCK){
				
				//Variable de tipo PotionEffectType
				PotionEffectType tipo = PotionEffectType.INVISIBILITY;
				
				//cread una variable de potion effect
				PotionEffect miEfecto = new PotionEffect(tipo, 200, 1);
				
				jugador.addPotionEffect(miEfecto);
				
				
				
			}
			
			
			
			
		}
		
	
	
	}
	
	
	
	
	
	
	
}
