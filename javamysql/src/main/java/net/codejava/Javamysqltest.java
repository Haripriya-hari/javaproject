package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Javamysqltest extends Sqlinsertselect {

	public static void main(String[] args) {
		
		try {
			Sqlinsertselect.select("2");
			//Sqlinsertselect.insert("6", "scrub", "200");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Oops,error!");
			e.printStackTrace();
		}
	}

}
