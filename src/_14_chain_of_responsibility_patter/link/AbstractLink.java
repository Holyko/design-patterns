package _14_chain_of_responsibility_patter.link;

public abstract class AbstractLink implements Link {

	private Link link;

	public void set(Link link){
		this.link = link;
	}

	public Link next() {
		return this.link;
	}

}
