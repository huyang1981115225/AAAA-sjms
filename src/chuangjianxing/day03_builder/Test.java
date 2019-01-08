package chuangjianxing.day03_builder;

public class Test {

	public static void main(String[] args) {
		ShenZAirShipBuilder builder  = new ShenZAirShipBuilder();
		ShenZAirShipDirector director = new ShenZAirShipDirector(builder);
		AirShip ship = director.directAirShip();
		
		System.out.println(ship.getEngine().getName());
		ship.lunch();
	}
}
