/**
 * 组合模式（又称：部分-整体模式）
 * 类型：结构型
 * 描述：
 */
package _9_composite_pattern;

public class Runner {

	public static void main(String[] args) {
		System.out.println("一家公司，由以下人员组成：");

		Worker worker = new Worker("worker", "worker", "10");
		Worker po = new Worker("project owner", "po", "100");
		Worker ceo = new Worker("ceo", "ceo", "10000");
		Worker dm = new Worker("department manager", "dm", "1000");

		ceo.add(dm);
		dm.add(po);
		po.add(worker);

		System.out.println("全部人员：");
		ceo.show();


	}

}
