package _8_filter_pattern.filter;

import java.util.List;

public interface Filter<T> {

	void doFilter(List<T> datas);

}
