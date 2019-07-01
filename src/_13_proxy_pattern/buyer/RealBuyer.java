package _13_proxy_pattern.buyer;

public class RealBuyer implements Buyer{

	@Override
	public void say() {
		System.out.println("我是买家");
	}

}
