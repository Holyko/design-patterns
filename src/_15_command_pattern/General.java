package _15_command_pattern;

public class General {

	private Command command;

	public General(Command command) {
		this.command = command;
	}

	public Command send(){
		return this.command;
	}
}
