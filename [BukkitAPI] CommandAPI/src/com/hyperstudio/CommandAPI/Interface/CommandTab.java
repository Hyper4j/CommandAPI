package com.hyperstudio.CommandAPI.Interface;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public interface CommandTab {

	public List<String> onTabComplete(CommandSender sender, Command cmd, String commandLabel, String[] args);

}
