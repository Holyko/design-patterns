package _6_adapter_pattern.port;

public class TypeCMouse implements TypeCPort {

	public TypeCMouse() {
		System.out.println("这是一个Type-C 接口的鼠标");
	}

	@Override
	public String read() {
		return "Typc-C 鼠标信号";
	}

}
