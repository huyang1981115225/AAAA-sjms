package chuangjianxing.day04_prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable,Serializable{ //1997,英国的克隆羊，多利！

	private static final long serialVersionUID = -7948975506765487962L;

	private String name;
	
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();// 直接调用object对象的的clone()方法！
		return obj;
	}
	
	public Sheep() {

	}

	public Sheep(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
