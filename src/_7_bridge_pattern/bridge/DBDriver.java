package _7_bridge_pattern.bridge;

import _7_bridge_pattern.driver.Driver;

public class DBDriver implements Bridge {

	private Driver driver;

	public DBDriver() {
		System.out.println("数据库驱动大全");
	}

	@Override
	public void load() {
		System.out.println("加载驱动");
		this.driver.link();
	}

	@Override
	public void set(Driver driver) {
		System.out.println("配置驱动。。。");
		this.driver = driver;
	}
}
