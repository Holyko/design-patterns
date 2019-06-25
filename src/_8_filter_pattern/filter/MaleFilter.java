package _8_filter_pattern.filter;

import _8_filter_pattern.person.Person;

import java.util.List;

public class MaleFilter implements Filter<Person> {

	@Override
	public void doFilter(List<Person> datas) {
		System.out.println("排除非男性，剩余：");
		for (Person p : datas) {
			if ("male".equals(p.getSex()))
				System.out.println(p.toString());
		}
	}

}
