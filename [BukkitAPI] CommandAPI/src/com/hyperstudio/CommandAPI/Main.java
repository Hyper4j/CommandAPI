package com.hyperstudio.CommandAPI;

import org.bukkit.plugin.java.JavaPlugin;

import com.hyperstudio.CommandAPI.Interface.CommandMap;
import com.hyperstudio.CommandAPI.Interface.RegisterException;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// 명령어 추가 예제
		CommandAPI api = new CommandAPI(this);
		try {
			api.registerCommand(new CommandMap(this, new ExampleCMD(), null));
		} catch (RegisterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getLogger().info("명령어API 가 동작합니다.");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("명령어API 서비스 종료!");
	}
	
}
