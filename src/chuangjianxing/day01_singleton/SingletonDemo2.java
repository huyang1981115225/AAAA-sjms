package chuangjianxing.day01_singleton;

/**
 * 测试懒汉式单例模式
 * 
 * 要点：lazy load 延时加载，懒加载！真正用的时候才加载！
 * 
 * 问题：资源利用率高了，但是，每次调用getInstance()方法都要同步，并发效率低。
 * 
 * @author HY
 * 
 */
public class SingletonDemo2 {

	// 类初始化时，不初始化这个对象(延时加载，真正用的时候才创建)
	private static SingletonDemo2 instance;

	// 私有化构造器
	private SingletonDemo2() {

	}

	// 方法同步，调用效率低
	public static synchronized SingletonDemo2 getInstance() {
		if (instance == null) {
			instance =  new SingletonDemo2();
		}
		return instance;
	}
	
	/**
	 * 测试创建的两个对象是否相同
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonDemo2 s1 = SingletonDemo2.getInstance();
		SingletonDemo2 s2 = SingletonDemo2.getInstance();
		System.out.println("s1:  " + s1);
		System.out.println("s2:  " + s2);
		System.out.println(s1 == s2);
	}
}
