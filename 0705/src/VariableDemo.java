
public class VariableDemo {
	
	int eng = 100; //instance variable(인스턴스 변수, 멤버 변수)
	static int math = 80; // class variable(클래스 변수, 메모리에 가장 먼저 할당)
	
	
	public static void main(String[] args) {
		
		int kor = 90; //local variable (지역 변수)
		System.out.printf("수학 점수 = %d\n", math); //메모리에 가장 먼저 할당되었으므로 사용가능.  (생략되었지만 실제로는 Variable.math, Demo 클래스의 math는 Demo.math)
		System.out.printf("국어 점수 = %d\n", kor); // main 메서드가 실행되었으므로 사용가능
		
		//int kor; 만 입력했을 경우 에러 발생 -> 선언만하고 초기화는 하지 않았기 때문
		
		VariableDemo vd = new VariableDemo(); //new를 통해 힙영역에 공간을 생성하고 VariableDemo()(생성자)로 할당
																	//vd는 VariableDemo의 주소
		System.out.printf("영어 점수 = %d\n", vd.eng);
		
		Demo d = new Demo();
		System.out.printf("영어 점수 = %d\n", d.eng);
		
	}

}

class Demo{
	
	static int math = 70; //class variable
	int eng = 50;
	}