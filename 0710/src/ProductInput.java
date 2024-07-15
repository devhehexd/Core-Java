import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProductInput {

    void input(Product[] pdArray) throws IOException {

        Scanner scanner = new Scanner(new File("D:\\Workspace\\0710\\productdata.dat"));

        for (int i = 0; i < pdArray.length; i++) {
            pdArray[i] = new Product();
            String line = scanner.nextLine();
            String[] tmpArr = line.split("\\s+");

            pdArray[i].setName(tmpArr[0].trim());
            pdArray[i].setQuantity(Integer.parseInt(tmpArr[1].trim()));
            pdArray[i].setSellPrice(Integer.parseInt(tmpArr[2].trim()));
            pdArray[i].setBuyPrice(Integer.parseInt(tmpArr[3].trim()));
            pdArray[i].setTransPrice(Integer.parseInt(tmpArr[4].trim()));
        }



    }
}
