package jdbc.sql;

import java.sql.*;
public class Intro {

	public static void main(String[] args) {
		Connection mycon=null;
		Statement mys=null;
		ResultSet myr=null;
		String dburl="jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user="student";
		String pass="student";
		try {
			mycon=DriverManager.getConnection(dburl,user,pass); 
			//get a connection to a database
			mys=mycon.createStatement(); 
			// create a statement object
			myr=mys.executeQuery("select * from employees");
			//pass in your sql query
			while(myr.next()) { //process the result set
				//read data from each row
				System.out.println(myr.getString("Last_name")+", "+myr.getString("first_name"));
				
			}
		} catch (SQLException e) { //ClassNotFoundException
			System.out.println("Exception");
		}
	}

}
