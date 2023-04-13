package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Dao3 {
	
	public String DeleteStaffRecord(int id) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		String sql = "Delete From Staff Where id = 19";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		int isDeleted = ps.executeUpdate();
		return "Data Deleted successfully";
	}

}
