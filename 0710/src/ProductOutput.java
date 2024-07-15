public class ProductOutput {

    void output(Product[] pdArray) {

        System.out.println("                        <<상품별 판매 이익금 및 이익율표>>");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("상품명\t\t\t\t\t수량\t판매단가\t매입단가\t운송료\t\t이익금\t\t\t이익률");
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < pdArray.length; i++) {
            System.out.printf("%-20s%,d\t%,d\t%,d\t%,d\t\t%,d\t%10.2f%n", pdArray[i].getName(), pdArray[i].getQuantity(),pdArray[i].getSellPrice(),
                    pdArray[i].getBuyPrice(), pdArray[i].getTransPrice(), pdArray[i].getMargin(), pdArray[i].getMargPer());
        }
    }
}
