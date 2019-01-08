package chuangjianxing.day04_prototype;

import java.util.Date;

public class Sheep2 implements Cloneable { //1997,英国的克隆羊，多利！
	
	private String name;
	
	private Date bithday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();// 直接调用object对象的的clone()方法！
		
		/**
		 * 添加如下代码实现深复制（deep Clone）
		 */
		Sheep2 sheep = (Sheep2) obj;
		sheep.bithday = (Date) this.bithday.clone();// 把属性也进行克隆
		return obj;
	}
	
	public Sheep2() {

	}

	public Sheep2(String name, Date bithday) {
		super();
		this.name = name;
		this.bithday = bithday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBithday() {
		return bithday;
	}

	public void setBithday(Date bithday) {
		this.bithday = bithday;
	}
}
