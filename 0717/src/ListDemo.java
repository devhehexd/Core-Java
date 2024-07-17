//중복허용, 인덱스로 접근

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {

        String[] array = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
        List<String> list = new ArrayList<>(5); //기본적으로 방 10개 생성(default 10개). ()안에 원하는 초기 방 개수 입력가능
        Vector<String> vector = new Vector<>(1, 1); //초기 방 개수, (방이 꽉 찼을 때)증가시킬 방 개수
        for (String element : array) {
            list.add(element);
        }
        System.out.println("현재 방 갯수: " + list.size());
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
