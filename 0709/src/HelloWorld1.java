/*
 * 동일 클래스에 있는 스태틱 변수는 클래스 이름을 생략할 수 있다.
 */
public class HelloWorld1 {
	
	//String str = "Hello, World"; //instance | member variable
	static String str = "Hello, World"; // class | static variable

	public static void main(String[] args) {
		
		//String str = "Hello, World"; //local | stack | temporary | auto variable
		System.out.println(HelloWorld1.str);
		
	}

}

