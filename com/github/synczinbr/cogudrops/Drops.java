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
		mkCfg();
		saveDefaultConfig();
		(Drops.instance = this).saveDefaultConfig();
		Log.enable();
		Log.success("Ligado.");
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		
		}
	

	public void onDisable() {
		Log.info("Desligado.");
	}
	
	public static Drops getInstance() {
		return Drops.instance;
	}

	public static Drops getPlugin() {
		return getPlugin(Drops.class);
	}
	
	public void mkCfg() {
		try {
			File file = new File(getDataFolder() + File.separator, "config.yml");
			String allText = Resources.toString(file.toURI().toURL(), Charset.forName("UTF-8"));
			getConfig().loadFromString(allText);
			Log.info("Carregando configuração.");
		} catch (Exception e) {
			Log.info("Criando arquivo de configuração.");
		}
	}

}
