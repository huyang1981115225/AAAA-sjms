package chuangjianxing.day01_singleton;
/**
 * 测试静态内部类实现单例模式
 * 
 * 要点：
 *     1）外部类没有static属性，则不会像饿汉式那样立即加载对象
 *     
 *     2）只有真正调用getInstance()方法，在乎加载静态内部类。加载类时是线程安全的。
 *        instance是static final类型，保证了内存中只有这样一个实例存在，
 *        而且只能被赋值一次，从而能保证了线程安全性。
 *     
 *     3）兼备了并发高效调用和延时加载的优势。
 * @author HY
 *
 */
public class SingletonDemo4 {

	private SingletonDemo4(){
		
	}
	
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	
	public static SingletonDemo4 getInstance(){
		return SingletonClassInstance.instance;
	}
	
	/**
	 * 测试创建的两个对象是否相同
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonDemo4 s1 = SingletonDemo4.getInstance();
		SingletonDemo4 s2 = SingletonDemo4.getInstance();
		System.out.println("s1:  " + s1);
		System.out.println("s2:  " + s2);
		System.out.println(s1 == s2);
	}
}
