public interface InterfaceDemo1 {
    public static void main(String[] args) {
        Car sonata = new Car("EF소나타", 30_000_000);
        Car matiz = new Car("RedMatiz", 10_000_000);
        //sonata - matiz
        int result = sonata.compareTo(matiz); //sonata.compareTo가 내가되고, matiz가 other가 된다
        System.out.println(result);
    }

}

class Car implements Comparable<Car> {
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car other) { //내가 other를 뺀다. 양수면 내가 더 큰 것이고 0이면 같은 것, 음수면 other이 더 큰 것
        return this.price - other.price;
    }
}
