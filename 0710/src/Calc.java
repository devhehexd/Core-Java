
public class Calc {
	
	void calc(Student std) {
			
			int total = std.getKor() + std.getEng() + std.getMath();
			std.setTotal(total);
			
			double avg = total / 3;
			std.setAvg(avg);
			
			char grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' :
								(avg >= 70) ? 'C' : (avg >= 60) ? 'D' : 'F';
			std.setGrade(grade);
		}

}
