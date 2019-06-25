/**
 * 单例模式
 * 功能：用于创建单一实例的对象
 * 描述：分为饿汉、饥汉、双重锁，此例实现方式为双重锁
 */
package _3_singleton_pattern;

public class Runner {

	public static void main(String[] args) {
		DatabasePool pool = DatabasePool.instance();
		System.out.println(pool.des());
	}

}
