package xingweixing.day07_strategy;

public class Client {
	public static void main(String[] args) {

		Strategy s1 = new OldCustomerManyStrategy();
		Context ctx = new Context(s1);
		
//		Context ctx = new Context();
//		ctx.setStrategy(s1);

		ctx.pringPrice(998);
	}
}
