/**
 * 建造者模式
 * 功能：用于复杂对象的创建
 * 描述：与工厂模式很类似，但侧重点在对复杂对象的创建
 */
package _4_builder_pattern;

import _4_builder_pattern.builder.Car;
import _4_builder_pattern.builder.CarBuilder;

public class Runner {

	public static void main(String[] args) {
		Car car = new CarBuilder().ProductCar();
		car.show();
	}

}
