public class ProductMargCal {

    void cal(Product[] pdArray) {

        for (int i = 0; i < pdArray.length; i++) {
            int totSp = pdArray[i].getQuantity() * pdArray[i].getSellPrice(); //전체 판매 금액
            int totBp = pdArray[i].getQuantity() * pdArray[i].getBuyPrice(); //전체 매입 금액
            int margin = totSp - (totBp + pdArray[i].getTransPrice());
            double margPer = (double) margin / totBp * 100;

            pdArray[i].setMargin(margin);
            pdArray[i].setMargPer(margPer);
        }


    }
}
