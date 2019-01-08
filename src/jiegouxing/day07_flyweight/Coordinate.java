package jiegouxing.day07_flyweight;

/**
 * 外部状态:UnsharedConcreteFlyWeight
 * 
 * 不可随便共享
 * 
 * 
 * @author HY
 * 
 */
public class Coordinate {
	private int x;

	private int y;

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
