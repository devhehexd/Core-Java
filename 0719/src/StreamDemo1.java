import java.util.Random;
import java.util.stream.IntStream;

/*
java.lang.IllegalStateException 발생 이유
1.한번 사용한 Stream은 재사용할 수 없는 일회성 객체이기 때문이다.
2.따라서 필요하다면 다시 생성해야 한다.
 */


public class StreamDemo1 {
    public static void main(String[] args) {

        //IntStream is = IntStream.rangeClosed(1, 100); //Stream 생성
        //int sum = is.sum(); //최종 연산
        //long count = is.count(); //최종연산의 결과는 Stream이 아니기 때문에 일단 최종연산을 수행하면 다시 다른 Stream 연산을 수행할 수 없다

        //1부터 100사이의 난수를 발생하여 중복을 배제하고 5개를 추출하여 소팅까지 수행하자
        IntStream sortedInt = new Random().ints(1, 100).distinct().limit(5).sorted(); //distint: 중복 배제
        sortedInt.forEach(i -> System.out.print(i + "\t"));

    }
}
