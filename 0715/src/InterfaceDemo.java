//public class InterfaceDemo {
//    public static void main(String[] args) {
//
//        //Mammal m = new Mammal(); interface도 추상클래스처럼 인스턴스화(객체 생성)가 안된다
//        //Mammal m = new Dog(); m.display();
//        //Mammal m1 = new Cat(); m1.display();
//        //Mammal.PI = 3.15; 상수이기 때문에 초기화 불가능
//
//        Mammal[] array = {new Dog(), new Cat()};
//        for (Mammal m : array) {
//            m.display();
//        }
//        //Mammal[] array = new Mammal[2]: 포유류를 만든 것이 아니라 포유류를 저장할 공간 2개를 만들었다는 뜻이기 때문에 new 사용 가능
//        //포유류의 배열을 만든 것이 아니라 포유류의 자식이 들어올 배열을 만든 것
//
//    }
//}
////3. interface를 구현 시 implements 키워드를 사용해야 한다
//class Dog implements Mammal {
//    @Override
//    public void display() { //interface 추상메서드를 재정의 시 반드시 public이어야 한다(interface가 무조건 public이기 때문에 자식은 public보다 작아질 수 없기 때문)
//        System.out.println("개에 맞게 재정의된 메서드");
//    }
//}
//
//class Cat implements Mammal {
//    @Override
//    public void display() {
//        System.out.println("고양이에 맞게 재정의된 메서드");
//    }
//}
