import java.sql.*;

public class ConnectDatabase {

    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/house_rent", "root", "");
            return con;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
