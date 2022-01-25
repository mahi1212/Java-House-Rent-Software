
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
//        Connection con = null;
//        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root","");
//        } catch (SQLException ex) {
//            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Test2", "root", "");
            return con;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<Product2> BindTable(){

        ArrayList<Product2> list = new ArrayList<Product2>();
        Connection con = getConnection();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `ID_PRO`, `PRO_NAME`, `QTE_IN_STOCK`, `PRICE`, `PRO_IMAGE`, `ID_CAT` FROM `products`");

            Product2 p;
            while(rs.next()){
                p = new Product2(
                        rs.getString("ID_PRO"),
                        rs.getString("PRO_NAME"),
                        rs.getInt("QTE_IN_STOCK"),
                        rs.getString("PRICE"),
                        rs.getBytes("PRO_IMAGE"),
                        rs.getInt("ID_CAT")
                );
                list.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
