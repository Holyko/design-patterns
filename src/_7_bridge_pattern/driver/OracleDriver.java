package _7_bridge_pattern.driver;

public class OracleDriver implements Driver {
	@Override
	public void link() {
		System.out.println("Oracle 数据库 驱动安装完成");
	}
}
