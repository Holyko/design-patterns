package _1_factory_pattern.model;

public class AppleMouse implements Mouse {

	private String brand;

	public AppleMouse() {
		this.instance();
	}

	public void instance() {
		this.brand = "Apple";
	}

	public String click() {
		return "Apple Mouse was clicked";
	}
}
