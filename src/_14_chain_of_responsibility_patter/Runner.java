/**
 * 责任链模式
 * 类型：行为型
 * 描述：
 */
package _14_chain_of_responsibility_patter;

import _14_chain_of_responsibility_patter.link.Link;
import _14_chain_of_responsibility_patter.link.RealLink;

public class Runner {

	public static void main(String[] args) {
		Link l1 = new RealLink("一号");
		Link l2 = new RealLink("二号");
		Link l3 = new RealLink("三号");
		l1.set(l2);
		l2.set(l3);

		l1.doSomething();

	}

}
