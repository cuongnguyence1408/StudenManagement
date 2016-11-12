package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static Connection con;
	private Database(){
		try {
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QLSV","sa","sapassword");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		if(con!=null)
			new Database();
		return con;
	}
}
