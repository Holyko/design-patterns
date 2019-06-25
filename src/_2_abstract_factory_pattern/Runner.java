/**
 * 抽象工厂模式
 * 类型：创建型
 * 作用：用于定义一系列的产品族工厂模型，可以理解为工厂的工厂。侧重于简单对象的批量创建
 * 缺点：不便于产品族的扩展
 */
package _2_abstract_factory_pattern;

import _2_abstract_factory_pattern.factory.Factory;
import _2_abstract_factory_pattern.factory.MicrosoftFactory;

public class Runner {

	public static void main(String[] args) {
		Factory microsoft = new MicrosoftFactory();
		System.out.println(microsoft.produceMouse().des());
		System.out.println(microsoft.produceKeyBoard().des());
	}

}
