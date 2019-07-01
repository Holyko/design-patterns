package _11_facade_pattern.computer;

public class SSD implements Hardware {
	@Override
	public void start() {
		System.out.println("SSD 启动了");
	}
}
