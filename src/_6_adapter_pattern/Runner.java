/**
 * 适配器模式
 * 类型：结构型模式
 * 功能：适配两接口，使其可以兼容使用
 * 描述：侧重于（设计完成之后的）开发阶段或与三方接入的时候使用，过多使用该模式会导致系统过于混乱
 */
package _6_adapter_pattern;

import _6_adapter_pattern.computer.Computer;
import _6_adapter_pattern.computer.MicrosoftComputer;
import _6_adapter_pattern.port.MicroUSBMouse;
import _6_adapter_pattern.port.TypeCMouse;
import _6_adapter_pattern.port.TypeCToMicroUSBAdapter;

public class Runner {

	public static void main(String[] args) {
		Computer computer = new MicrosoftComputer();
		TypeCMouse typeCMouse = new TypeCMouse();
		System.out.println("因为接口都是Type-C的，所有很轻松的就读取到：" + computer.link(typeCMouse));
		System.out.println("但是想用家里MicroUSB接口的机械鼠标，这时候就需要一个接口转换设备（适配器）");
		MicroUSBMouse microUSBMouse = new MicroUSBMouse();
		TypeCToMicroUSBAdapter adapter = new TypeCToMicroUSBAdapter(microUSBMouse);
		System.out.println("在接口转换设备（适配器）的帮助下，计算机读取到：" + computer.link(adapter));
	}

}
