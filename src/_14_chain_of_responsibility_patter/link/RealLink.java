package _14_chain_of_responsibility_patter.link;

public class RealLink extends AbstractLink {

	private String name;

	public RealLink(String name) {
		this.name = name;
	}

	@Override
	public void doSomething() {
		System.out.println(this.name + " 被执行了");
		if (next() != null)
			next().doSomething();
	}
}
