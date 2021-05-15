package net.codejava;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList; 

public class Sqlinsertselect {
	
	public static void select(String value) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/codejavadb";
		String username="root";
		String password="haripriya@_27";
		ResultSet result = null;
		Connection connection = DriverManager.getConnection(url,username,password);
			String sql="SELECT * FROM customer";
			Statement statement=connection.createStatement();
			result=statement.executeQuery(sql);
			while(result.next()){
				String Barcode=result.getString("Barcode");
				String product=result.getString("product");
				String price=result.getString("price");
				System.out.println(Barcode+" "+" "+product+" "+price);
			}
			connection.close();
			//return output;
		
		}
	public static void  insert(String value1,String value2,String value3) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/codejavadb";
		String username="root";
		String password="haripriya@_27";
		int result = 0;
		Connection connection = DriverManager.getConnection(url,username,password);
			String sql="insert into customer values (?,?,?)";
			PreparedStatement statement=connection.prepareStatement(sql); 
			statement.setString(1, value1);
			statement.setString(2, value2);
			statement.setString(3, value3);
			result=statement.executeUpdate();
			connection.close();
			if(result > 0)
			{
				System.out.println("Data has been inserted sucessfully.");
			}
			//return output;
		
		}
	
	
}
