package chuangjianxing.day03_builder;

public class ShenZAirShipDirector implements AirShipDirector {

	private AirShipBuilder builder;

	public ShenZAirShipDirector(AirShipBuilder builder) {
		super();
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {

		OrbitalModule orbitalModule = builder.builderOrbitalModule();

		Engine engine = builder.builderEngine();
		engine.setName("神州十号南孚电池");
		
		EscapeTower escapeTower = builder.builderEscapeTower();

		// 装配成飞船
		AirShip ship = new AirShip();
		ship.setEngine(engine);
		ship.setOrbitalModule(orbitalModule);
		ship.setEngine(engine);
		ship.setEscapeTower(escapeTower);

		return ship;
	}
}
