public class OuterClass2 {
    public static void main(String[] args) {

        OuterClass2 oc = new OuterClass2();
        oc.display();

    }

    void display() {
        int a = 5; //local variable
        class InnerClass2 { //local class
            int b = 100; //local inner class' inner variable
            static int c = 500; //local inner class' static variable

            void print() {

            }
        }
        InnerClass2 ic = new InnerClass2();
        System.out.println(InnerClass2.c); //static이므로 클래스명으로 바로 접근 가능
        System.out.println(ic.b); //멤버 변수이므로 객체 생성 후 접근 가능
    }
}
