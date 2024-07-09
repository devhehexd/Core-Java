
public class ArrayDemo2 {

	public static void main(String[] args) {
		
//		int arr; //변수 선언
//		arr = 5; //할당
//		double avg = 89.5; //초기화
		
//		int[] arr; //배열 선언
//		 arr = new int[4]; //배열의 생성
//		 arr[0] = 5; //할당
//		 double[] avg = {89.5}; //초기화
		 
//		int[][] arr; //2차원 배열 선언
//		arr = new int[4][3]; //2차원 배열의 생성 (Rectangular Array)
//		arr = new int[4][]; //Jagged(Ragged) Array
//		arr[0][0] = 5; //할당
//		int[][] arr = {{1, 2, 3}, //초기화
//							 {4, 5, 6},
//							 {7, 8, 9},
//							 {10, 11, 12}}; 
//		int[][] arr;
//		arr = new int[4][3];
//		arr[0] = new int[]{1, 2, 3};
//		arr[1] = new int[]{4, 5, 6};
//		arr[2] = new int[]{7, 8, 9};
//		arr[3] = new int[]{10, 11, 12};
//		행은 열의 '주소'를 가지고 있다
		
		int[][] arr;
		arr = new int[4][];
		arr[0] = new int[]{1, 2, 3, 4}; //0층에는 방 4개
		arr[1] = new int[]{5, 6}; //1층에는 방 2개
		arr[2] = new int[]{7}; //2층에는 방 1개
		arr[3] = new int[]{8, 9, 10, 11, 12};	//3층에는 방 5개
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
