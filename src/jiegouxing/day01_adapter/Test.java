package jiegouxing.day01_adapter;
/**
 * 相当于例子中的笔记本，只有USB接口
 * 
 * @author HY
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Test test = new Test();
		Target target = new Adapter();
		test.show(target);
	}
	
	public void show(Target target){
		target.handReq();
	}
}
