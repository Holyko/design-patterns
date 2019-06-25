package _7_bridge_pattern.driver;

public class MysqlDriver implements Driver {
	@Override
	public void link() {
		System.out.println("Mysql 数据库 驱动安装完成");
	}
}
