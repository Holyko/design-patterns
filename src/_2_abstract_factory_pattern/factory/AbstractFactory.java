package _2_abstract_factory_pattern.factory;

import _2_abstract_factory_pattern.product.KeyBoard;
import _2_abstract_factory_pattern.product.Mouse;

public abstract class AbstractFactory implements  Factory {

	@Override
	public Mouse produceMouse() {
		return null;
	}

	@Override
	public KeyBoard produceKeyBoard(){
		return null;
	}

}
