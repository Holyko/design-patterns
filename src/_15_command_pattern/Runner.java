/**
 * 命令模式
 * 类型：行为型
 * 描述：将任务的创建者和执行者之间解耦，让请求与执行分开。
 * 案例：struts的ActionServlet
 */
package _15_command_pattern;

public class Runner {

	public static void main(String[] args) {
		System.out.println("一个将军携带命令到来。");
		General general = new General(new Command());
		System.out.println("士兵等待接收将军的命令");
		Soldier soldier = new Soldier();
		System.out.println("士兵执行将军的命令");
		soldier.excute(general.send());
	}

}
