package _6_adapter_pattern.port;

public class MicroUSBMouse implements MicroUSBPort {

	public MicroUSBMouse() {
		System.out.println("这是一个Micro-USB 接口的鼠标");
	}

	@Override
	public String read() {
		return "Micro-USB 鼠标信号";
	}

}
