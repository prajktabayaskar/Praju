package service;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.Dao;
import model.Staff;

public class Service {
		public ArrayList<Staff> m1() throws ClassNotFoundException, SQLException{
			
			Dao d = new Dao() ;
				ArrayList<Staff> a1 = d.m1();
			
				System.out.println("In Service :"+a1);
			return a1;
			
		}
		}



