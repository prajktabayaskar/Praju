package service;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.Dao;
import dao.Dao1;
import model.Staff;

public class Service1 {
	public ArrayList<Staff> m1() throws ClassNotFoundException, SQLException{
		
		Dao d = new Dao() ;
			ArrayList<Staff> a1 = d.m1();
		
			System.out.println("In Service :"+a1);
		return a1;
		
}
	public String insertStaffRecord(int id, String name, int salary, String des) throws ClassNotFoundException, SQLException{
		Dao1 dd = new Dao1();
		String mssg = dd.insertStaffRecord(id, name, salary, des);
		return mssg;
	
}
}
