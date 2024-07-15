public class AbstractDemo1 extends Normal1 {
    public AbstractDemo1(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(super.getName());
    }

    public static void main(String[] args) {

        //Normal1 normal1 = new Normal1();
        Normal1 normal1 = new AbstractDemo1("김지민");
        normal1.display();

        }
    }

abstract class Normal1 { //한개라도 추상메서드를 가지고 있다면 반드시 추상 클래스가 되어야한다
    private String name; //field

    public Normal1(String name) { //constructor
        //super();
        this.name = name;
    }

    public abstract void display();

    public String getName() { //getter
        return name;
    }

    public void setName(String name) { //setter
        this.name = name;
    }

    @Override
    public String toString() {
        return "Normal{" + "name='" + name + '\'' + '}';
    }
}
