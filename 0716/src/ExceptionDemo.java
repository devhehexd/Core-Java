import java.io.File;
import java.util.Scanner;

public class ExceptionDemo { //Exception은 runtime오류
    public static void main(String[] args) {

//        Car carnival = new Car();
//        carnival.name = "기아 카니발";
//        System.out.println(carnival.name);
//        carnival = null; //NullPointerException
//        if (carnival != null) {
//            System.out.println(carnival.name);
//        } else {
//            System.out.println("이미 사망");
//        }
//        String money = "30_000_000원";
//        int intMoney = Integer.parseInt(money); //NumberFormatException
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Money(반드시 숫자만 입력하세요)? : ");
//        int money = sc.nextInt(); //int 외 다른 타입 입력 시 InputMismatchException
//        int[] array = {1, 2, 3, 4};
//        for (int i = 0; i <= array.length; i++) {
//            System.out.println(array[i]); //ArrayIndexOutOfBoundsException
        Scanner sc = new Scanner(new File("ExceptionDemo.java"));
        }
    }
}

class Car {
    public String name;
}
