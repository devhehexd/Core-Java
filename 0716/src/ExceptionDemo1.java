public class ExceptionDemo1 {
    public static void main(String[] args) {

        Car matiz = new Car();
        matiz.name = "대우 마티즈";
        System.out.println(matiz.name);
        matiz = null;
        try {
            System.out.println(matiz.name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 벗어났음.");
            //System.out.println(e.getMessage()); //에러 메세지만
            //System.out.println(e); //e.toString() //에러 메세지와 Exception type
            //e.printStackTrace(); //에러 메세지, 에러 발생 라인 등 가장 자세하게 표시
        } catch (NegativeArraySizeException e) {
            System.out.println("배열의 크기는 음수이면 안됩니다.");
        } catch (RuntimeException e) { //자식은 부모로 형변환이 가능함 (unchecked exception들의 부모 RuntimeException)
            System.out.println("여기서 잡았음.");
        }
    }
}
