package chuangjianxing.day04_prototype;

import java.util.Date;
/**
 * 测试原型模式(深克隆)
 * 
 * @author HY
 *
 */
public class Test02_deepClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(1234567865L);
		Sheep2 sheep1 = new Sheep2("多利", date);
		System.out.println(sheep1);
		System.out.println(sheep1.getName());
		System.out.println(sheep1.getBithday());
		Sheep2 sheep2 = (Sheep2) sheep1.clone();
		
		date.setTime(1312414141L);
		System.out.println(sheep1.getBithday());
		
		System.out.println(sheep2);
		sheep2.setName("我是克隆一号");
		System.out.println(sheep2.getName());
		System.out.println(sheep2.getBithday());
	}
}
