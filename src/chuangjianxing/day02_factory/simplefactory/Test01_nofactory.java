package chuangjianxing.day02_factory.simplefactory;
/**
 * 测试在没有工厂模式的情况下
 * 
 * @author HY
 *
 */
public class Test01_nofactory {// 调用者

	public static void main(String[] args) {
		
		Car audi = new Audi();// 调用者需要知道接口类同时也要知道所有的实现类
		Car ferrari = new Ferrari();
		
		audi.run();
		ferrari.run();
	}
}
