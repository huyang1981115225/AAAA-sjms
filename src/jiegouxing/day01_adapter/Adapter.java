package jiegouxing.day01_adapter;
/**
 * 适配器
 * 相当于usb和ps/2的转换器
 * 
 * @author HY
 *
 */
public class Adapter extends Adaptee implements Target {

	/**
	 * 适配器继承适配类，单一继承，后面会不太方便，可以内部自己调用，见Adapter02
	 */
	@Override
	public void handReq() {
		super.request();
	}
}
