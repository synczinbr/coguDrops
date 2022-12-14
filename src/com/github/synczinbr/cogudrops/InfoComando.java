package com.github.synczinbr.cogudrops;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.synczinbr.cogudrops.outros.ActionBarAPI;
import com.github.synczinbr.cogudrops.utils.Log;

import net.md_5.bungee.api.ChatColor;

public class InfoComando implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if(cmd.getName().equalsIgnoreCase("cogudrops")) {
			if(sender instanceof Player) {
				Player p = (Player)sender;
				p.sendMessage("");
				p.sendMessage("§e§lsyncCoguDrops §f==> §bfeito por §esynczin§abr");
				p.sendMessage("§fencomendado por §azskipperbrazil_ §fpara §ccogumc.xyz");
				p.sendMessage("§7acesse ==> https://github.com/synczinbr");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 1);
				ActionBarAPI.sendActionBarMessage(p, "§asyncCoguDrops §f==> §cfeito por synczinbr");
			} else {
				Log.info("Plugin feito por " + ChatColor.GREEN + "synczin" + ChatColor.YELLOW + "br");
			}
		}
		return false;
	}

}
