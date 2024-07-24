package com.example;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Input {
	
	private Scanner sc; //member
	private List<StudentVO> list; //field

	public Input(List<StudentVO> array) throws FileNotFoundException{
		this.sc = new Scanner(new java.io.File("D:\\Workspace\\성적관리프로그램\\sungjuk_utf8.txt"));
		this.list = array;
	}
	void input() {

		while (this.sc.hasNextLine()){
			String line = this.sc.nextLine(); //1101 한송이 78 87 83 78
			//문자열 파싱 -> String[] = String 클래스의 split(정규식)
			Scanner s = new Scanner(line).useDelimiter("\\s+");
			String hakbun = s.next(); //1101
			String name = s.next(); //한송이
			int kor = s.nextInt(); //78
			int math = s.nextInt(); //87
			int eng = s.nextInt(); //83
			int edp = s.nextInt(); //78
			StudentVO student = new StudentVO(hakbun, name, kor, eng, math, edp);
			this.list.add(student);
		}
		
		
	}

}
