
public class VariableArgumentDemo {

	public static void main(String[] args) {
		
		VariableArgumentDemo vad = new VariableArgumentDemo();
		int a = 5;
		char b = 'B';
		boolean c = true;
		double avg = 89.5;
		String name = "한지민";
		vad.change(a, b, c, avg, name); //argument, 인자(인수)
		

	}
	void change(Object ... A) { //parameter, 매개변수
		
		System.out.println(A.length);
		for (Object su : A) {
			System.out.println(su);
		}
		
		
	}

}
