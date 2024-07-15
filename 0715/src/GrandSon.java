public class GrandSon implements Son{
    public static void main(String[] args) {

        GrandFather jimin = new GrandSon();
        jimin.grandFather();

        Father chulsu = new GrandSon();
        chulsu = new GrandSon();
        chulsu.grandFather();
        chulsu.father();

        Mother younghee = new GrandSon();
        younghee.mother();

        Son youngsu = new GrandSon();
        youngsu.grandFather();
        youngsu.father();
        youngsu.mother();
        youngsu.son();

        Son[] array = new Son[3];
        array[0] = new GrandSon();
        System.out.println(Father.NAME + ", " + Mother.NAME); //static이기 때문에 interface 이름으로 접근 가능


    }

    @Override
    public void son() {
        System.out.println("Called by son()");
    }

    @Override
    public void father() {
        System.out.println("Called by father()");
    }

    @Override
    public void grandFather() {
        System.out.println("Called by grandFather()");
    }

    @Override
    public void mother() {
        System.out.println("Called by mother()");
    }
}
