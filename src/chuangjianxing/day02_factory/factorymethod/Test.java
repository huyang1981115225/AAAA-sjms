package chuangjianxing.day02_factory.factorymethod;

public class Test {
	
	public static void main(String[] args) {
		Car audi = new AudiFactory().createCar();// 调用者需要和实现类打交道
		Car ferrari = new FerrariFactory().createCar();
		
		audi.run();
		ferrari.run();
		
		//新增一辆奔驰车
		Car benz = new BenzFactory().createCar();
		benz.run();
	}
}
