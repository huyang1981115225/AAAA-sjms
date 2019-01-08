package chuangjianxing.day01_singleton;

/**
 * 测试双重检测锁单例模式(了解)
 * 
 * @author HY
 * 
 */
public class SingletonDemo3 {

	private static SingletonDemo3 instance;

	private SingletonDemo3() {

	}

	public static SingletonDemo3 getInstance() {
		if (instance == null) {
			SingletonDemo3 sc;
			synchronized (SingletonDemo3.class) {
				sc = instance;
				if (sc == null) {
					synchronized (SingletonDemo3.class) {
						if (sc == null) {
							sc = new SingletonDemo3();
						}
					}
					instance = sc;
				}
			}
		}
		return instance;
	}
	
	/**
	 * 测试创建的两个对象是否相同
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonDemo3 s1 = SingletonDemo3.getInstance();
		SingletonDemo3 s2 = SingletonDemo3.getInstance();
		System.out.println("s1:  " + s1);
		System.out.println("s2:  " + s2);
		System.out.println(s1 == s2);
	}
}
