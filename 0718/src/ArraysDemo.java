import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 6, 8, 1, 2);
        List<String> list1 = Arrays.asList("한지민", "홍지민", "이지민", "박지민");

        int[] array = {5, 7, 1, 2, 7, 2, 9, 5};
        Arrays.sort(array); //Arrays클래스의 sort는 일차원배열, 오름차순만 제공함
        for (int i : array) {
            System.out.print(i + ", ");
        };
    }
}
