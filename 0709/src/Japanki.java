import java.util.Scanner;

public class Japanki {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		String y_n = null;

		do {
			System.out.print("Money: ");
			int money = sc.nextInt();

			for (int i = 0; i < 10; i++) {
				int mok = money / arr[i];
				System.out.println(arr[i] + "원권: " + mok);
				money = money % arr[i];
			}
			System.out.print("Again(y/n)?: ");
			y_n = sc.next();
			y_n = y_n.toLowerCase();
		} while (y_n.equals("y"));
		System.out.println("Program is over...");
	}
}
