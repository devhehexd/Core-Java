public class Bat extends Mammal implements Birds {

    @Override
    public void fly() {
        System.out.println("하늘을 날다");
    }

    @Override
    public void giveBirthTo() {

    }

    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.fly();
        bat.giveBirthTo();
    }
}
