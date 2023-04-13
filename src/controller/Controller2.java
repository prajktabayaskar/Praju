package controller;

import java.sql.SQLException;

import service.Service1;
import service.Service2;

public class Controller2 {
void insertStaffRecord() throws ClassNotFoundException, SQLException{
	Service2 ss = new Service2();
	String msg = ss.insertStaffRecord(17, "Sushil", 30000, "Tester");
	System.out.println(msg);
}
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Controller1 cc = new Controller1();
		cc.insertStaffRecord();

	}
	}
