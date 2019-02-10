package pro;
import java.sql.*;
public class JDBCStepDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//loading driver
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("driver loaded..!!");
	//it loads the driver class into JVM during runtime
	//connection establishment
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "root");
	System.out.println("Connected");
	//statement creation
	Statement stmt=con.createStatement();
	//execute statement
	String query="insert into Book values(111,'Let us c','Yashwant Kanetkar',1150)";
	int st=stmt.executeUpdate(query);
	System.out.println(st);
	if(st>0)
	{
		System.out.println("Record inserted successfully");
	}
	else
	{
		System.out.println("insertion failed");
	}
}
}
