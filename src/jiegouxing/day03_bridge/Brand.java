package jiegouxing.day03_bridge;
/**
 * 品牌
 * 
 * @author HY
 *
 */
public interface Brand {
	void sale();
}

class Lenovo implements Brand{
	@Override
	public void sale() {
		System.out.println("Hello,I'm Lenovo.");
	}
}

class Dell implements Brand{
	@Override
	public void sale() {
		System.out.println("Hello,I'm Dell.");
	}
}

class Shenzhou implements Brand{
	@Override
	public void sale() {
		System.out.println("Hello,I'm Shenzhou.");
	}
}
