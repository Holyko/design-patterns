package _11_facade_pattern.computer;

public class CPU implements Hardware {
	@Override
	public void start() {
		System.out.println("CPU 启动了");
	}
}
