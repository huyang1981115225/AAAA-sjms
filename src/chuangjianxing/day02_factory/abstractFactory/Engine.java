package chuangjianxing.day02_factory.abstractFactory;

/**
 * 发动机
 * 
 * @author HY
 * 
 */
public interface Engine {

	void run();

	void start();
}

/**
 * 高端发动机
 * 
 * @author HY
 * 
 */
class LuxuryEngine implements Engine {

	@Override
	public void run() {
		System.out.println("高端发动机转的快。");
	}

	@Override
	public void start() {
		System.out.println("高端发动机可以自动启停。");
	}
}

/**
 * 低端发动机
 * 
 * @author HY
 * 
 */
class LowEngine implements Engine {

	@Override
	public void run() {
		System.out.println("低端发动机转的慢。");
	}

	@Override
	public void start() {
		System.out.println("低端发动机性能较差。");
	}
}
