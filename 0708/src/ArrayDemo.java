
public class ArrayDemo {

	public static void main(String[] args) {
		
//		int age; //declaration
//		age = 28; //assignment
//		String name = "한지민"; //initialization
		
		int [] age; //declaration
		age = new int [4]; //creation
		
		age[0] = 6;	//assignment
		age[1] = 7;
		age[2] = 8;
		age[3] = 9;
		
		//char [] array = new char[] {'a', 'b', 'c', 'd'};
		char [] array = {'a', 'b', 'c', 'd'};
		
		char [] charArr = null;
		array = new char[] {'a', 'b', 'c', 'd'};
		
		
		String [] strArr = {"Hello", "World", "Good", "Java", "A"};
		//"Hello"라는 값이 저장되는 것이 아니라 '번지(참조값)'가 저장되는 것 -> 참조 배열
		

	}

}
