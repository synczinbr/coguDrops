package com.github.synczinbr.cogudrops.utils;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import com.github.synczinbr.cogudrops.Drops;

import net.md_5.bungee.api.ChatColor;


public class Log {
	private static final CommandSender console;
	public String version = Drops.getPlugin().getDescription().getVersion();

	static {
		console = Bukkit.getConsoleSender();
	}

	public static void clean(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncCoguDrops] " + ChatColor.WHITE + "" + message);
	}
	
	public static void info(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncCoguDrops] " + ChatColor.AQUA + "[INFO] " + ChatColor.WHITE + "" + message);
	}
	
	public static void success(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncCoguDrops] " + ChatColor.GREEN + "[SUCESSO] " + ChatColor.WHITE + "" + message);
	}
	
	public static void warn(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncCoguDrops] " + ChatColor.YELLOW + "[WARN] " + ChatColor.WHITE + "" + message);
	}
	
	public static void error(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncCoguDrops] " + ChatColor.RED + "[ERROR] " + ChatColor.WHITE + "" + message);
	}
	
	public static void fatal(String message) {
		console.sendMessage(ChatColor.GREEN + "[syncCoguDrops] " + ChatColor.DARK_RED + "[FATAL] " + ChatColor.WHITE + "" + message);
	}
	
	public static void authorAscii() {
		console.sendMessage(ChatColor.GREEN + "███████╗██╗   ██╗███╗   ██╗ ██████╗");
		console.sendMessage(ChatColor.GREEN + "██╔════╝╚██╗ ██╔╝████╗  ██║██╔════╝");
		console.sendMessage(ChatColor.GREEN + "███████╗ ╚████╔╝ ██╔██╗ ██║██║");
		console.sendMessage(ChatColor.GREEN + "╚════██║  ╚██╔╝  ██║╚██╗██║██║  ");
		console.sendMessage(ChatColor.GREEN + "███████║   ██║   ██║ ╚████║╚██████╗");
		console.sendMessage(ChatColor.GREEN + "╚══════╝   ╚═╝   ╚═╝  ╚═══╝ ╚═════╝");
	}
	
	public void versiontext() {
		console.sendMessage(ChatColor.BLUE + "Você está utilizando a versão " + version + " do plugin.");
	}
}
