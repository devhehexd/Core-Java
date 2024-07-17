//Set은 중복을 허용하지 않는다

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        String[] array = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
        Set<String> hashset = new HashSet<>();
        Set<String> treeset = new TreeSet<>();
        for (String element : array) {
            hashset.add(element);
            treeset.add(element);
        }
        System.out.println("Hashset = " + hashset);
        System.out.println("Treset = " + treeset);

    }
}
