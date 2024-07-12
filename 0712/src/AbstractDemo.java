public class AbstractDemo {
    public static void main(String[] args) {

        Tiger t = new Lion();
        t.display();

    }
}

abstract class Tiger { //추상 클래스는 정상 메소드로만으로 구성될 수 있다. 하지만 정상 메서드와 추상 메서드가 섞여있다면 반드시 추상 클래스여야한다.
    public void print() {
        System.out.println("나는 정상적인 메소드");
    }
    public abstract void display(); //abstract 메서드(추상 메서드)는 바디가 없다
}

class Lion extends Tiger {
    public void display() {
        System.out.println("나는 자식 메소드");
    }
}
