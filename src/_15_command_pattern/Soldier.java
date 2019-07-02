package _15_command_pattern;

public class Soldier {

	public void excute(Command command){
		command.action();
	}

}
