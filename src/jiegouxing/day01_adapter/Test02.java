package jiegouxing.day01_adapter;
/**
 * 客户端类 (相当于例子中的笔记本，只有USB接口)
 * 
 * @author HY
 *
 */
public class Test02 {
	public static void main(String[] args) {
		
		Test02 test02 = new Test02();
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter02(adaptee);
		test02.show(target);
	}
	
	public void show(Target target){
		target.handReq();
	}
}
