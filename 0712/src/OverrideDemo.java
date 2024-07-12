public class OverrideDemo {
    public static void main(String[] args) {

        //Object obj = new String("Hello, World");
        Base parent = new Derived();
        parent.display();

    }
}

class Base {
    public void display() {
        System.out.println("나는 부모 메소드");
    }
}
//public -> protected -> (default) -> private
class Derived extends Base {
    @Override
    public void display() { //오버라이드된 자식 method의 접근 범위는 부모 method와 같거나 더 넓어야 한다. -> public은 에러가 없지만 default가 될 경우 에러 발생
        System.out.println("나는 자식 메소드");
    }
}
