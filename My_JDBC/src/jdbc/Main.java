
package jdbc;
public class Main {
	public static void main(String [] args) {
		Student st = new Student();
		//st.createDatabase();
		//st.createTable();
		//st.createData();
		st.readData();
	}
}





 


/*
 package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// driver load --> loaded driver
		
		// conection estabilish
		try {
			String url = "jdbc:mysql://localhost:3306/"; // to check port on cmd --> select @@port;
			String userName = "root"; //to check user on CMD --> select user();
			String password = "Dipak/13"; 
			
			Connection conn = DriverManager.getConnection(url, userName, password); // created object of connection --> conn connection is a class or interface
			
			// statement create
			Statement stm = conn.createStatement();
			System.out.println("Connected Successfully");
			
			// execute query
			String query = "Create database JDBC"; 
			stm.execute(query);
			System.out.println("Database createed successfully ");
			
			// close connection
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
*/
