
public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr = new int[4]; // 정수 배열을 생성하면 배열은 빈 공간이 아니라 0으로 초기화 된다.

		for (int i = 0; i < 4; i++) {
			System.out.printf("arr[%d] = %d%n", i, arr[i]);
		}

		double[] array = new double[4]; //

		for (int i = 0; i < 4; i++) {
			System.out.printf("array[%d] = %f%n", i, array[i]);
		}

	}

}
