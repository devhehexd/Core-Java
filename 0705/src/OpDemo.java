import java.util.Scanner;

import javax.swing.plaf.basic.BasicToolTipUI;

public class OpDemo {

	public static void main(String[] args) {
		
		//short su = 5;
		//short result = ~su; //+, - , ~(tilde)는 int
		
		//short result = true ? 1970 : 3.14; //삼항연산자는 조건을 먼저 보는 것이 아니라 true와 false의 값을 먼저 봄.
														  //따라서 1970이 1970.0으로 형변환이 되어 short가 아니게 되므로 에러 발생
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값 입력(초단위): ");
		int inputVal = sc.nextInt();
		
		int hour = inputVal / 3600;
		int min = inputVal % 3600 / 60;
		int sec = inputVal % 3600 % 60;
		
		if (min <= 0 && sec != 0) {
			System.out.println(inputVal + "초는 " + hour + "시간 " + sec + "초 입니다.");
		}
		else if (sec <= 0 && min != 0) {
			System.out.println(inputVal + "초는 " + hour + "시간 " + min + "분 입니다.");
		}
		else if (min <= 0 && sec <= 0) {
			System.out.println(inputVal + "초는 " + hour + "시간 입니다.");
		}
		else {
			System.out.println(inputVal + "초는 " + hour + "시간 " + min + "분 " + sec + "초 입니다.");
		}
	
	}

}
