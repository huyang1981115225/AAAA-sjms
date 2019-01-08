package chuangjianxing.day02_factory.factorymethod;

public class FerrariFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Ferrari();
	}
}
