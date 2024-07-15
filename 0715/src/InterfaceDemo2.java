public interface InterfaceDemo2 {
    public static void main(String[] args) {
        Product pencil = new Product("모나미연필");
        //Product ballpen = pencil; //주소 복사 -> 두 개의 객체가 같은 주소를 가르킨다
        Product ballpen = pencil.copy(); //값 복사
        System.out.println(ballpen.name);
        pencil.name = "컴퓨터";
        System.out.println(ballpen.name); //Cloneable은 객체의 값 복사이기 때문에 바뀌지 않는다

    }
}

class Product extends Object implements Cloneable { //flag interface
    String name;

    public Product(String name) {
        this.name = name;
    }

    public Product copy() {
        Product target = null;
        try {
            Object obj = this.clone();
            if (obj instanceof Product) {
                target = (Product) obj;
            }else {
                System.out.println("형변환 안됨.");
            }
        } catch (CloneNotSupportedException e) {
            System.out.println("복제 안됨.");
        }
        return target;
    }
}
