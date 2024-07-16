public class AnonymousClassDemo {
    public static void main(String[] args) {
//        Canine ca = new Dog();
//        ca.roam();
//        ca.bark();

        Canine ca = new Canine() { //익명객체
            @Override
            void bark() {
                System.out.println("으르렁 짖다.");
            }
        };
        ca.bark();
        ca.roam();
    }

}

abstract class Canine {
    abstract void bark();

    void roam(){
        System.out.println("여기저기 배회하다.");
    }

}

//class Dog extends Canine {
//    void bark() {
//        System.out.println("으르렁 짖다");
//    }
//}