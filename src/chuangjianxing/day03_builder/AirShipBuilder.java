package chuangjianxing.day03_builder;

/**
 * 构建
 * 
 * @author HY
 * 
 */
public interface AirShipBuilder {

	OrbitalModule builderOrbitalModule();

	Engine builderEngine();

	EscapeTower builderEscapeTower();
}
