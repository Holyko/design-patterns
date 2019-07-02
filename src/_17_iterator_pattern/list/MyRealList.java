package _17_iterator_pattern.list;

import _17_iterator_pattern.iterator.MyIterator;

public class MyRealList implements MyList {

	private String list[] = {"a", "b", "c", "d"};

	@Override
	public MyIterator iterator() {
		return new MyRealIterator();
	}

	private class MyRealIterator implements MyIterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < list.length)
				return true;

			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext())
				return list[index++];
			return null;
		}

	}

}
