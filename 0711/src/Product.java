
public class Product {
	
	String name;
	int price;
	String maker;
	
//	public Product() { //Default constructor(기본 생성자) 자동 생성, 필드 초기화
//		this.name = null;
//		this.price = 0;
//		this.maker = null;
//	}

	public Product(String name, int price, String maker) { //일반 생성자
		this.name = name;
		this.price = price;
		this.maker = maker;
	}
	
	public Product() {} //기본 생성자를 만들고 싶은데 생성자가 이미 있는 경우, 왼쪽과 같이 직접 만들어 줘야한다
}
