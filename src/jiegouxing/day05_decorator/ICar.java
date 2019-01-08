package jiegouxing.day05_decorator;
/**
 * 抽象构件角色
 * 
 * @author HY
 *
 */
// 抽象构件角色
public interface ICar {
	void move();
}

// ConcreteComponent 具体构件角色（真实对象）
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("在陆地上跑！");
	}
}

// Decorator装饰对象
class SuperCar implements ICar{
	protected ICar car;
	
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}
}

// ConcreteDecorator具体装饰对象
class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void fly(){
		System.out.println("天上飞！");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
}

//ConcreteDecorator具体装饰对象
class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
	}
	
	public void swim(){
		System.out.println("水里游！");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
}

//ConcreteDecorator具体装饰对象
class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
	}
	
	public void autoMove(){
		System.out.println("无人驾驶！");
	}
	
	@Override
	public void move() {
		super.move();
		autoMove();
	}
}
