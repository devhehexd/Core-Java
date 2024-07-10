public class Product {

//    private String notebook;
//    private String bolpen;
//    private String books;
//    private String pencil;
//    private String file;
//    private String diskette;
//    private String paper;

    private String[] name;
    private int quantity;
    private int sellPrice;
    private int buyPrice;
    private int transPrice;
    private int margin;
    private int margPer;

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getTransPrice() {
        return transPrice;
    }

    public void setTransPrice(int transPrice) {
        this.transPrice = transPrice;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public int getMargPer() {
        return margPer;
    }

    public void setMargPer(int margPer) {
        this.margPer = margPer;
    }
}
