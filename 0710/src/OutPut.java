
public class OutPut {
	
	void output(Student std) {
			
			System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t평점");
			System.out.println("-------------------------------------------------");
			std.print();
			//System.out.printf("%-10s%5d%5d%5d%5d%7.1f%3c%n", std.getHakbun(), std.getKor(), std.getEng(), std.getMath(), std.getTotal(), std.getAvg(), std.getGrade());
		}

}
