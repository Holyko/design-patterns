/**
 * 23种设计模式之工厂模式
 * 类型：创建型
 * 用途：用于创建对象，侧重于批量创建简单对象，如果是创建复杂对象，推荐使用建造者模式
 */
package _1_factory_pattern;

import _1_factory_pattern.factory.MouseFactory;
import _1_factory_pattern.model.Mouse;

public class Runner {

	public static void main(String[] args) {
		Mouse mouse = null;
		mouse = new MouseFactory().build("Microsoft");
		System.out.println(mouse.click());
		mouse = new MouseFactory().build("Apple");
		System.out.println(mouse.click());
		mouse = new MouseFactory().build("Other");
		System.out.println(mouse.click());
	}

}
