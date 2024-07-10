
public class CallbyRefDemo {

	public static void main(String[] args) {
		
		CallbyRefDemo d = new CallbyRefDemo();
		int money = 1000;
		String name = "한지민";
		System.out.printf("Before money = %d, name = %s%n", money, name);
		d.change(money, name);
		System.out.printf("After money = %d, name = %s%n", money, name);
	

	}
	void change(int su, String str) { //member method
		
		su *= 5;
		str = "김지민";
		System.out.printf("In change() su = %d, str = %s%n", su, str);
		
	}

}
