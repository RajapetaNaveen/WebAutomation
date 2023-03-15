package utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.Assert;


public class DBUtil {

	public Connection OraConn;
	public static Connection postgreconn = null;
	public static String CUSTOMER_FIRST_NAME;
	public static String WorkOrder;
	public static String lastName;
	public static String emailID;
	public static String customer_phone_no;
	public static String order_no;
	public static String description;

	// @Step("Connect to Database")
	/**
	 * Connects to the DataBase
	 * 
	 * @param HostName -- Name of the Database Host
	 * @param SID      -- Name of the SID
	 * @param UserName -- UserName used for connecting to the Database
	 * @param Password -- Password used for connecting to the Database
	 * @throws IOException
	 */
	public Connection ConnectToDB(String HostName, String SID, String UserName, String Password)
			throws SQLException, IOException {
		
		try {
			OraConn = DriverManager.getConnection("jdbc:oracle:thin:@" + HostName + ":1521:" + SID, UserName, Password);
		} catch (SQLException e) {
			 Assert.assertEquals("Verify if exception is displayed in Order Search",
					  "Exception is displayed in Order Search");
		}
		return (OraConn);
	}

	/**
	 * Executes the DataBase Query
	 * 
	 * @param HostName -- Name of the Database Host
	 * @param SID      -- Name of the SID
	 * @param UserName -- UserName used for connecting to the Database
	 * @param Password -- Password used for connecting to the Database
	 */
	public ResultSet ExecuteDBQuery(Connection OrConn, String sqlQuery) throws SQLException {
		ResultSet rs = null;
		try {
			Statement stat = OrConn.createStatement();
			rs = stat.executeQuery(sqlQuery);
		} catch (SQLException e) {
			 Assert.assertEquals("Verify if exception is displayed in Order Search",
					  "Exception is displayed in Order Search");
		}
		return (rs);
	}

}
