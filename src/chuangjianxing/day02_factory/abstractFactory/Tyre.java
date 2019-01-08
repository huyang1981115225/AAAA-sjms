package chuangjianxing.day02_factory.abstractFactory;

/**
 * 轮胎
 * 
 * @author HY
 * 
 */
public interface Tyre {
	void revolve();
}

/**
 * 高端轮胎
 * 
 * @author HY
 *
 */
class LuxuryTyre implements Tyre{
	@Override
	public void revolve() {
		System.out.println("高端轮胎不易磨损。");
	}
}

/**
 * 低端轮胎
 * 
 * @author HY
 *
 */
class LowTyre implements Tyre{
	@Override
	public void revolve() {
		System.out.println("低端轮胎磨损很快。");
	}
}
