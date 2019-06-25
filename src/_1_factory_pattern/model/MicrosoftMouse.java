package _1_factory_pattern.model;

public class MicrosoftMouse implements Mouse {

	private String brand;

	public MicrosoftMouse() {
		this.instance();
	}

	public void instance() {
		this.brand = "Microsoft";
	}

	public String click() {
		return "Microsoft Mouse was clicked.";
	}
}
