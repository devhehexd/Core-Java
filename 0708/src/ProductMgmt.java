import java.util.Scanner;

public class ProductMgmt {

	public static void main(String[] args) {
		
//		Product pencil = new Product();
//		pencil.name = "모나미 연필";
//		pencil.price = 1000;
//		
//		System.out.printf("name = %s, price = %,d원%n", pencil.name, pencil.price);
//		
//		Product computer = new Product();
//		computer.name = "컴퓨터";
//		computer.price = 2_000_000;
//		System.out.printf("name = %s, price = %,d원%n", computer.name, computer.price);
		
		Product []	array = new Product[2]; //Product 주소를 넣을 수 있는 공간을 만든 것
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while (i < 2) {
			array[i] = new Product();
			System.out.print("Name: "); array[i].name = sc.next();
			System.out.print("Price: "); array[i].price= sc.nextInt();
			i++;
		}
		for (i = 0; i < 2; i++) {
			System.out.printf("Name = %s, Price = %,d%n", array[i].name, array[i].price);
		}
	}

}
