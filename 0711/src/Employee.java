public class Employee {
    String sabun;
    double salary;

    public Employee(){
        this("UnsettedSabun", 10_000_000); //this() -> 나의 또다른 생성자를 호출
                                                      //사용 시 항상 생성자의 첫 줄에 와야함
    }
    public Employee(String sabun){
        this(sabun, 10_000_000);

    }

    public Employee(double salary) {
        this("UnsettedSabun", salary);
    }

    public Employee(String sabun, double salary) {
        this.sabun = sabun;
        this.salary = salary;
    }

}
