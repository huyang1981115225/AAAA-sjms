package chuangjianxing.day04_prototype;

import java.util.Date;
/**
 * 测试原型模式(浅克隆)
 * 
 * @author HY
 *
 */
public class Test01_qianClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(1234567865L);
		String name = "多利";
		Sheep sheep1 = new Sheep(name, date);
		System.out.println(sheep1);
		System.out.println(sheep1.getName());
		System.out.println(sheep1.getBirthday());
		Sheep sheep2 = (Sheep) sheep1.clone();
		
		name = "我变了";
		date.setTime(1312414141L);
		System.out.println(sheep1.getBirthday());
		
		System.out.println(sheep2);
		sheep2.setName("我是克隆一号");
		System.out.println(sheep2.getName());
		System.out.println(sheep2.getBirthday());
	}
}
