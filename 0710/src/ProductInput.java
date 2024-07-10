import java.util.Scanner;

public class ProductInput {

    void input(Product pd) throws java.io.IOException {

        Product[] arr = new Product[5];
        Scanner scanner = new Scanner(new java.io.File("productdata.dat"));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Product();
            String line = scanner.nextLine();

            String[] arr2 = line.split("\\s+");
            arr[i].setName(arr2[0].trim());
            arr[i].setQuantity(Integer.parseInt(arr2[1].trim()));
            arr[i].setSellPrice(Integer.parseInt(arr2[2].trim()));
            arr[i].setBuyPrice(Integer.parseInt(arr2[3].trim()));
            arr[i].setTransPrice(Integer.parseInt(arr2[4].trim()));
        }



    }
}
