package _11_facade_pattern.computer;

public class Board implements Hardware {
	@Override
	public void start() {
		System.out.println("主板启动了");
	}
}
