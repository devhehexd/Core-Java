
public class Ex2 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (j + 65));
			}
			System.out.println();
		}
	}
}
