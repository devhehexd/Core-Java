
public class Car {
	
	String name;
	int price;
	
	//기본 생성자 -> 컴파일러가 자동으로 생성
//	public car() {
//		this.name = null;
//		this.price = 0;
//	}
	
	//생성자가 하나씩 존재해야 하는데 API에 없다면 private이기 때문
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public Car clone() { //자동차 복제(주소 복사)
		return this; //객체 자체 -> 주소
	}

}
