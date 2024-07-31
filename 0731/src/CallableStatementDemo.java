import java.sql.*;

public class CallableStatementDemo {
    public static void main(String[] args) throws SQLException {

        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection(); //1, 2, 3

        CallableStatement cstmt = null;

        String sql = "{ call sp_test(?, ?) }"; //미완성 sql

        cstmt = conn.prepareCall(sql); //4
        //IN parameter는 setXxx()를 사용하고,
        //OUT parameter는 registerOutParameter()를 사용한다.
        //INOUT parameter는 setXxx(), registerOutParameter() 둘 다 사용한다.
        cstmt.registerOutParameter(1, Types.DATE);
        cstmt.registerOutParameter(2, Types.VARCHAR); //완전한 sql

        cstmt.execute(); //5

        System.out.println(cstmt.getDate(1));
        System.out.println(cstmt.getString(2));

        DBClose.dbClose(conn, cstmt); //7
    }
}
/*
delimiter //
CREATE PROCEDURE sp_test
(
	OUT v_now DATETIME,
    OUT v_version VARCHAR(30)
)
BEGIN
	SELECT NOW(), VERSION() INTO v_now, v_version;
END
//
delimiter ;
 */
