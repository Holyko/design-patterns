package _2_abstract_factory_pattern.factory;

import _2_abstract_factory_pattern.product.Product;

public interface Factory {

	Product produceMouse();

	Product produceKeyBoard();

}
