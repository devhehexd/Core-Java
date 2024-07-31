import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection(); //1, 2, 3

        String sql = "{ call sp_insertDept(?, ?, ?) }"; //불완전한 sql
        CallableStatement cstmt = null;

        try {
            cstmt = conn.prepareCall(sql); //4
            System.out.print("부서번호: ");
            int deptNo = scanner.nextInt();
            System.out.print("부서이름: ");
            String dName = scanner.next();
            System.out.print("부서위치: ");
            String loc = scanner.next();

            cstmt.setInt(1, deptNo);
            cstmt.setString(2, dName);
            cstmt.setString(3, loc); //완전한 sql

            cstmt.execute(); //5
            System.out.println("새 레코드 삽입 성공");

        } catch (SQLException e) {
            System.out.println("삽입 실패");
        }
        DBClose.dbClose(conn, cstmt); //7
    }
}
/*
delimiter //
CREATE PROCEDURE sp_insertDept
(
	IN v_deptno	TINYINT,
    IN v_dname	VARCHAR(14),
    IN v_loc	VARCHAR(13)
)
BEGIN
	INSERT INTO dept_clone(deptno, dname, loc)
    VALUES (v_deptno, v_dname, v_loc);
    COMMIT;
END
//
delimiter ;
 */
