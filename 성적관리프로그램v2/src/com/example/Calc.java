package com.example;

import java.util.List;

public class Calc {
	
	private List<StudentVO> list; //field
	

	public Calc(List<StudentVO> array) {
		this.list = array;
	}
	void calc() {

		//for (Student std : this.array)
		this.list.forEach(std -> { //Lambda Expression
			int total = std.getKor() + std.getEng() + std.getMath() + std.getEdp();
			double avg = total / 4;
			char grade = (avg >= 90) ? 'A':
							(avg >= 80) ? 'B':
								(avg >= 70) ? 'C':
									(avg >= 60) ? 'D' : 'F';
			std.setTotal(total);
			std.setAvg(avg);
			std.setGrade(grade);
		});
		
	}

}
