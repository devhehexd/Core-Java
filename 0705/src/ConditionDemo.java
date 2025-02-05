import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args) {
		
//		System.out.println("Favorite Season(Spring, Summer, Fall, Winter): ");
//		
//		Scanner sc = new Scanner(System.in);
//		String season = sc.nextLine(); //String은 참조형 타입 -> season 변수는 문자열이 아니라 참조값(주소)
//		
//		if (season.equals("Spring")) { //equals()는 String class의 멤버 메소드이기 때문에, 주소가 필요하다.
//													//따라서 season 주소의 값과 "Spring"이 같으면 참, 다르면 거짓
//													//문자열 비교는 equals 사용이 정석
//			System.out.println("봄: 개나리, 진달래");
//		}else if (season.equals("Summer")) {
//			System.out.println("여름: 장미, 아카시아");
//		}else if (season.compareTo("Fall") == 0) {
//			System.out.println("가을: 백합, 코스모스");
//		}else {
//			System.out.println("겨울: 동백, 매화");
//		}
//		//if문은 위에서 부터 아래로 하나씩 찾는데, break가 없으므로 찾는다하더라도 끝까지 탐색을 계속하기 때문에 속도가 느림
//		
//		
//		switch(season) {
//		
//		case "Spring" : System.out.println("봄: 개나리, 진달래"); break;
//		case "Summer" : System.out.println("여름: 장미, 아카시아"); break;
//		case "Fall" : System.out.println("가을: 백합, 코스모스"); break;
//		default : System.out.println("겨울: 동백, 매화"); break;
//		}
		//해당하는 case로 바로 가서 break 하기 때문에 속도가 빠름
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("신장(cm): ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg): ");
		double weight = sc.nextDouble();
		
		double bmi = weight / Math.pow(height / 100, 2);
		
		if (bmi < 18.5) {
			System.out.printf("%s님의 BMI %.1f이고 저체중 입니다.", name, bmi);
		}
		else if (18.5 <= bmi && bmi < 23) {
			System.out.printf("%s님의 BMI %.1f이고 정상 체중입니다.", name, bmi);
		}
		else if (23 <= bmi && bmi < 25) {
			System.out.printf("%s님의 BMI %.1f이고 과체중입니다.", name, bmi);
		}
		else {
			System.out.printf("%s님의 BMI %.1f이고 비만입니다.", name, bmi);
		}				
	}
}
