package _2_abstract_factory_pattern.product;

public class KeyBoard implements Product {

	private String brand;

	public KeyBoard(String brand) {
		this.brand = brand;
	}

	@Override
	public String des() {
		return  "这是一款" +  this.brand + "键盘";
	}

}
