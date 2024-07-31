import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection(); //1, 2, 3

        String sql = "{ call sp_selectEmp(?, ?, ?) }"; //불완전한 sql
        CallableStatement cstmt = null;

        try {
            cstmt = conn.prepareCall(sql); //4
            System.out.print("사원번호: ");
            int empNo = scanner.nextInt();

            cstmt.setInt(1, empNo);
            cstmt.registerOutParameter(2, Types.VARCHAR);
            cstmt.registerOutParameter(3, Types.VARCHAR); //완전한 sql

            cstmt.execute(); //5

            System.out.printf("부서명: %s, 부서위치: %s%n", cstmt.getString(2), cstmt.getString(3));

        } catch (SQLException e) {
            System.out.println("실패");
        }
        DBClose.dbClose(conn, cstmt); //7
    }
}
/*
delimiter //
CREATE PROCEDURE sp_selectEmp
(
	IN v_empno	SMALLINT,
    OUT v_dname	VARCHAR(14),
    OUT v_loc	VARCHAR(13)
)
BEGIN
	SELECT dname, loc INTO v_dname, v_loc
    FROM emp JOIN dept ON (emp.deptno = dept.deptno)
    WHERE empno = v_empno;
END
//
delimiter ;
 */
