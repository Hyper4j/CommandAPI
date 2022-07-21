package com.hyperstudio.CommandAPI.Interface;

import java.util.List;

import org.bukkit.command.CommandSender;

public interface Command {
	
	// 명령어 실행
	public boolean execute(CommandSender sender, String commandLabel, String[] args);
	
	// 명령어 이름
	public String getName();
	
	// 명령어 설명
	public String getDescription();
	
	// 명령어 사용 방법
	public String getUsageMessage();
	
	// 명령어 권한
	public String getPermission();
	
	// 추가 명령어
	public List<String> getAliases();
	
}
