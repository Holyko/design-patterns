package _14_chain_of_responsibility_patter.link;

public interface Link {

	void doSomething();

	void set(Link link);

	Link next();

}
