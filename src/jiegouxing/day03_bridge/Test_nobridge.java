package jiegouxing.day03_bridge;

public class Test_nobridge {
	public static void main(String[] args) {
		// 销售联想台式机
		Computer computer = new LenovoDesktop();
		computer.sale();
		
		// 增加新类型电脑或者品牌都非常不容易扩展
	}
}
