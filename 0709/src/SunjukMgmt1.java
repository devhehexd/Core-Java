import java.util.Scanner;

public class SunjukMgmt1 {
	public static void main(String[] args) throws java.io.IOException {
		
		Student[] stdArr = new Student[3]; //앞으로 학생들의 정보가 저장될 공간 확보
		
		Scanner sc = new Scanner(new java.io.File("sungjuk.dat"));
		for (int i = 0; i < 3; i++) {
			stdArr[i] = new Student();
			String line = sc.nextLine();
			
			//Parsing
			String[] arr = line.split("\\s+"); //regex 정규식 (\\s말고 \t도 되는 듯?)
														  //"2024-001" "한지민" "100" "80" "70"
			stdArr[i].hakbun = arr[0].trim(); //trim(): 좌우 공백 제거
			stdArr[i].name = arr[1].trim();
			stdArr[i].kor = Integer.parseInt(arr[2].trim());
			stdArr[i].eng = Integer.parseInt(arr[3].trim());
			stdArr[i].math = Integer.parseInt(arr[4].trim());
		}
		int j = 0;
		while (j < 3) {
			System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d\t%n", stdArr[j].hakbun, stdArr[j].name, stdArr[j].kor, stdArr[j].eng, stdArr[j].math);
			j++;
		}
	}
}
