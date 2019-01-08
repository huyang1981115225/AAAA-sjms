package chuangjianxing.day02_factory.factorymethod;
/**
 * 新增一辆奔驰
 * 
 * @author HY
 *
 */
public class Benz implements Car{
	
	@Override
	public void run() {
		System.out.println("Hello I'm Benz S500!");
	}
}
