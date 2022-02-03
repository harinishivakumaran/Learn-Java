package projectnew1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DBConnectionManager {
	public static final String PROPERTY_FILE = "database.properties";
	public static final String DRIVER = "drivername";
	public static final String URL = "url";
	public static final String USER_NAME = "username";
	public static final String PASSWORD = "password";
	private static Connection connection = null;
	private static Properties props = null;
	/**
	 * @throws StudentAdmissionException
	 */
	private DBConnectionManager() throws StudentAdmissionException {
		loadProperties();
		try {
			Class.forName(props.getProperty(DRIVER));
			DBConnectionManager.connection = DriverManager.getConnection(props.getProperty(URL),
					props.getProperty(USER_NAME), props.getProperty(PASSWORD));
//Class.forName(com.mysql.cj.jdbc.Driver);
//DBConnectionManager.connection =DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		} catch (ClassNotFoundException ex) {
			throw new StudentAdmissionException("Could not find Driver class ", ex.getCause());
		} catch (SQLException e) {
			throw new StudentAdmissionException("Database Connection Creation Failed", e.getCause());
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
	public static DBConnectionManager getInstance() throws StudentAdmissionException {
// Code here
		return new DBConnectionManager();
//return null;
	}

	/**
	 * @throws StudentAdmissionException
	 */
	private void loadProperties() throws StudentAdmissionException {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(PROPERTY_FILE);
			props = new Properties();
			props.load(inputStream);
		} catch (FileNotFoundException e) {
			throw new StudentAdmissionException("Database PropertyFile Not Found", e.getCause());
		} catch (IOException e) {
			throw new StudentAdmissionException("Exception during property file I/O", e.getCause());
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					throw new StudentAdmissionException("Exception during property file I/O", e.getCause());
				}
			}
		}
	}
}