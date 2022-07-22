# CommandAPI
마인크래프트 플러그인 개발자들을 위한, 커맨드API
플러그인 및 API 사용버전: 1.12.2 이상

Maven/Gradle 등에서 API 사용을 원할 시에
로컬 저장소에서 Jar 파일을 등록하여 사용하세요!

#### 사용방법:
```java
CommandAPI api = new CommandAPI(this);
try {
	api.registerCommand(new CommandMap(this, new ExampleCMD(), null));
} catch (RegisterException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
```

#### ExampleCMD.class:
```java
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

```
