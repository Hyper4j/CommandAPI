package com.hyperstudio.CommandAPI.Interface;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.Plugin;

public class TabMap implements TabCompleter {
	
	private CommandTab ctab;
	
	public TabMap(Plugin plugin, CommandMap cmab, CommandTab ctab) {
		this.ctab = ctab;
	}
	
	private CommandTab getCommandTab() {
		return this.ctab;
	}
	
	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		return getCommandTab().onTabComplete(sender, cmd, commandLabel, args);
	}
	
}
