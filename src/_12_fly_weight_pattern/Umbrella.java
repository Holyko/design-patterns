package _12_fly_weight_pattern;

public class Umbrella {

	private String name;

	public Umbrella(String name) {
		this.name = name;
	}

	public void use() {
		System.out.println(this.name + " 被使用了");
	}

}
