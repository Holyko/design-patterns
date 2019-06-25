package _6_adapter_pattern.computer;

import _6_adapter_pattern.port.TypeCPort;

public class MicrosoftComputer implements Computer {

	public MicrosoftComputer() {
		System.out.println("这是一台全新的微软笔记本，采用的是最新的Type-C接口");
	}

	@Override
	public String link(TypeCPort port) {
		return port.read();
	}

}
