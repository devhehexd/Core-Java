//2. prviate 멤버는 상속되지 않는다
public class InheritanceDem1 {
    public static void main(String[] args) {
        Frog f = new Frog();
        //f.name = "개구리"; private이기 때문에 접근안됨
    }
}

class 양서류 {
    private String name;
    int weight;
}

class Frog extends 양서류 {

}
