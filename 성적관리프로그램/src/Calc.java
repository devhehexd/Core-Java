
public class Calc {
	
	private Student[] array; //field
	

	public Calc(Student[] array) {
		this.array = array;
	}
	void calc() {

		for (Student std : this.array) {
			int total = std.getKor() + std.getEng() + std.getMath() + std.getEdp();
			double avg = total / 4;
			char grade = (avg >= 90) ? 'A':
							(avg >= 80) ? 'B':
								(avg >= 70) ? 'C':
									(avg >= 60) ? 'D' : 'F';
			std.setTotal(total);
			std.setAvg(avg);
			std.setGrade(grade);
		}
		
	}

}
