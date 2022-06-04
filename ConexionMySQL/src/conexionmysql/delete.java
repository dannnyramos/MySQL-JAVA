package conexionmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class delete {

	public static void main(String[] args) {
            String driver = "com.mysql.jdbc.Driver";
            
		String url = "jdbc:mysql://localhost:3306/sampledb";
		String username = "dani";
		String password = "1234";
		
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			
			String sql = "DELETE FROM Users WHERE username=?";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "bill");
			
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}
}
