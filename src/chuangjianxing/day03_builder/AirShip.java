package chuangjianxing.day03_builder;

/**
 * 神州十号宇宙飞船
 * 
 * @author HY
 * 
 */
public class AirShip {
	private OrbitalModule orbitalModule;// 轨道舱

	private Engine engine;// 发动机

	private EscapeTower escapeTower;// 逃逸塔

	public void lunch() {
		System.out.println("神州十号发射！！！");
	}

	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}

	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
}

/**
 * 轨道舱
 * 
 * @author HY
 * 
 */
class OrbitalModule {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

/**
 * 发动机
 * 
 * @author HY
 * 
 */
class Engine {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

/**
 * 逃逸塔
 * 
 * @author HY
 * 
 */
class EscapeTower {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}