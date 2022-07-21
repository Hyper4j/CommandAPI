package com.hyperstudio.CommandAPI;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.CommandSender;

import com.hyperstudio.CommandAPI.Interface.Command;

public class ExampleCMD implements Command {
	
	/**
	 * 명령어 실행 구문
	 */
	@Override
	public boolean execute(CommandSender sender, String commandLabel, String[] args) {
		// TODO Auto-generated method stub
		sender.sendMessage("Example!");
		return true;
	}
	
	/**
	 * 명령어 이름
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "examplecmd";
	}
	
	/**
	 * 명령어 설명
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "CommandAPI example Command.";
	}
	
	/**
	 * 명령어 사용 방법
	 */
	@Override
	public String getUsageMessage() {
		// TODO Auto-generated method stub
		return "/examplecmd";
	}
	
	/**
	 * 명령어 권한
	 */
	@Override
	public String getPermission() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 추가 명령어
	 */
	@Override
	public List<String> getAliases() {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

}
