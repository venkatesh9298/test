
import java.sql.*;

public class Pgrm1 {

	public static void main(String[] args) throws SQLException {
	 
		Driver d = new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver(d);
        Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","babu");
	    Statement st=con.createStatement();
	   
	    st.executeUpdate("create table bl1(sno number(3))");
	    
	    con.close();
	    System.out.println("success");
     }

	
	

	
}

