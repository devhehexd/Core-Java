public class LocalInnerClassDemo {
    public static void main(String[] args) {

        OuterClass out = new OuterClass();
        out.display();
    }
}

class OuterClass {
    private int a = 5; //Outer class' member variable
    private static int b = 10; //Outer class' static variable
    public void display() {
        int c = 100; //local variable
        class InnerClass {
            public void print() {
                System.out.println(c);
                //c = 1000; local 클래스에서 사용하는 매개변수나 local 변수의 값은 final임
            }
        }
        InnerClass ic = new InnerClass(); ic.print();
    }
}
