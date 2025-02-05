import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        String[] array = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
//        Set<String> set = new HashSet<>();
//        for (String element : array) {
//            set.add(element);
//        }
//
//        //bulk로 데이터를 추출하고자 할 때, Enumeration, Iterator
//        Iterator<String> iters = set.iterator();
//        while (iters.hasNext()) {
//            System.out.print(iters.next() + ",");
//        }
        Vector<String> vector = new Vector<>();
        for (String element : array) {
            vector.add(element);
        }
        Enumeration<String> enums = vector.elements();
        while (enums.hasMoreElements()) {
            System.out.print(enums.nextElement() + ",");
        }

    }
}
