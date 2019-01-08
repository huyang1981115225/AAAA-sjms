package chuangjianxing.day01_singleton;

/**
 * 测试饿汉式单例模式
 * 
 * @author HY
 * 
 */
public class SingletonDemo1 {

	// 类初始化时，立即加载这个对象（没有延时加载的优势），加载类时，天然的是线程安全的
	private static SingletonDemo1 instance = new SingletonDemo1();

	// 私有化构造方法，则不可以随意创建该类的对象
	private SingletonDemo1() {

	}

	// 方法没有同步不需要synchronized,调用效率高
	public static SingletonDemo1 getInstance() {
		return instance;
	}

	/**
	 * 测试创建的两个对象是否相同
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		System.out.println("s1:  " + s1);
		System.out.println("s2:  " + s2);
		System.out.println(s1 == s2);
	}
}
