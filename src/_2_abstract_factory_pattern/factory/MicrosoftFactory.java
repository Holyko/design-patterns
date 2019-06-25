package _2_abstract_factory_pattern.factory;

import _2_abstract_factory_pattern.product.KeyBoard;
import _2_abstract_factory_pattern.product.Mouse;

import java.rmi.NotBoundException;

public class MicrosoftFactory extends  AbstractFactory {

	public static final String BRAND = "Microsoft";

	@Override
	public Mouse produceMouse() {
		return new Mouse(BRAND);
	}

}
