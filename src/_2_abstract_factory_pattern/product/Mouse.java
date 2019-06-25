package _2_abstract_factory_pattern.product;

public class Mouse implements Product {

	private String brand;

	public Mouse(String brand) {
		this.brand = brand;
	}

	@Override
	public String des() {
		return  "这是一款" +  this.brand + "鼠标";
	}

}
