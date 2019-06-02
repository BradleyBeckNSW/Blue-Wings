import java.sql.*;
import java.util.Properties;

public class Database {
	
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/BlueWings?serverTimezone=Australia/Sydney";
	private static final String userName = "root";
	private static final String pw = "";
	
	private Connection connection;
	private Properties properties;
	
	public static void main(String [] args) {
		Database myDatabase = new Database();
		
		try {
			myDatabase.connect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private Properties getProperties() {
	    if (properties == null) {
	        properties = new Properties();
	        properties.setProperty("user", userName);
	        properties.setProperty("password", pw);
	    }
	    return properties;
	}
	
	public Connection connect() throws Exception {
	        try {
	            Class.forName(driver);
	            connection = DriverManager.getConnection(url, getProperties());
	            System.out.println("Connected to database!");
	            return connection;
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    return null;
	}
	
	public void disconnect() throws Exception {
         try {
           connection.close();
           connection = null;
         } catch (Exception e) {
           System.out.println(e);
       }
    }
}
