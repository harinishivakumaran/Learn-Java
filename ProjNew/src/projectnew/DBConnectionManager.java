package projectnew;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionManager {
	public static final String PROPERTY_FILE = "./Lib/Database.properties";
	public static final String DRIVER = "drivername";
	public static final String URL = "url";
	public static final String USER_NAME = "username";
	public static final String PASSWORD = "password";
	private static Connection connection = null;
	private static Properties props = null;
	public static DBConnectionManager instance = null;
	/**
	 * @throws StudentAdmissionException
	 */
	private DBConnectionManager() throws StudentAdmissionException{
		loadProperties();
		try {
			Class.forName(props.getProperty(DRIVER));
			DBConnectionManager.connection = DriverManager.getConnection(props.getProperty(URL), props.getProperty(USER_NAME),
					props.getProperty(PASSWORD));
		} catch (ClassNotFoundException ex) {
			System.out.println("class not found" + ex);
		} catch (SQLException e) {
			System.out.println("SQLAttack" + e);
		}
	}
	/**
	 * @return Connection
	 */
	public Connection getConnection() {
		return connection;
	}
	/**
	 * @return DBConnectionManager
	 * @throws StudentAdmissionException
	 */
	public static DBConnectionManager getInstance(){
// Code here
		try {
			instance = new DBConnectionManager();
		} catch (Exception e) {
			System.out.println("Exception has been caught" + e);
		}
		return instance;
	}

	/**
	 * @throws StudentAdmissionException
	 */
	private void loadProperties() throws StudentAdmissionException{
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(PROPERTY_FILE);
			props = new Properties();
			props.load(inputStream);
		} catch (FileNotFoundException e) {
			System.out.println("file " + e);
		} catch (IOException e) {
			System.out.println("IOexception" + e);
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
				}
			}
		}
	}
}