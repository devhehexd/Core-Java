import java.sql.*;
import java.util.Scanner;

public class CallableStatementDemo6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection(); //1, 2, 3

        String sql = "{ call sp_select_emp_dept(?) }"; //불완전한 sql
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            cstmt = conn.prepareCall(sql); //4
            System.out.print("부서번호: ");
            int deptNo = scanner.nextInt();


            cstmt.setInt(1, deptNo); //완전한 SQL 문장

            rs = cstmt.executeQuery(); //5
            boolean flag = rs.next();

            if (!flag) { //레코드가 한개도 없다면
                System.out.println("조건에 맞는 결과값이 없습니다.");
            } else { //한개라도 있다면
                do {
                    System.out.printf("%d\t%s\t%s\t%s%n",
                            rs.getInt("empno"), rs.getString("ename"),
                            rs.getString("dname"), rs.getString("loc"));

                } while (rs.next());
            }

        } catch (SQLException e) {
            System.out.println("실패");
        }
        DBClose.dbClose(conn, cstmt, rs); //7
    }
}
//부서 번호로 소속사원의 사원번호, 사원명, 부서명, 부서위치
/*
delimiter //
CREATE PROCEDURE sp_select_emp_dept
(
	IN v_deptno	TINYINT
)
BEGIN
	SELECT empno, ename, deptno, loc, dept.deptno
    FROM emp NATURAL JOIN dept
    WHERE deptno = v_deptno;
END
//
delimiter ;
 */
