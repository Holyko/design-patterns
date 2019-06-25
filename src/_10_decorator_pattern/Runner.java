/**
 * 装饰者模式
 * 类型：结构型
 * 功能：在不改变现有对象结构的前提下，进行功能扩展。
 * 描述：是继承的代替方案。
 */
package _10_decorator_pattern;

import _10_decorator_pattern.box.Box;
import _10_decorator_pattern.box.BoxDecorator;
import _10_decorator_pattern.box.NormalBox;

public class Runner {

	public static void main(String[] args) {
		Box box = new NormalBox();
		box.show();

		System.out.println("现在准备把这个盒子装饰一下，让它成为一个礼品盒");

		BoxDecorator decorator = new BoxDecorator(box);
		decorator.show();
	}

}
