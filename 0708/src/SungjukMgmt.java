import java.util.Scanner;

public class SungjukMgmt {

	public static void main(String[] args) {
		
		Student chulsu = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		String y_n = null;
		
		do {
		System.out.print("학번: ");
		chulsu.hakbun = sc.next();
		System.out.print("국어: ");
		chulsu.kor = sc.nextInt();
		System.out.print("영어: ");
		chulsu.eng = sc.nextInt();
		System.out.print("수학: ");
		chulsu.math = sc.nextInt();
		
		chulsu.total = chulsu.kor + chulsu.eng + chulsu.math;
		chulsu.avg = chulsu.total / (double) 3; //or 3.0
		
		chulsu.grade = '\0'; //null 값 (혹은 \u0000)
					
		switch((int) (chulsu.avg / 10)) {
			case 10:
			case 9: chulsu.grade = 'A'; break;
		
			case 8: chulsu.grade = 'B'; break;
			case 7:	chulsu.grade = 'C'; break;
			case 6: chulsu.grade = 'D'; break;
			default: chulsu.grade = 'F'; break;
		}
		//System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%.1f\t%3c%\n", chulsu.hakbun, chulsu.kor, chulsu.eng, chulsu.math, chulsu.total, chulsu.avg, chulsu.grade);
		System.out.print(chulsu.hakbun + "\t" + chulsu.kor + "\t");
		System.out.print(chulsu.eng + "\t" + chulsu.math + "\t");
		System.out.print(chulsu.total + "\t" + chulsu.avg + "\t");
		System.out.println(chulsu.grade);	
		System.out.print("Again(y/n)");
		y_n = sc.next();
	} while (y_n.equals("Y") || y_n.equals("y"));
}
}
