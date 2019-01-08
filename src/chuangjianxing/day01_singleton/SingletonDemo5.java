package chuangjianxing.day01_singleton;
/**
 * 测试枚举式实现单例模式(没有延时加载)
 * 
 * 优点：
 * 		--实现简单
 * 
 * 		--枚举本身就是单例。由jvm从根本上提供保障！避免通过反射和反序列化的漏洞！
 * 
 * 缺点：
 * 		--无延时加载
 * 
 * 
 * @author HY
 *
 */
public enum SingletonDemo5 {
	
	// 这个枚举元素，本身就是单例对象
	INSTANCE;
	
	// 添加自己需要的操作
	public void doSomeThing(){
		
	}
	
	/**
	 * 测试创建的两个对象是否相同
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonDemo5 s1 = SingletonDemo5.INSTANCE;
		SingletonDemo5 s2 = SingletonDemo5.INSTANCE;
		System.out.println("s1:  " + s1);
		System.out.println("s2:  " + s2);
		System.out.println(s1 == s2);
	}
}
