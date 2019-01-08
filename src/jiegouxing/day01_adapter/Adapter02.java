package jiegouxing.day01_adapter;
/**
 * 适配器 
 * (对象适配器方式,使用了组合的方式跟被适配对象整合) 
 * (相当于usb和ps/2的转接器)
 * 
 * @author HY
 *
 */
public class Adapter02 implements Target {
	
	private Adaptee adaptee;

	public Adapter02(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	/**
	 * 由适配器自己调用适配类
	 */
	@Override
	public void handReq() {
		adaptee.request();
	}
}
