package _13_proxy_pattern.seller;

public class RealSeller implements Seller {
	@Override
	public void say() {
		System.out.println("我是卖家");
	}
}
