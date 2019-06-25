/**
 * 桥接模式
 * 类型：结构型
 * 功能：让定义与实现相互解耦，使得二者独立变化
 * 描述：桥接模式常用于设计阶段，在动态切换实现的时候，代码变动小，甚至可以丝毫不动。JDBC的数据库Driver就是典型的桥接模式
 */
package _7_bridge_pattern;

import _7_bridge_pattern.bridge.Bridge;
import _7_bridge_pattern.bridge.DBDriver;
import _7_bridge_pattern.driver.MysqlDriver;
import _7_bridge_pattern.driver.OracleDriver;

public class Runner {

	public static void main(String[] args) {
		MysqlDriver mysqlDriver = new MysqlDriver();
		OracleDriver oracleDriver = new OracleDriver();
		Bridge bridge = new DBDriver();
		bridge.set(mysqlDriver);
		bridge.load();
		bridge.set(oracleDriver);
		bridge.load();
	}

}
