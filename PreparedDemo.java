 package pro;
import java.sql.*;
import java.util.*;
public class PreparedDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded..!!");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "root");
		System.out.println("Connected");
		String q="insert into Book values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(q);
		System.out.println("Enter id name author price :");
		int id=sc.nextInt();						String name=sc.next();
		String author=sc.next();				float price=sc.nextFloat();
		pst.setInt(1, id);  			pst.setString(2, name);
		pst.setString(3, author);		pst.setFloat(4, price);
		int st=pst.executeUpdate();//execute query
	if(st>0)
	{		System.out.println("inserted");	}
	else
	{		System.out.println("failed");		}
		pst=con.prepareStatement("update Book set price=?,author=? where id=?");
		pst.setFloat(1, 500);		pst.setString(2, "Preeti");		
		pst.setInt(3,102 );		int s=pst.executeUpdate();
		if(s>0)
		{			System.out.println("updated");		}
		else
		{			System.out.println("failed");		}
		//Rtriving data from database
		pst=con.prepareStatement("select * from Book");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
System.out.println("ID :"+rs.getInt(1)+" Name :"+rs.getString(2)+" Author :"+rs.getString(3)+" Price:"+rs.getFloat(4));
		}		
		con.close();
	}}
