/**
 * 享元模式
 * 类型：结构型
 * 功能：减少对象的创建，重复使用对象，达到节省系统资源的目的。
 * 描述：简单讲就是共享对象，如线程池、数据库连接池等技术都是享元模式的实现
 */
package _12_fly_weight_pattern;

public class Runner {

	public static void main(String[] args) {
		UmbrellaBox box = new UmbrellaBox();
		System.out.println("A 来借了一把雨伞走");
		Umbrella a = box.get();
		a.use();
		System.out.println("中午的时候，A把雨伞还了回来");
		box.back(a);
		System.out.println("B 来借了一把雨伞走");
		Umbrella b = box.get();
		b.use();
	}

}
