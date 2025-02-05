import java.util.Scanner;

public class SungjukMgmt1 {

	public static void main(String[] args) {
		
		Student [] array = new Student[2]; //학생이 들어갈 주소를 만든 것
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			array[i] = new Student(); //학생 객체 생성 -> 주소(배열)의 주소(Student)
			
			System.out.print("학번: ");
			array[i].hakbun = sc.next();
			System.out.print("국어: ");
			array[i].kor = sc.nextInt();
			System.out.print("영어: ");
			array[i].eng = sc.nextInt();
			System.out.print("수학: ");
			array[i].math = sc.nextInt();
			
			array[i].total = array[i].kor + array[i].eng + array[i].math;
			array[i].avg = array[i].total / 3;
		}
		for (int i = 0; i < 2; i++) {
			System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%10.1f\n", array[i].hakbun, array[i].kor, array[i].eng, array[i].math, array[i].total, array[i].avg);
		}
	}

}
