/*
@FunctionalInterface
1. 일반적으로 interface는 한 개 이상의 추상메소드를 가질 수 있다. 하지만 여러개의 추상 메소드가 있으면 Lambda Expression에 에러 발생
그래서 @FunctionalInterface는 Lambda Expression에서 사용하기 위한 interface를 지정하는 annotation이다.
 */

public class LambdaDemo2 {
    public static void main(String[] args) {

//        1st way: Anonymous Class를 이용
//        Comparable compare = new Comparable() {
//            @Override
//            public int compare(int front, int back) {
//                return front - back;
//            }
//        };

        //2nd way: Polymorphic Prameter를 이용하는 방법
//        calculator(new Comparable() {
//            @Override
//            public int compare(int front, int back) {
//                return front - back;
//            }
//        });

        //3.
        calculator((front, back) -> front - back);
    }

    private static void calculator(Comparable comp) {
        int a = 5, b = 10;
        int result = comp.compare(a, b);
        System.out.println("result = " + result);
    }
}

@FunctionalInterface
interface Comparable {
    int compare(int front, int back);
}
