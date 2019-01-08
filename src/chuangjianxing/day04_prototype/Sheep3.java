package chuangjianxing.day04_prototype;
/**
 * 由此可见,浅克隆仅仅适合克隆基本类型,对于引用类型就不能实现克隆了。
 * 
 * 下面针对浅克隆得出结论:
 * 					基本类型是能够被克隆的,但引用类型仅仅是copy地址,
 *                  并没有copy这个地址指向的对象的值,这使得两个地址指向同一值,
 *                  改动当中一个,当然还有一个也就变了。
 * 
 * @author HY
 *
 */
public class Sheep3 implements Cloneable {
	// 基本类型
    private int age;
    // 非基本类型
    private String name;
    
    // 非基本类型
    private int[] amount;
    
	@Override
	public Object clone() {
		Sheep3 sheep = null;
		try {
			sheep = (Sheep3) super.clone();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sheep;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getAmount() {
		return amount;
	}

	public void setAmount(int[] amount) {
		this.amount = amount;
	}
	
	/**
	 * 测试浅克隆
	 * 
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep3 s1 = new Sheep3();
		s1.setName("多利羊1号");
		s1.setAge(1);
		s1.setAmount(new int[]{100});
		System.out.println("克隆前name:   "+s1.getName());
		System.out.println("克隆前age:   "+s1.getAge());
		System.out.println("克隆前amount[0]:   "+s1.getAmount()[0]);
		
		System.out.println("-----------") ;
		
		//克隆出对象s2,并对s2的属性name,age,amount进行改动
		Sheep3 s2 = (Sheep3) s1.clone();
		s2.setName("多利羊2号");
		s2.setAge(2);
		int [] amount = s1.getAmount();
		amount[0] = 500;
		s2.setAmount(amount);
		System.out.println("克隆后name:   "+s1.getName());
		System.out.println("克隆后age:   "+s1.getAge());
		System.out.println("克隆后amount[0]:   "+s1.getAmount()[0]);
		
		System.out.println("-----------") ;
		System.out.println("克隆后name:   "+s2.getName());
		System.out.println("克隆后age:   "+s2.getAge());
		System.out.println("克隆后amount[0]:   "+s2.getAmount()[0]);
	}
}
