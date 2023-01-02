package com.github.synczinbr.cogudrops.utils;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import com.github.synczinbr.cogudrops.Drops;

import net.md_5.bungee.api.ChatColor;


public class Log {
	private static final CommandSender console;
	
	static {
		console = Bukkit.getConsoleSender();
	}
	
	Plugin instance = Drops.instance;
	private static String $plugin_name_prefix = "[CoguDrops] "; // sempre deixar um espçao no final . NAO ESQUECER !!!

	public static void clean(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncPlugins] " + $plugin_name_prefix + ChatColor.WHITE + "" + message);
	}
	
	public static void info(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncPlugins] " + $plugin_name_prefix + ChatColor.AQUA + "[INFO] " + ChatColor.WHITE + "" + message);
	}
	
	public static void success(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncPlugins] " + $plugin_name_prefix + ChatColor.GREEN + "[SUCESSO] " + ChatColor.WHITE + "" + message);
	}
	
	public static void warn(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncPlugins] " + $plugin_name_prefix + ChatColor.YELLOW + "[WARN] " + ChatColor.WHITE + "" + message);
	}
	
	public static void error(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncPlugins] " + $plugin_name_prefix + ChatColor.RED + "[ERROR] " + ChatColor.WHITE + "" + message);
	}
	
	public static void fatal(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncPlugins] " + $plugin_name_prefix + ChatColor.DARK_RED + "[FATAL] " + ChatColor.WHITE + "" + message);
	}
	
	public static void enable() {
		console.sendMessage(ChatColor.AQUA + "  _________.__. ____   ____ ");
		console.sendMessage(ChatColor.AQUA + " /  ___<   |  |/    \\_/ ___\\ " + " " + ChatColor.RED + "   _  _");
		console.sendMessage(ChatColor.AQUA + " \\___ \\ \\___  |   |  \\  \\___ " + " " + ChatColor.RED + "  ( `' )" + ChatColor.YELLOW + "  - obrigado por");
		console.sendMessage(ChatColor.AQUA + "/____  >/ ____|___|  /\\___  >" + " " + ChatColor.RED + "   `.,'" + ChatColor.YELLOW + "  usar meus plugins");
		console.sendMessage(ChatColor.AQUA + "     \\/ \\/         \\/     \\/ " + ChatColor.GRAY + "  * www.github.com/synczinbr");	
	}
}




// -=> oi, se vc decompilou esse plugin, oia q easter egg bonitinho:
//
//    \    /\
//     )  ( ') - <(miau, galerinha)
//    (  /  )  "black cats
//     \(__)|   aren't bad luck."
//
// ------> https://github.com/synczinbr  (fala cmg pra ver como melhoro meu obfuscator)
	
