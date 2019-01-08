package chuangjianxing.day02_factory.simplefactory;
/**
 * 测试在简单工厂的情况下
 * 
 * @author HY
 *
 */
public class Test01_carfactory02 {// 调用者

	public static void main(String[] args) {
		
		Car audi = CarFactory02.createAudi();// 调用者和车工厂打交道就可以了，具体工厂怎么造车不管
		Car ferrari = CarFactory02.createFerrari();
		
		audi.run();
		ferrari.run();
	}
}
