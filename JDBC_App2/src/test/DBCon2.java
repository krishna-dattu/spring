package test;

import java.util.*;
import java.sql.*;


public class DBCon2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");  //No need to write this for loading it will load Automatically
				
				Connection con = DriverManager.getConnection
			        	("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				Statement stm =con.createStatement();
				
				System.out.println("Enter the Prod code");
				String code =s.nextLine();
				System.out.println("Enter the Prod Name");
				String name =s.nextLine();
				System.out.println("Enter the Prod price");
				float price =s.nextFloat();
				System.out.println("Enter the Prod Qty");
				int Qty =s.nextInt();
				
				int k=stm.executeUpdate
				("insert into Product54 values('"+code+"','"+name+"',"+price+","+Qty+")");
				
				if(k>0) {
					System.out.println("Product Details Entered Successfully");
				}	
				con.close();
			}catch(Exception e){e.printStackTrace();}
		//end of try resource

	}

}
