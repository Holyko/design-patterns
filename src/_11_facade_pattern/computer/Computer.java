package _11_facade_pattern.computer;

public class Computer {

	private Board board;
	private CPU cpu;
	private SSD ssd;

	public Computer() {
		this.board = new Board();
		this.cpu = new CPU();
		this.ssd = new SSD();
	}

	public void start() {
		System.out.println("点击电源键");

		board.start();
		cpu.start();
		ssd.start();
	}
}
