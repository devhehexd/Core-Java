public class PolymorphismDemo3 {
    public static void main(String[] args) {

        Mammal[] array = new Mammal[4];
        array[0] = new Dog();
        array[1] = new Cat();
        array[2] = new American();
        array[3] = new Korean();

        for (Mammal m : array) {
            m.sayThing();
        }
    }
}
