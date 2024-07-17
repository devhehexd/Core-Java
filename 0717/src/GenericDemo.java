public class GenericDemo {
    public static void main(String[] args) {

        //Car carnival = new Car(40_000_000);
        //carnival.setPrice(45_000_000);
        //System.out.println(carnival); //carnival.toString()

        Car<Integer> carnival = new Car<Integer>(45_000_000);
        System.out.printf("price = %d%n", carnival.getPrice());
        Car<String> matiz = new Car<>("10,000,000");
        System.out.printf("price = %s%n", matiz.getPrice());
        Car<Double> sonata = new Car<>(45_000_000.0);
        System.out.printf("price = %.2f%n", sonata.getPrice());
    }
}

class Car <T>{
    private T price;

    public Car(T price) {
        this.price = price;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }
}
