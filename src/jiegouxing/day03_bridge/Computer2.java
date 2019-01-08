package jiegouxing.day03_bridge;

/**
 * 电脑类型的维度
 * 
 * @author HY
 * 
 */
public class Computer2 {
	protected Brand brand;

	public Computer2(Brand brand) {
		super();
		this.brand = brand;
	}

	protected void sale() {
		brand.sale();
	}
}

class Desktop2 extends Computer2 {

	public Desktop2(Brand brand) {
		super(brand);
	}

	@Override
	protected void sale() {
		super.sale();
		System.out.println("销售台式机");
	}
}

class Laptop2 extends Computer2 {

	public Laptop2(Brand brand) {
		super(brand);
	}

	@Override
	protected void sale() {
		super.sale();
		System.out.println("销售笔记本");
	}
}

class Pad2 extends Computer2 {

	public Pad2(Brand brand) {
		super(brand);
	}

	@Override
	protected void sale() {
		super.sale();
		System.out.println("销售平板电脑");
	}
}
