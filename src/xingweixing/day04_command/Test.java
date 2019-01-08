package xingweixing.day04_command;

public class Test {
	public static void main(String[] args) {
		Command c = new ConcreteCommand(new Receiver());
		Invoke i = new Invoke(c);
		i.call();

		// new Receiver().action();

	}
}
