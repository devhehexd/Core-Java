import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection(); //1, 2, 3

        String sql = "{ call sp_selectDname(?) }"; //불완전한 sql
        CallableStatement cstmt = null;

        try {
            cstmt = conn.prepareCall(sql); //4
            System.out.print("부서이름: ");
            String dName = scanner.next();

            cstmt.setString(1, dName);
            //INOUT은 동시에 registerOutParameter()도 사용해야 한다.
            cstmt.registerOutParameter(1, Types.VARCHAR);

            cstmt.execute(); //5

            System.out.printf("%s의 위치는 %s입니다.%n", dName, cstmt.getString(1));

        } catch (SQLException e) {
            System.out.println("실패");
        }
        DBClose.dbClose(conn, cstmt); //7
    }
}
//부서 이름으로 부서 위치를 출력하는 Stored Procedure
/*
delimiter //
CREATE PROCEDURE sp_selectDname
(
	INOUT v_name	VARCHAR(14)
)
BEGIN
	DECLARE v_str	VARCHAR(14);
	SELECT loc INTO v_str
    FROM dept
    WHERE dname = v_name;
    SET v_name := v_str;
END
//
delimiter ;
 */
