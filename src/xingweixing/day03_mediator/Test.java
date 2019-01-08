package xingweixing.day03_mediator;

public class Test {
	public static void main(String[] args) {
		Mediator m = new President();
		
		Market market = new Market(m);
		
		Development devp = new Development(m);
		
		Finacial finacial = new Finacial(m);
		
		System.out.println("市场部market---------------");
		market.selfAction();
		market.outAction();
		System.out.println();
		
		System.out.println("开发部Development---------------");
		devp.selfAction();
		devp.outAction();
		System.out.println();
		
		System.out.println("财务部Finacial---------------");
		finacial.selfAction();
		finacial.outAction();
	}
}
