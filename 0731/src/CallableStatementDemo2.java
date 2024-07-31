import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementDemo2 {
    public static void main(String[] args) {

        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection(); //1, 2, 3

        CallableStatement cstmt = null;

        String sql = "{ call sp_deleteDept() }";

        try {
            cstmt = conn.prepareCall(sql); //4
            cstmt.execute(); //5
            System.out.println("삭제 성공");
        } catch (SQLException e) {
            System.out.println("삭제 실패");
        }
        DBClose.dbClose(conn, cstmt); //7
    }
}
/*
delimiter //
CREATE PROCEDURE sp_deleteDept()
BEGIN
	DELETE FROM dept_clone;
END
//delimiter ;
 */
