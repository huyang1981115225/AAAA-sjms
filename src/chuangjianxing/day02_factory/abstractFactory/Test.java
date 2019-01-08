package chuangjianxing.day02_factory.abstractFactory;

public class Test {

	public static void main(String[] args) {
		/**
		 * 定制一辆高端车
		 */
		CarFactory factory = new LuxuryCarFactory();
		Engine engine = factory.createEngine();
		engine.run();
		engine.start();
		
		Seat seat = factory.createSeat();
		seat.message();
		
		Tyre tyre = factory.createTyre();
		tyre.revolve();
	}
}
