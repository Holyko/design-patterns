/**
 * 迭代器模式
 * 类型：行为型
 */
package _17_iterator_pattern;

import _17_iterator_pattern.iterator.MyIterator;
import _17_iterator_pattern.list.MyList;
import _17_iterator_pattern.list.MyRealList;

public class Runner {

	public static void main(String[] args) {
		MyList list = new MyRealList();
		for (MyIterator iterator = list.iterator(); iterator.hasNext();) {
			System.out.println("next:" + iterator.next());
		}
	}

}
