package chuangjianxing.day03_builder;

public class ShenZAirShipBuilder implements AirShipBuilder {

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建神州飞船轨道舱...");
		return new OrbitalModule();
	}

	@Override
	public Engine builderEngine() {
		System.out.println("构建神州飞船发动机...");
		return new Engine();
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建神舟飞船逃逸塔...");
		return new EscapeTower();
	}
}
