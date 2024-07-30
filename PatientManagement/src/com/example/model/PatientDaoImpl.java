package com.example.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDaoImpl implements PatientDao {

	private Connection conn;

	public PatientDaoImpl() {
		DBConnection dbConn = new DBConnection();
		this.conn = dbConn.getConnection(); //1, 2, 3
	}

	@Override
	public boolean createPatient(PatientVO p) throws SQLException { //부모가 Exception을 던져야 자식도 Exception을 던질 수 있다
		Statement stmt = this.conn.createStatement(); //4
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO Patient ");
		sb.append("VALUES (" + p.getNumber() + ",'" + p.getCode() + "',");
		sb.append(p.getDays() + "," + p.getAge() + ",'" + p.getDept() + "',");
		sb.append(p.getOperFee() + "," + p.getHospitalFee() + "," + p.getMoney() + ")");
		int su = stmt.executeUpdate(sb.toString());
		DBClose.dbClose(this.conn, stmt);
		return (su == 1) ? true: false;
	}

	@Override
	public PatientVO readPatient(int number) {

		return null;
	}

	@Override
	public List<PatientVO> readAllPatient() throws SQLException {

		String sql = "SELECT number, dept, operfee, hospitalfee, money ";
		sql += "FROM Patient ORDER BY number DESC";
		Statement stmt = this.conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<PatientVO> list = new ArrayList<>();

		while (rs.next()) {
			int number = rs.getInt("number");
			String dept = rs.getString("dept");
			int operfee = rs.getInt("operfee");
			int hospitalfee = rs.getInt("hospitalfee");
			int money = rs.getInt("money");

			PatientVO p = new PatientVO();
			p.setNumber(number);
			p.setDept(dept);
			p.setOperFee(operfee);
			p.setHospitalFee(hospitalfee);
			p.setMoney(money);

			list.add(p);
		}

		DBClose.dbClose(conn, stmt, rs);

		return list;
	}

	@Override
	public boolean updatePatient(PatientVO p) {

		return false;
	}

	@Override
	public boolean deletePatient(int number) throws SQLException {

		//Statement stmt =this.conn.createStatement();
		String sql = "DELETE FROM Patient WHERE number = ?"; //불완전한 sql문
		PreparedStatement pstmt = this.conn.prepareStatement(sql);
		pstmt.setInt(1, number); //완전한 sql문
		int row = pstmt.executeUpdate();

		return (row == 1) ? true : false;
	}

}
