package chuangjianxing.day01_singleton;

import java.lang.reflect.Constructor;

/**
 * 防止反射会破解单例模式
 * 
 * @author HY
 * 
 */
public class SingletonDemo7 {

	private static SingletonDemo7 instance;

	/**
	 *以下可以防止反射破解单例模式 
	 */
	private SingletonDemo7() {
		if (instance != null) {
			throw new RuntimeException("想用反射破解，哈哈想多了！！！");
		}
	}

	public static synchronized SingletonDemo7 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo7();
		}
		return instance;
	}

	/**
	 * 测试反射破解单例模式这时候已经破解不了了，直接抛出异常了
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		SingletonDemo7 s1 = SingletonDemo7.getInstance();
		SingletonDemo7 s2 = SingletonDemo7.getInstance();
		System.out.println("s1:  " + s1);
		System.out.println("s2:  " + s2);
		System.out.println(s1 == s2);

		Class<SingletonDemo7> clazz = (Class<SingletonDemo7>) Class
				.forName("chuangjianxing.day01_singleton.SingletonDemo7");
		Constructor<SingletonDemo7> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true);

		SingletonDemo7 s3 = c.newInstance();// 直接抛出异常了
		SingletonDemo7 s4 = c.newInstance();
		System.out.println("s3:  " + s3);
		System.out.println("s4:  " + s4);
		System.out.println(s3 == s4);
	}
}
