public class Dog extends Mammal {

    public String name = "나는 개다"; //변수가 같으면 상속되지 않는다. (overshadow 변수)
                                    //따라서 Mammal의 name이 아니라 Dog의 name 사용
    public void bark() {
        System.out.println("짖다");
    }

    public void print() { //부모 자식 메서드가 같으면 상속되지 않는다 (override)
        System.out.println("나는 개다");
    }
}
