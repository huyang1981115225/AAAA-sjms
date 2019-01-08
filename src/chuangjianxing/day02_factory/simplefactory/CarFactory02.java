package chuangjianxing.day02_factory.simplefactory;
/**        
 * @author HY
 *
 */
public class CarFactory02 {

	public static Car createAudi() {
		return new Audi();
	}

	public static Car createFerrari() {
		return new Ferrari();
	}
	
	//只要在下面增加车的类别和相应的方法即可。。。
}
