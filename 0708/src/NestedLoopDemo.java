
public class NestedLoopDemo {

	public static void main(String[] args) {
		
		int i = 1;
		while (i <= 9) {
			int dan = 2;
			while (dan <= 9) {
				System.out.print(dan + " X " + i + " = " + dan * i + "\t");
				dan++;
			}
			System.out.println();
			i++;
		}

	}

}
