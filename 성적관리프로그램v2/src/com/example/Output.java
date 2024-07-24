package com.example;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.List;

public class Output extends Object {

	private Connection conn;
	private List<StudentVO> list; //field

	public Output(List<StudentVO> list) {
		this.list = list;
		DBConnection dbconn = new DBConnection();
		this.conn = dbconn.getConnection(); //1, 2, 3
	}
	void output() {
		//for (Student std : this.array)
		//System.out.println(std); //std.toString
		//this.list.forEach(std -> System.out.println(std));
		Statement stmt = null;

		for (StudentVO std : this.list) {
			try {
				stmt = this.conn.createStatement();
				String sql = "INSERT INTO Student  ";
				sql += "VALUES ('" + std.getHakbun() + "','" + std.getName() + "', ";
				sql += std.getKor() + ", " + std.getEng() + ", " + std.getMath();
				sql += ", " + std.getEdp() + ", " + std.getTotal() + ", " + std.getAvg();
				sql += ", '" + std.getGrade() + "')";
				stmt.executeUpdate(sql);
				} catch (SQLException e){
				System.out.println(e.getMessage());
				}
			};
			DBClose.dbClose(this.conn, stmt);
			System.out.println("DB Inserted Successfully");

		}
	}
