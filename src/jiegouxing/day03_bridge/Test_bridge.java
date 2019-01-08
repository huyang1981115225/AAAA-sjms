package jiegouxing.day03_bridge;

/**
 * 桥接模式
 * 
 * @author HY
 * 
 */
public class Test_bridge {
	public static void main(String[] args) {
		// 销售联想的笔记本电脑
		Computer2 c1 = new Laptop2(new Lenovo());
		c1.sale();

		// 销售戴尔的平板电脑
		Computer2 c2 = new Pad2(new Dell());
		c2.sale();

		// 销售神舟的台式机
		Computer2 c3 = new Desktop2(new Shenzhou());
		c3.sale();
	}
}
