/*
 * method를 호출하는 방법 3가지
 * 1. Call(Pass) by Name
 * 2. Call(Pass) by Value
 * 3. Call(Pass) by Reference
 */
public class MethodDemo4 {

	public static void main(String[] args) {
		
		MethodDemo4 md = new MethodDemo4();
		int result = md.calSum(10, 50); //Call by Value
		System.out.println(result);
		result = md.calSum(1, 100);
		System.out.println(result);
		result = md.calSum(50, 70);
		System.out.println(result);
	}
	int calSum(int start, int end){ //이름, 괄호, 리턴 타입 -> 메소드의 필수 3요소 ({}는 필수 요소가 아님 -> 추상 메소드)
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
}