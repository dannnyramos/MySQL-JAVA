
package conexionmysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {

    
	public static void main(String[] args) {
            String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb";
		String username = "dani";
		String password = "1234";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "123456789");
			statement.setString(2, "William Henry Bill Gates");
			statement.setString(3, "bill@gatesfoundation.org");
			statement.setString(4, "bill");

			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was updated successfully!");
			}


		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
