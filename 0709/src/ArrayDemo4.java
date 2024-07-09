import java.util.Iterator;

public class ArrayDemo4 {

	public static void main(String[] args) {
		
		double[] arr = {3.14, 89.5, 182.5, 69.2};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.printf("%.2d%n", arr[i]);
//		}
		
		//Enhanced For
		for (double d : arr) { //컬렉션과 배열에서만 사용
			System.out.println(d);
		}

	}

}
