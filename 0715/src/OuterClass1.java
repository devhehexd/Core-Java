public class OuterClass1 {
    public static void main(String[] args) {


        OuterClass1.InnerClass1 ic = new OuterClass1.InnerClass1();
        ic.display();
        ic.print();

        System.out.println(ic.c);
        System.out.println(InnerClass1.d); //static


    }
    private int a = 5; //outer class' member variable
    private static int b = 10; //outer class' static variable

    private static class InnerClass1 { // static inner class

        private int c = 100; //static inner class' member variable
        private static int d = 500; //static inner class' static variable

        public void display() { //static inner class' member method
            System.out.println();
        }

        public static void print() { //static inner class' static method
            System.out.println();
        }
    }
}
