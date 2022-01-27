
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyQuery {

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/house_rent", "root", "");
            return con;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<Functions> BindTable(){

        ArrayList<Functions> list = new ArrayList<Functions>();
        Connection con = getConnection();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `name`, `location`, `no_of_room`, `gas_sys`, `allowed`, `rent_cost`, `house_no`, `mobile`, `image`, `description` FROM `owner_information`");

            Functions p;
            while(rs.next()){
                p = new Functions(
                        rs.getString("name"),
                        rs.getString("location"),
                        rs.getInt("no_of_room"),
                        rs.getString("gas_sys"),
                        rs.getString("allowed"),
                        rs.getInt("rent_cost"),
                        rs.getString("house_no"),
                        rs.getInt("mobile"),
                        rs.getBytes("image"),
                        rs.getString("description")
                );
                list.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
