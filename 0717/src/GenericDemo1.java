import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GenericDemo1 {
    public static void main(String[] args) {

        //Object obj = "Hello";
        //Vector<Object> v1 = new Vector<String>(); //generic 세계에서는 형변환이 일어나지 않는다
        //Vector v1 = new Vector(); //raw type
        //Vector<String> v1 = new Vector<String>(); v1.add(5); //String인데 Integer을 넣어서 오류
        //Vector<?> v1 = new Vector<?>(); //wildcard type
        //Product<Integer> pencil = new Product<Integer>(1000);
        //Product<Double> ballpen = new Product<Double>(100.0);
        //Product<Object> obj = new Product<Object>(new Car<>());

        //Car<?> car = new Car<Integer>(1000);
        //Object obj = car.getPrice();

        //Car<? extends Number> car1 = new Car<Integer>(100);
        //Car<? super Number> car2 = new Car<Object>(1000);
        //car2.getPrice();
        //super인 경우에는 실체형을 따라가고
        //extends인 경우에는 선언형을 따라간다
        //?는 Object형을 따라간다

        List<Car> list = new ArrayList<Car>();
    }
}

//class Product<T extends Number> {
class Product<T> {
    private T price;

    public Product(T price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.valueOf(price);
    }
}
