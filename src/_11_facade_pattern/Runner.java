/**
 * 外观模式
 * 类型：结构型
 * 功能：屏蔽复杂实现，向外提供简单接口
 * 描述：简化使用者的操作，不对外展示复杂的逻辑
 */
package _11_facade_pattern;

import _11_facade_pattern.computer.Computer;

public class Runner {

	public static void main(String[] args) {
		System.out.println("电脑一键启动：点击电源按钮。。。");
		Computer computer = new Computer();
		computer.start();
	}

}
