/**
 * 过滤器模式
 * 类型：结构型
 * 功能：从某个列表中筛选指定条件的元素
 */
package _8_filter_pattern;

import _8_filter_pattern.filter.MaleFilter;
import _8_filter_pattern.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Person> persons = datasource();
		new MaleFilter().doFilter(persons);
	}

	public static List<Person> datasource () {
		System.out.println("有5个人");
		List<Person> list = new ArrayList<>();
		list.add(new Person("1", "male", "18", "student"));
		list.add(new Person("2", "female", "18", "student"));
		list.add(new Person("3", "male", "28", "teacher"));
		list.add(new Person("4", "female", "18", "student"));
		list.add(new Person("5", "female", "28", "teacher"));
		return list;
	}

}
