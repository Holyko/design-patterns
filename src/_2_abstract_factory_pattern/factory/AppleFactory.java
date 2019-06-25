package _2_abstract_factory_pattern.factory;

import _2_abstract_factory_pattern.product.KeyBoard;
import _2_abstract_factory_pattern.product.Mouse;

public class AppleFactory extends  AbstractFactory {

	@Override
	public Mouse produceMouse() {
		return new Mouse("Apple");
	}

	@Override
	public KeyBoard produceKeyBoard() {
		return new KeyBoard("Apple");
	}

}
