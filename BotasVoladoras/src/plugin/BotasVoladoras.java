package plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class BotasVoladoras extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onPlayerMoves(PlayerMoveEvent e){

		Player p = e.getPlayer();

		//	Obtener el inventario
		PlayerInventory inv = p.getInventory();

		//Crear una variable con botas
		ItemStack botas = inv.getBoots();

		//Comprobar si la variable de botas es no null
		if(botas != null){
			// si el nombre de las botas contiene "Botas Legendarias "
			//guardarme el dysplayname de las botas en una variable de tipo string
			ItemMeta botasMeta = botas.getItemMeta();
			String nombre = botasMeta.getDisplayName();
			if(nombre != null){
				if (nombre.contains("Botas Legendarias ")) {
					p.setAllowFlight(true);
					return;
				}
			}
		}
		p.setAllowFlight(false);
	}































}



