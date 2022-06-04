package conexionmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class insert {

	public static void main(String[] args) {
            String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb";
		String username = "dani";
		String password = "1234";
		
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			
			String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "bill");
			statement.setString(2, "secretpass");
			statement.setString(3, "Bill Gates");
			statement.setString(4, "bill.gates@microsoft.com");
			
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}

			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}
}