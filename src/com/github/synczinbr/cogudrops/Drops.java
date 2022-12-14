package com.github.synczinbr.cogudrops;

import java.io.File;
import java.nio.charset.Charset;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.synczinbr.cogudrops.outros.Listeners;
import com.github.synczinbr.cogudrops.utils.Log;
import com.google.common.io.Resources;

import net.md_5.bungee.api.ChatColor;

public class Drops extends JavaPlugin {
	
	PluginDescriptionFile pdf = this.getDescription();
	String version = pdf.getVersion();

	public static Drops instance;

	public void onEnable() {
		
		saveDefaultConfig();
		try {
			File file = new File(getDataFolder() + File.separator, "config.yml");
			String allText = Resources.toString(file.toURI().toURL(), Charset.forName("UTF-8"));
			getConfig().loadFromString(allText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		(Drops.instance = this).saveDefaultConfig();
		
		getLogger().info("");
		Log.authorAscii();
		getLogger().info("");
		Log.info("Utilizando a versão " + version + " do plugin.");
		commandRegister();
		Log.success("Ligado.");
		Log.clean("Acesse meu portfólio em " + ChatColor.AQUA + "https://github.com/synczinbr");
		
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		
		}
	
	
	
	public void commandRegister() {
		if(instance.getConfig().getBoolean("comandos.desativar") != true) {
			getCommand("cogudrops").setExecutor(new InfoComando());
		} else {
			Log.warn("O comando " + ChatColor.RED + "/cogudrops " + ChatColor.WHITE + "foi desativado na " + ChatColor.RED + "config.yml" + ChatColor.YELLOW + ".");
		}
	}

	public void onDisable() {
	}
	
	public static Drops getInstance() {
		return Drops.instance;
	}

	public static Drops getPlugin() {
		return getPlugin(Drops.class);
	}
	
	public String getPluginVersion() {
		return pdf.getVersion();
	}

}
