package chuangjianxing.day02_factory.simplefactory;
/**
 * 测试在简单工厂的情况下
 * 
 * @author HY
 *
 */
public class Test01_carfactory {// 调用者

	public static void main(String[] args) {
		
		Car audi = CarFactory.createCar("奥迪");// 调用者和车工厂打交道就可以了，具体工厂怎么造车不管
		Car ferrari = CarFactory.createCar("法拉利");
		
		audi.run();
		ferrari.run();
	}
}
