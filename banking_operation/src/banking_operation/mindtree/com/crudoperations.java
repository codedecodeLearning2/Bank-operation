package banking_operation.mindtree.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;


public class crudoperations {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("loading the driver sussfully");
		String url="jdbc:mysql://localhost/ri_db";
		String userName="test";
		String password="test123 ";
		Connection conn=null;
		//Connection conn=DriverManager.getConnection(url,userName,password);
		Connection con =DriverManager.getConnection(url, userName, password);
		Statement st=(Statement) conn.createStatement();
		
		
		String query="create table employee";
		st.execute(query);
		conn.close();
		

	}

}
