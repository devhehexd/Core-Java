public class WrapperDemo {
    public static void main(String[] args) {

        //before JDK 1.5
//        int su = 5;
//        Integer in = new Integer(su); //Wrapping, Boxing
//        int another = in.intValue(); //Unwrapping, Unboxing
//        System.out.println(another);

        //after JDK 1.5
        int su = 5;
        //Integer in = su; //new Integer(su), Auto-boxing
        Integer in = su * 100;
        int another = in; //in.intValue(), Auto-unboxing
        System.out.println(another);


    }
}
