/**
 * 原型模式
 * 功能：用作复制对象
 */
package _5_prototype_pattern;

import java.io.IOException;

public class Runner {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		OriginObject originObject = new OriginObject();

		OriginObject cloneObject = originObject.clone();
		System.out.println(cloneObject == originObject);

		OriginObject deepObject = (OriginObject) originObject.deepClone();
		System.out.println(deepObject == originObject);
	}

}
