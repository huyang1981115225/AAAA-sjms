package chuangjianxing.day02_factory.abstractFactory;

/**
 * 座椅
 * 
 * @author HY
 * 
 */
public interface Seat {
	void message();
}

/**
 * 高端座椅
 * 
 * @author HY
 * 
 */
class LuxurySeat implements Seat {
	@Override
	public void message() {
		System.out.println("高端座椅可以实现按摩功能。");
	}
}

/**
 * 低端座椅
 * 
 * @author HY
 * 
 */
class LowSeat implements Seat {
	@Override
	public void message() {
		System.out.println("低端座椅价格相对便宜。");
	}
}
