public class StaticDemo {
    public static void main(String[] args) {

        Tiger[] array = new Tiger[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Tiger();
        }
        for (Tiger t : array) {
            System.out.println("a = " + t.a + ", b = " + Tiger.b);
            //a는 멤버 변수이기 때문에 Tiger가 4개 만들어지면 a도 4개 만들어짐. 따라서 1만 더해진 a가 있는 Tiger 객체가 4개 있는것
            //b는 static 변수로 static 영역에 저장되기 때문에 공유임. 따라서 1이 4번 더해져서 4임.
        }
    }
}

class Tiger {
    int a;
    static int b;

    public Tiger() {
        a++;
        b++;
    }
}
