public class WrapperDemo {
    public static void main(String[] args) {

//        int su = 5;
//        Integer in = new Integer(su); //Wrapping, Boxing //Heap에 있는 5
//        int another = Integer //Unwrapping, Unboxing

        int su = 5;
        Integer in = su * 100; //Auto-boxing
        int another = in; //Auto-unboxing
        System.out.println(another);

        //Wrapper type은 8개 -> primitive type 8개를 객체화 한 것임
    }
}
