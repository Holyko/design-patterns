package _13_proxy_pattern.seller;

public class ProxySeller implements Seller {

	private Seller seller;

	public ProxySeller(Seller seller) {
		this.seller = seller;
	}

	@Override
	public void say() {
		System.out.println("我是卖家的代理人。");
		this.seller.say();
	}

}
