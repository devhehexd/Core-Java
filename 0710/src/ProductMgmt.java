public class ProductMgmt {
    public static void main(String[] args) throws java.io.IOException {

        Product[] pdArray = new Product[7];
        new ProductInput().input(pdArray);
        new ProductMargCal().cal(pdArray);
        new ProductOutput().output(pdArray);
    }
}
