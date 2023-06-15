package banking_operation.mindtree.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.lang.ClassCastException;
//import java.ClassNotFoundException;

import com.mysql.jdbc.Statement;

public class bank_useroperation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("yogesh firt changesmm");
		System.out.println("yogesh third changes");
	    System.out.println("connection done jdjksuceesfully congrats");
		System.out.println("1.Insert the data into table\n2.upadte the data \n3.delete the data\n4.select the data\n5 Drop the date");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the operation no");
		int a=sc.nextInt();
		Connection con=null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d2","root","root");
		PreparedStatement ps=null;
		
		
		java.sql.Statement statement=null;
	    statement = con.createStatement();
	    
		int b;          //accountnumberid
		String c;       //name
		String d;       //account type
		int e;          // balance   //
		int f;          //withdrawable mone
		
 	   
 	   
 	   switch(a) {
 	   case 1:
 		  String query = "insert into customer (accountnumberid,name,account_type,balance,withdrawable_money) values(?,?,?,?,?)";
 	 	   ps=con.prepareStatement(query);
 		  System.out.println("Enter id: ");
 	 	   ps.setInt(1, b=sc.nextInt());
 	 	   //b=sc.nextInt();
 	 	   System.out.println("enter the name");
 	 	   ps.setString(2,c=sc.next());
 	 	   System.out.println("enter the account_type");
 	 	   ps.setString(3,d=sc.next());
 	 	   System.out.println("enter the balance");
 	 	   ps.setInt(4, e=sc.nextInt());
 	 	   System.out.println("withdrawable_money");
 	 	   ps.setInt(5, f=sc.nextInt());
 	 	   ps.executeUpdate();
 	 	   System.out.println("enter data succesfully");
 	 	  
 	 	  
 	   case 2:
 		  
 	 	 //  System.out.println("enter the name");
 	 	 //  ps.setString(2,c=sc.next());
 	 	 //  System.out.println("enter the account_type");
 	 	 //  ps.setString(3,d=sc.next());
 	 	  // System.out.println("enter the balance");
 	 	 //  ps.setInt(4, e=sc.nextInt());
 	 	   
 	 	 
 	 	   String query1="update customer set withdrawable_money=? where accountnumberid= ?";
 	 	 ps=con.prepareStatement(query1);
 	 	 System.out.println("Enter id: ");
	 	   ps.setInt(2, b=sc.nextInt());
	 	  System.out.println("withdrawable_money");
	 	   ps.setInt(1, f=sc.nextInt());
	 	  ps.executeUpdate();
 	 	   System.out.println("updated the withdrawable money");
 	 	   
 	 	   break;
 		   
 	   case 3:
 		   String query3="delete from customer where accountnumberid=?";
 		   ps=con.prepareStatement(query3);
 		   System.out.println("enter id: ");
 		   ps.setInt(1, b=sc.nextInt());
 		   ps.executeUpdate();
 		   System.out.println("delete withdrawable money");
 		   
 		   break;
 	   case 4:
/* 		   String query4="select*from customer";
 		   System.out.println("show table result");
 		   ps=con.prepareStatement(query4);
 		   ps.executeUpdate();
 		   System.out.println("result");
 */		   
 		   
 		  
          String query4="select name,account_type from customer";
          ResultSet result = statement.executeQuery(query4);
          while (result.next()) {
        	  
              // Print name an age
              System.out.println(
                  "Name: " + result.getString("name"));
              System.out.println(
                  "account_type:" + result.getString("account_type"));
          }
          break;
 	   case 5:
 		   //drop the data
 		   String query5="drop table customer";
 		  //String query = "Drop table Customers";
 	      //Executing the query
 		  statement.execute(query5);
 		  System.out.println("drop the table succesfully");
 		  break;
 		  
 	   case 6:
 		   
          
 		   
 		   
 	   }
 	   
 	   
 	   
 	   //System.out.println(100+100+"xyz");
 	  // System.out.println("xyz"+100+100);
		
        

		
		
		
		
		
		
		
		
		
	}

}
