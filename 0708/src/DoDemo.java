import java.util.Scanner;

public class DoDemo {

	public static void main(String[] args) {
//4! = 4 * 3 * 2 * 1
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇 Factorial? : ");
//		int su = sc.nextInt();
//		int answer = 1;
//		
//		for (int i = su; i > 0; i--) {
//			answer *= i;
//		}
//		System.out.println(su + "! = " + answer);
//	}
	
		String y_n = null; //null 번지 (참조형이므로 값을 넣을 수 없음)
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("몇 Factorial? : ");
			int su = sc.nextInt();
			int answer = 1;
			for (int i = su; i > 0; i--) {
				answer *= i;
			}
			System.out.println(su + "! = " + answer);
			System.out.print("Again (y/n)");
			y_n = sc.next();
		} while (y_n.equals("Y") || y_n.equals("y"));	


	}

}
