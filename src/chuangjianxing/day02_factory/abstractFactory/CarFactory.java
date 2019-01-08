package chuangjianxing.day02_factory.abstractFactory;

public interface CarFactory {

	Engine createEngine();

	Seat createSeat();

	Tyre createTyre();
}
