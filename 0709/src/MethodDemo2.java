
class Product {
	int price;
}

public class MethodDemo2 {

	public static void main(String[] args) {
		
		MethodDemo2 md = new MethodDemo2();
		Product ballpen = new Product();
		ballpen.price = 100;
		System.out.println("before = " + ballpen.price);
		//md.change(ballpen.price); Call by Value //넘어가는 값이 primitive 타입이면 Call by Value
		md.change(ballpen); //Call by Reference 넘어가는 값이 참조형(reference) 타입이면 Call by Reference
		
		//int original = 100;
		//md.print(original); //Call by Value
		System.out.println("after = " + ballpen.price);

	}
	void change(Product pencil) { //pencil = ballpen 주소 복사
		
		pencil.price = 50000;
		
	}
//	void print(int target) {
//		System.out.println("target = " + target);
//		target = 50000;
//		System.out.println("target = " + target);
	}

