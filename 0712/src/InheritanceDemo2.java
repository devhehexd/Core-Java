//3. static 변수와 static method는 상속과 관련이 없다
public class InheritanceDemo2 {
    public static void main(String[] args) {
        Student jimin = new Student();
        System.out.println(Student.age);
    }
}

class Person {
    String name = "한지민";
    static int age = 28;
}

class Student extends Person {

}