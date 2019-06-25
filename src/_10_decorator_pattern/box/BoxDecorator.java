package _10_decorator_pattern.box;

public class BoxDecorator implements Box {

	private Box box;

	public BoxDecorator(Box box) {
		this.box = box;
	}

	@Override
	public void show() {
		System.out.println("在盒子里面放入礼物");
		box.show();
		System.out.println("为盒子系上可爱的蝴蝶结");
	}
}
