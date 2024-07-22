//7단계
//1. import(java.sql.*)
import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {

        //2. MySQL Driver Loading
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class Founded");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }

        //3. Memory에 loading된 MySQL Driver를 이용하여 Connection
        String url = "jdbc:mysql://127.0.0.1:3306/mycompany";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, "root", "rlqja72201");
            System.out.println("Connection Success");
        } catch (SQLException e) {
            System.out.println("Connection Failure");
        }

        //4. Statement 객체 생성
        Statement stmt = null;

        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //5. Statement 객체를 이용하여 sql 실행
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT now(), version()"); //SELECT용 (SELECT를 사용할 때만 executeQuery)
        } catch (SQLException e) {
            System.out.println("Query Syntax Error");
        }

        //6. ResultSet의 결과를 parsing
        try {
            rs.next(); //중요
            //pointer(cursor)가 처음에 데이터 위에 위치하고 있기 때문에 next()를 해야 데이터를 읽어 올 수 있음
            String now = rs.getString(1); //JDBC의 index는 0이 아니라 1부터 시작한다!
            String version = rs.getString(2);
            System.out.println(now + ", " + version);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        //7. 반드시 Close해야 함
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
