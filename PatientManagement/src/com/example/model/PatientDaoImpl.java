package com.example.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
	public List<PatientVO> readAllPatient() {

		return null;
	}

	@Override
	public boolean updatePatient(PatientVO p) {

		return false;
	}

	@Override
	public boolean deletePatient(int number) {

		return false;
	}

}
