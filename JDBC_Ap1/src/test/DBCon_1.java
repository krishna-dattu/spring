package test;
import java.sql.*;
public class DBCon_1 {
	public static void main(String[] args) {
        try {
        	Connection con = DriverManager.getConnection
        	("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
        	Statement stm = con.createStatement();
        	ResultSet rs = stm.executeQuery("select * from Product54");
        	while(rs.next())
        	{
        		System.out.println(rs.getString(1)+"\t"+
        	        rs.getString(2)+"\t"
        	        +rs.getFloat(3)+"\t"
        	        +rs.getInt(4));
        	}
        	con.close();
        }catch(Exception e) {e.printStackTrace();}
	}

}
