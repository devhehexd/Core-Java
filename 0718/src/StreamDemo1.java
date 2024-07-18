import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamDemo1 {
    public static void main(String[] args) {

        DoubleStream ds = new Random().doubles(3, 1.0, 10.0);
        ds.forEach(d -> System.out.println(d + ", "));

        int result = IntStream.rangeClosed(1, 100).sum();
        //range는 끝 값을 포함하지 않고, rangeClosed는 끝 값을 포함한다 -> range: 1~99, rangeClosed: 1~100
        System.out.println(result);
    }
}
