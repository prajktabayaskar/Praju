package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Staff;
import service.Service1;

public class Controller1 {
void m1()throws ClassNotFoundException, SQLException{
	Service1 s = new Service1();
	ArrayList<Staff> a1 = s.m1();
	System.out.println(a1);
}
void insertStaffRecord() throws ClassNotFoundException,SQLException{
	Service1 ss = new Service1();
	String msg = ss.insertStaffRecord(11, "Shyam", 3000, "Developer");
	System.out.println(msg);
}
public static void main(String[] args) throws ClassNotFoundException, SQLException{
	Controller1 cc = new Controller1();
	cc.insertStaffRecord();
	
}
}
