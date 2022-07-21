package com.hyperstudio.CommandAPI;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import com.hyperstudio.CommandAPI.Interface.CommandMap;
import com.hyperstudio.CommandAPI.Interface.Execute;
import com.hyperstudio.CommandAPI.Interface.RegisterException;

public class CommandAPI {
	
	private Plugin plugin;
	
	public CommandAPI(Plugin plugin) {
		this.plugin = plugin;
	}
	
	/**
	 * CommandMap 을 서버 명령어에 추가합니다.
	 * @param cMap
	 * @throws RegisterException
	 */
	public void registerCommand(CommandMap cMap) throws RegisterException {
		try {
			final java.lang.reflect.Field bukkitCommandMap = Bukkit.getServer().getClass().getDeclaredField("commandMap");
			bukkitCommandMap.setAccessible(true);
			
			org.bukkit.command.CommandMap commandMap;
			commandMap = (org.bukkit.command.CommandMap) bukkitCommandMap.get(Bukkit.getServer());
			
			commandMap.register(cMap.getName().toString(), new Execute(getPlugin(), cMap));
			
			
			if(cMap.getCommandTab() == null) return;
			Bukkit.getPluginCommand(cMap.getName().toString()).setTabCompleter(cMap.getTabComplete());
			return;
			
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			RegisterException e1 = new RegisterException(e.getMessage());
			throw e1;
		} catch (NullPointerException e3) {
			e3.printStackTrace();
		}
		
		
	}
	
	public Plugin getPlugin() {
		return this.plugin;
	}
	
}
