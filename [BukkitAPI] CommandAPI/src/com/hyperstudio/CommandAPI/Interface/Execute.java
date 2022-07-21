package com.hyperstudio.CommandAPI.Interface;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.plugin.Plugin;

public class Execute extends BukkitCommand {
	
	private final CommandMap cMap;
	private Plugin plugin;

	public Execute(Plugin plugin, CommandMap cMap) {
		super(cMap.getName());
		this.cMap = cMap;
		this.plugin = plugin;
		
		this.setName(cMap.getName());
		this.setAliases(cMap.getAliases());
		this.setDescription(cMap.getDescription());
		this.setPermission(cMap.getPermission());
		this.setUsage(cMap.getUsageMessage());
	}

	@Override
	public boolean execute(CommandSender sender, String commandLabel, String[] args) {
		cMap.getCommand().execute(sender, commandLabel, args);
		return false;
	}

	
	public Plugin getPlugin() {
		return this.plugin;
	}
	
	
	
}
