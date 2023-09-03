package task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcconnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "raji@1123");
			Statement st=connect.createStatement();
			st.execute("create database employeedetils;");
			st.execute("create table  employeedetils.emp_details (empcode int(5), empname varchar(20), empage int(5), esalary int(5));");
			 
			st.execute("insert employeedetils.emp_details values('101','Jenny','25','10000');");
			st.execute("insert employeedetils.emp_details values('102','Jacky','30','20000');");
			st.execute("insert employeedetils.emp_details values('103','Joe','20','40000');");
			st.execute("insert employeedetils.emp_details values('104','John','40','80000');");
			st.execute("insert employeedetils.emp_details values('105','Shameer','25','90000');");
			ResultSet re=st.executeQuery("select * from employeedetils.emp_details;");

			while(re.next()) {
				
				System.out.print(re.getString(1)+"-------");
				System.out.print(re.getString(2)+"-------");
				System.out.print(re.getString(3)+"-------");
				System.out.print(re.getString(4)+"-------");
				System.out.println();
			}
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
