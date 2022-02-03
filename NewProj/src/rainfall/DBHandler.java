package rainfall;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class DBHandler {
	public Connection establishConnection() {
		try {
			FileInputStream f=new FileInputStream("db.properties");
			Properties p=new Properties();
			p.load(f);
			Class.forName(p.getProperty("db.classname"));
			return DriverManager.getConnection(
					p.getProperty("db.url"),
					p.getProperty("db.username"),
					p.getProperty("db.password")
					);
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return null;
	}
}
