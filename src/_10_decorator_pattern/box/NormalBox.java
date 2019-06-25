package _10_decorator_pattern.box;

public class NormalBox implements Box {

	public NormalBox() {
		System.out.println("这是一个普通的盒子");
	}

	@Override
	public void show() {
		System.out.println("表面干干净净");
	}
}
