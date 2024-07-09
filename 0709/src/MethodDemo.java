/*
 * method를 호출하는 방법 3가지
 * 1. Call(Pass) by Name
 * 2. Call(Pass) by Value
 * 3. Call(Pass) by Reference
 */
public class MethodDemo {

	public static void main(String[] args) {
		
		MethodDemo md = new MethodDemo();
		md.calSum(); //Call by Name
		
	}
	void calSum(){ //이름, 괄호, 리턴 타입 -> 메소드의 필수 3요소 ({}는 필수 요소가 아님 -> 추상 메소드)
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
	}
}
//Naming Convention
/*
 * 1. PascalCasing: Class, Interface, Enum
 * 2. camelCasing: variable, method
 * 3. Snake_Casing
 * 4. Kebbab-Casing
*/