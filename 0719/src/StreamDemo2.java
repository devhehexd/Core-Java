//reduce()
//누적할 때 사용

import java.util.stream.IntStream;

public class StreamDemo2 {
    public static void main(String[] args) {

        IntStream is = IntStream.range(1, 101); //Stream 생성
        int total = is.reduce(0, (a, b) -> a + b); //(초기값, 이항연산을 위한 변수)
        //a=0(초기값), b=1 -> a+b연산 수행 -> a=1, b=2 -> a+b연산 수행 -> a=3, b=4 .......
        System.out.println(total);
    }
}
