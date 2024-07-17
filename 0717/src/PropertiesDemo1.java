import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {

        Properties info = new Properties(); //properties -> key=value '='으로 key와 value를 구분
        info.load(new FileInputStream(new File("D:\\Workspace\\0717\\productinfo.properties")));
        System.out.println("나이 = " + info.getProperty("age"));
        System.out.println("거주지 = " + info.getProperty("city"));

    }
}
