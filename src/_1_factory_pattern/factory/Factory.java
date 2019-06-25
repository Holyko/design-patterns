package _1_factory_pattern.factory;

import _1_factory_pattern.model.Mouse;

public interface Factory {

	Mouse build(String brand);

}
