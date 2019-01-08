package chuangjianxing.day04_prototype;
/**
 * 测试普通new方式创建对象和clone方式创建对象的效率差异！ 
 * 
 * 如果需要短时间创建大量对象，并且new的过程比较耗时。则可以考虑使用原型模式！
 * 
 * @author HY
 *
 */
public class Test04 {
	public static void main(String[] args) throws CloneNotSupportedException {
		testNew(1000);
		testClone(1000);
	}
	
	private static void testNew(int size) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			Laptop laptop = new Laptop();
		}
		long end = System.currentTimeMillis();
		System.out.println("new的方式耗时："+(end-start)+"ms");
	}
	
	private static void testClone(int size) throws CloneNotSupportedException {
		
		long start = System.currentTimeMillis();
		Laptop laptop = new Laptop();
		for (int i = 0; i < size; i++) {
			Laptop temp = (Laptop) laptop.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("new的方式耗时："+(end-start)+"ms");
	}
}

class Laptop implements Cloneable{// 笔记本电脑
	public Laptop() {
		try {
			Thread.sleep(10);// 模拟创建对象时耗时的过程
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();// 直接调用object对象的clone()方法！
		}
}
