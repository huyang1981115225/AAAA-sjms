package jiegouxing.day05_decorator;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		System.out.println();
		
		// 裝飾模式增加新的功能
		System.out.println("增加新的功能，飞行-----------");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		System.out.println();
		
		System.out.println("增加新的功能，水底潜-----------");
		WaterCar waterCar = new WaterCar(car);
		waterCar.move();
		System.out.println();
		
		System.out.println("增加新的功能，飞行、水底潜-----------");
		WaterCar newCar = new WaterCar(new FlyCar(car));
		newCar.move();
		
		// Reader r = new BufferedReader(new InputStreamReader(new
		// FileInputStream(new File("d:/a.txt"))));
	}
}
