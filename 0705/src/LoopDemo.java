import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		
		//A부터 Z까지 출력하기
		
		//for (int i = 65; i <= 90; i++) {		
		//} 정석 방법
		
//		int i = 65; //초기화(initialization)
//		for (; i <=90;) { //초기화식과 증감식은 생략할 수 있다.(먼저 초기화한 경우, 증감식을 후에 사용할 경우에만)
//			if (i > 65 && i % 5  == 0) {
//				System.out.println();
//			}
//			System.out.printf("%c\t", (char) i);
//			i++;
//		}
		
//		int i = 65; //초기화(initialization)
//		int count = 0;
		
//		for (; i <=90;) { //초기화식과 증감식은 생략할 수 있다.(먼저 초기화한 경우, 증감식을 후에 사용할 경우에만)
//			System.out.printf("%c\t", (char) i);
//			count++;
//			if (count % 5 ==0) {
//				System.out.println();
//			}
//			i++;
//		}
		
	
//		int count = 0;
//		
//		for (int i = 1; i <= 100; i ++) {
//			if (i % 4 == 0) {
//				count++;
//			}
//		}
//		System.out.printf("4의 배수의 갯수는 %d\n", count);
		
		
		
		//윤년 400년 마다, 4의 배수이지만 100으로 나누어 떨어지지 않는 년도
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Year: ");
		
		int year = sc.nextInt();
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) { //비트 연산자(|, &)도 사용 가능. 차이는, 만약 ||(논리 연산자)는 왼쪽이 참이더라도 오른쪽을 확인하지만
			System.out.println("윤년 입니다.");
		}
		else {
			System.out.println("윤년이 아닙니다.");
		}

	}

}
