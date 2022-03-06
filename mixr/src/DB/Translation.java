package DB;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Beverage;
import model.NutritionInfo;

/**
 * Translates java to SQL and SQL to java.
 * @author Zoe Bingham
 */

public class Translation {

    // MySQL Login Constants
    public static final String HOSTNAME = "127.0.0.1";
    public static final String PORT = "3306";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "password";
    public static final String URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT;
    public static final String COMIX_URL = URL + "/MiXR";

    /**
     * Returns a beverage from the database given the beverage id.
     * @param int beverage_id
     * @return
     */
    public static Beverage getBeverage(int id){
        try {
            // Make a connection to the SQL DB
            Connection conn = DriverManager.getConnection(COMIX_URL, USERNAME, PASSWORD);
            Statement statement = conn.createStatement();

            // Execute a query
            ResultSet result = statement.executeQuery("SELECT * FROM UserInfo;");

            // Retrieve all of the attributes of that query
            String name = result.getString("name");
            id = result.getInt("id");
            Float cost = result.getFloat("cost");
            Float size = result.getFloat("size");
            String[] color = result.getString("color").split(" ");
            int[] rgba = new int[4];
            int i = 0;
            for (String val: color){
                rgba[i] = Integer.parseInt(val);
                i++;
            }
            NutritionInfo nutrition = new NutritionInfo(result.getInt("calories"), result.getFloat("AVC"), result.getString("ingredients").split(" "));

            // Create the appropriate beverage
            return new Beverage(name, id, cost, size, rgba, nutrition);
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        // Return null if the beverage is not valid
        return null;
    }
}
