package chuangjianxing.day02_factory.simplefactory;
/**
 * 车工厂，违背了OCP原则，对于新增加的车型，需要修改已有的代码
 * 
 * 要点：
 *     1）简单工厂模也叫静态工厂模式，就是工厂类一般使用静态方法，
 *        通过接收不同的参数来返回不同的对象实例。
 *        
 *     2）对于增加新的车型，不修改代码的话无法扩展
 *        
 * @author HY
 *
 */
public class CarFactory {
	public static Car createCar(String type) {
		if ("奥迪".equals(type)) {
			return new Audi();
		} else if ("法拉利".equals(type)) {
			return new Ferrari();
		} else {
			return null;
		}
	}
}
