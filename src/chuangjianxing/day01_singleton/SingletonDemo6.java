package chuangjianxing.day01_singleton;

import java.lang.reflect.Constructor;

/**
 * 测试反射会破解单例模式
 * 
 * @author HY
 * 
 */
public class SingletonDemo6 {

	private static SingletonDemo6 instance;

	private SingletonDemo6() {

	}

	public static synchronized SingletonDemo6 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo6();
		}
		return instance;
	}

	/**
	 * 测试反射破解单例模式
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		SingletonDemo6 s1 = SingletonDemo6.getInstance();
		SingletonDemo6 s2 = SingletonDemo6.getInstance();
		System.out.println("s1:  " + s1);
		System.out.println("s2:  " + s2);
		System.out.println(s1 == s2);

		// 通过反射的方式直接调用私有构造器
		Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class
				.forName("chuangjianxing.day01_singleton.SingletonDemo6");
		
		clazz.newInstance();
		Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
		SingletonDemo6 s3 = c.newInstance();
		SingletonDemo6 s4 = c.newInstance();
		System.out.println("s3:  " + s3);
		System.out.println("s4:  " + s4);
		System.out.println(s3 == s4);// false
		
		
		System.out.println("演示反射而已...");
		Class cls = Class.forName("chuangjianxing.day01_singleton.SingletonDemo6");
		//动态创建对象
		Object obj = cls.newInstance();
		System.out.println(obj);
	}
}
