package com.student;

import java.sql.*;
import java.sql.DriverManager;

public class LoginDao {
   public boolean insert(User user) {
	   Connection con = null;
       PreparedStatement pst = null;
       boolean result = false;
	   try {
		   Class.forName("com.mysql.jdbc.Driver");  

		   con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/student","root","root");  
		   String query="insert into student(UserName, password)  values(?,?);";
		    pst=con.prepareStatement(query);
		   pst.setString(1, user.getUserName());
		   pst.setString(2, user.getPassword());
		   ResultSet rs=pst.executeQuery();
		   result=rs.next();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
		   return result;
	   }
	   
	return result;
}
}
