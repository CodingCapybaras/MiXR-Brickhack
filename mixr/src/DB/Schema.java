package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Schema {

    // MySQL Login Constants
    public static final String HOSTNAME = "127.0.0.1";
    public static final String PORT = "3306";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "password";
    public static final String URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT;
    public static final String COMIX_URL = URL + "/MiXR";

    public static void main(String[] args) throws SQLException{
            Connection conn = DriverManager.getConnection(COMIX_URL, USERNAME, PASSWORD);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM UserInfo;");
            boolean hasNext = result.next();
            while(hasNext){
                System.out.println(result.getString("UserID"));
                hasNext = result.next();
            }
            System.out.println("Oops! That's not right... SQL issues 0_0");
    }
}
