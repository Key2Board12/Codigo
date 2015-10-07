package plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class SetArmadura extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){

		Player p = e.getPlayer();

		//Obtenemos el inventario del jugador
		//variable de tipo PlayerInventory de nombre inv

		PlayerInventory inv = p.getInventory();

		//creamos un espada de diamante
		//una variable de tipo 	ItemStack de nombre espada
		ItemStack espadas = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta espadasMeta = espadas.getItemMeta();
		espadasMeta.setDisplayName(ChatColor.YELLOW + "Espada Epica");
		espadas.setItemMeta(espadasMeta);
		espadas.addEnchantment(Enchantment.DAMAGE_ALL, 5);
		inv.addItem(espadas);

		
		
		//PECHERA
		ItemStack pechera = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta pecheraMeta = pechera.getItemMeta();
		pecheraMeta.setDisplayName(ChatColor.BLUE + "Pechera Legendaria " + p.getName());
		pechera.setItemMeta(pecheraMeta);
		pechera.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		inv.setChestplate(pechera);
		
		ItemStack casco = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta cascoMeta = casco.getItemMeta();
		cascoMeta.setDisplayName(ChatColor.GREEN + "Casco Legendaria " + p.getName());
		casco.setItemMeta(cascoMeta);
		casco.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		inv.setHelmet(casco);
		
		ItemStack pantalones= new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta pantalonesMeta = pantalones.getItemMeta();
		pantalonesMeta.setDisplayName(ChatColor.RED + "Pantalones Legendarias " + p.getName());
		pantalones.setItemMeta(pantalonesMeta);
		pantalones.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		inv.setLeggings(pantalones);
		
		ItemStack botas= new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta botasMeta = botas.getItemMeta();
		botasMeta.setDisplayName(ChatColor.DARK_AQUA + "Botas Legendarias " + p.getName());
		botas.setItemMeta(botasMeta);
		botas.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		inv.setBoots(botas);


	}



























}
