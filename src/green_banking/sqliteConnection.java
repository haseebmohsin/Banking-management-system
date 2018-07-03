package green_banking;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

/**
 * @author Haseeb khan
 *May 18, 2018
 */
public class sqliteConnection {

	Connection conn = null;

	public static Connection dbConnector()	{

		try {

			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection( "jdbc:sqlite:C:\\Users\\Haseeb khan\\eclipse-workspace\\BankingSoftware\\Account.sqlite ");
			return conn;

		}catch(Exception e) {

			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}