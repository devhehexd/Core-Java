
public class ConstructorDemo {

	public static void main(String[] args) {
		
//		Car sonata = new Car(); //기본 생성자 자동 생성
//		System.out.println(sonata.name); //기본 생성자 생성으로 초기화 -> null
//		System.out.println(sonata.price); //기본 생성자 생성으로 초기화 -> 0
		
		Product pencil = new Product("모나미 연필", 1000, "모나미");
		Product computer = new Product("노트북", 2_500_000, "LG Gram");
		Product tv = new Product("tv", 3_000_000, "삼성전자");
//		Product p = new Product(); 생성자를 만들지 않았을 경우에만 기본 생성자 자동 생성. 현재 명시적으로 생성자를 생성했기 때문에 에러 발생


	}

}
