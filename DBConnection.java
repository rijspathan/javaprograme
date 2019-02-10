package pro;

import java.sql.*;

public class DBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con;
		//Driver loading
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/djt22", "root", "root");
		System.out.println("connected");
	}

}
