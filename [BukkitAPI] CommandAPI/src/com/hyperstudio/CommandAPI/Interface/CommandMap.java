package com.hyperstudio.CommandAPI.Interface;

import java.util.List;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.Plugin;

public class CommandMap {
	
	public String name;
	public String description;
	public String usageMessage;
	public String setPermission;
	public List<String> setAliases;
	public Plugin plugin;
	public Command cmd;
	public CommandTab ctab;
	
	public CommandMap(Plugin plugin, Command cmd, CommandTab ctab) {
		
		this.name = cmd.getName();
		this.description = cmd.getDescription();
		this.usageMessage = cmd.getUsageMessage();
		this.setPermission = cmd.getPermission();
		this.setAliases = cmd.getAliases();
		this.plugin = plugin;
		this.cmd = cmd;
		this.ctab = ctab;
		return;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getUsageMessage() {
		return this.usageMessage;
	}
	
	public String getPermission() {
		return this.setPermission;
	}
	
	public List<String> getAliases() {
		return this.setAliases;
	}
	
	public Plugin getPlugin() {
		return this.plugin;
	}
	
	public Command getCommand() {
		return this.cmd;
	}
	
	public CommandTab getCommandTab() {
		return this.ctab;
	}
	
	public TabCompleter getTabComplete() {
		return new TabMap(getPlugin(), this, getCommandTab());
	}
	
}
