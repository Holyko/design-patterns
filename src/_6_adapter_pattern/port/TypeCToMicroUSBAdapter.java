package _6_adapter_pattern.port;

public class TypeCToMicroUSBAdapter implements TypeCPort {

	private MicroUSBPort microUSBPort;

	public TypeCToMicroUSBAdapter(MicroUSBPort microUSBPort) {
		this.microUSBPort = microUSBPort;
	}

	@Override
	public String read() {
		return microUSBPort.read();
	}

}
