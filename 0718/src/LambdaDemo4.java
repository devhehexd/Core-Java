public class LambdaDemo4 {
    public static void main(String[] args) {

        Person1 jimin = new Person1();

        //1st polymorphic parameter를 이용
//        jimin.greeting(new Say() {
//            @Override
//            public int something() {
//                System.out.println("I'm Jimin");
//                System.out.println("Nice to meet you");
//                return 100;
//            }
//        });

        //2nd Lambda Expression을 이용
        jimin.greeting(() -> {
            System.out.println("I'm Jimin");
            System.out.println("Nice to meet you");
            return 200;
        });
    }

    @FunctionalInterface
    interface Say1 {

        int something();
    }

    static class Person1 {
        public void greeting(Say1 say) {

            int value = say.something();
            System.out.println("value = " + value);
        }
    }
}
