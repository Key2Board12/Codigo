package plugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class HolaMundo extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		
		Player p = e.getPlayer();
	
		//variable de tipo String de nombre x
		String x = p.getName();
		String mensaje = "que tal, vamos a jugar ";
		ChatColor color = ChatColor. BLUE;
		ChatColor color2 = ChatColor.YELLOW;
		
		
		String mensaje1 = "Estas ";
		ChatColor color3 = ChatColor.YELLOW; 
		String mensaje2 = "Bien? ";
		ChatColor color4 = ChatColor.GOLD;
		String mensaje3 = "Espero ";
		ChatColor color5 = ChatColor.GREEN;
		String mensaje4 = "Que ";
		ChatColor color6 = ChatColor.DARK_RED;
		String mensaje5 = "Si ";
		ChatColor color7= ChatColor.MAGIC;
		
		getServer().broadcastMessage(color + mensaje + color2 + x + mensaje1 + color3 +
				mensaje2 + color4 + mensaje3 + color5 + mensaje4 + color6 + mensaje5 + color7 + x);
		
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
