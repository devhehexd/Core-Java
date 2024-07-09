
public class ArrayDemo3 {

	public static void main(String[] args) {
		
		//배열의 주소 복사
//		int[] original = {3, 4, 5};
//		int[] target = original;
//		
//		target[0] = 100;
		
		//배열의 값 복사
		int[] original = {3, 4, 5};
		int[] target = new int[10];
		System.arraycopy(original, 0, target, 0, 3); //(복사할 배열, 복사할 배열의 시작 인덱스, 타겟 배열에서 붙여넣을 시작 인덱스, 복사할 개수)
		
		
		}

	}

