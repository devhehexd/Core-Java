import java.io.IOException;
import java.io.InputStream;

public class IODemo {
    public static void main(String[] args) {

        System.out.print("글자 한 개를 입력하세요 : ");
        InputStream is = System.in; //1byte만 읽을 수 있기 때문에 한글은 못읽음
        int code = 0;

        try {
            code = is.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("code = " + code);
    }
}
