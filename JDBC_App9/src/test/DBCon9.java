package test;
import java.sql.*;
import java.util.*;
public class DBCon9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			Connection con =DriverManager.getConnection
    	    ("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			System.out.println("Enter the CustId:");
			int cId = Integer.parseInt(s.nextLine());
			System.out.println("Enter the CustName:");
			String cName = s.nextLine();
			System.out.println("Enter the CustCity:");
			String city = s.nextLine();
			System.out.println("Enter the CustState:");
			String state = s.nextLine();
			System.out.println("Enter the PinCode:");
			int pinCode = Integer.parseInt(s.nextLine());
			System.out.println("Enter the CustMailId:");
			String mId = s.nextLine();
			System.out.println("Enter the PhoneNo:");
			long phNo = Long.parseLong(s.nextLine());
			CallableStatement cs = con.prepareCall("{call CustDetails54(?,?,?,?,?,?,?)}");
			cs.setInt(1, cId);
			cs.setString(2, cName);
			cs.setString(3, city);
			cs.setString(4, state);
			cs.setInt(5, pinCode);
			cs.setString(6, mId);
			cs.setLong(7, phNo);
			cs.execute();
			System.out.println("CustDetails inserted Successfully");
			con.close();
			}catch(Exception e) {e.printStackTrace();}		
	}
}
