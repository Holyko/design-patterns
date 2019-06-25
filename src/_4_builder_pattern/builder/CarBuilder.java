package _4_builder_pattern.builder;

import _4_builder_pattern.module.Engine;
import _4_builder_pattern.module.Frame;
import _4_builder_pattern.module.Gearbox;
import _4_builder_pattern.module.Tire;

public class CarBuilder {

	public Car ProductCar() {
		Car car = new Car();
		car.add(new Frame());
		car.add(new Engine());
		car.add(new Gearbox());
		car.add(new Tire());
		return car;
	}

}
