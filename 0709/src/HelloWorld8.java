/*
 * 다른 클래스의 멤버 메소드는 클래스를 생성하고 그 주소로 접근한다.
 */
public class HelloWorld8 {

	public static void main(String[] args) {
		
		//Car car = new Car();
		//car.print();
		new Car().print();
		
	}
}
	class Car {
		void print() {//member | instance method
			System.out.println("Hello, World");
		}
	}

