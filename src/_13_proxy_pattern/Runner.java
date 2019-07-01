/**
 * 代理模式
 * 类型：结构型
 * 功能：
 * 描述：代理模式分为 静态代理 和 动态代理， 这里采用的是静态代理。 SPRING MVC 框架中的IOC使用的就是动态代理
 *       Java中自带的动态代理类 和 CGLIB
 */
package _13_proxy_pattern;

import _13_proxy_pattern.buyer.Buyer;
import _13_proxy_pattern.buyer.RealBuyer;
import _13_proxy_pattern.seller.ProxySeller;
import _13_proxy_pattern.seller.RealSeller;
import _13_proxy_pattern.seller.Seller;

public class Runner {

	public static void main(String[] args) {

		Buyer buyer = new RealBuyer();
		buyer.say();

		Seller seller = new ProxySeller(new RealSeller());
		seller.say();

	}

}
