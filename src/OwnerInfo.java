import com.sun.jdi.connect.spi.Connection;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Statement;
import java.sql.*;


public class OwnerInfo extends JFrame{

    Color btnColor = new Color(20,70,40);

    OwnerInfo(){
        JFrame f = new JFrame("House Rent Software");
        JLabel lb = new JLabel("HOUSE INFORMATION");
        JLabel ownlb = new JLabel("OWNER NAME      :");
        JTextField owntf = new JTextField();
        JLabel loclb = new JLabel("LOCATION             :");
        JTextField loctf = new JTextField();
        JLabel norlb = new JLabel("NO OF ROOM       :");
        JTextField nortf = new JTextField();
        /*JLabel gaslb = new JLabel("GAS SYSTEM       :");
        JCheckBox gasL = new JCheckBox("LINE GAS");
        JCheckBox gasS = new JCheckBox("CYLINDER GAS");
        JLabel allowedlb = new JLabel("ALLOWED            :");
        JCheckBox famicb = new JCheckBox("ONLY FAMILY");
        JCheckBox bachcb = new JCheckBox("BACHELOR");*/

        JLabel gaslb = new JLabel("GAS SYSTEM       :");
        JTextField gastf = new JTextField();

        JLabel allowedlb = new JLabel("ALLOWED            :");
        JTextField allowedtf = new JTextField();

        JLabel permlb = new JLabel("PER MONTH(TK) :");
        JTextField permtf = new JTextField();
        JLabel hnolb = new JLabel("HOUSE NO           :");
        JTextField hnotf = new JTextField();
        JLabel moblb = new JLabel("MOBILE NO         :");
        JTextField mobtf = new JTextField();
        JLabel imlb = new JLabel("IMAGES               :");
        JLabel deslb = new JLabel("DESCRIPTION    :");
        JTextField destf = new JTextField();
//        Submit btn adding
        JButton b = new JButton("SUBMIT");
        b.setBackground(btnColor);
        b.setForeground(Color.GREEN);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String OwnerN = owntf.getText();
                String Loca = loctf.getText();
                String tmp = nortf.getText();
                int Nor = Integer.parseInt(tmp);
                String Gas = gastf.getText();
                String Allowed = allowedtf.getText();
                tmp = permtf.getText();
                int Perm =Integer.parseInt(tmp);
                String hNum = hnotf.getText();
                String Mob =  mobtf.getText();
                String Des = destf.getText();

                //  InputStream is = new InputStream(new File(s));

                java.sql.Connection con = ConnectDatabase.connect();

                try {

                    Statement st = con.createStatement();


            	    /* String query = "insert into image values (?, ?)";
            		 PreparedStatement stmt = con.prepareStatement(query);

            		 JFileChooser jfc = new JFileChooser();
            		 jfc.showOpenDialog(null);

            		 File file = jfc.getSelectedFile();
            		 FileInputStream fis = new FileInputStream(file);
            		 stmt.setInt(1, 2);
            		 stmt.setBinaryStream(2, fis, fis.available());

            		 stmt.executeUpdate();
            		 JOptionPane.showMessageDialog(null, "Done");*/



                    st.executeUpdate("use house_rent");
                    st.executeUpdate("Insert into owner_information(name, location, no_of_room, gas_sys, allowed, rent_cost, house_no, mobile, image,  description) "
                            + "values ('"+OwnerN+"', '"+Loca+"', '"+Nor+"', '"+Gas+"', '"+Allowed+"',  '"+Perm+"', '"+hNum+"', '"+Mob+"',  '"+null+"', '"+Des+"' )");
                    JOptionPane.showMessageDialog(null, "Done");
                }/*catch(Exception e1) {
            		  e1.printStackTrace();
            	}*/
                catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1);
                }
            }
        });



//        Adding file chooser button
        JButton imgBtn = new JButton("File Chooser");
        JLabel lab = new JLabel();
        imgBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
//                fileChooser.addChoosableFileFilter(new ImageFilter());
                FileFilter imageFilter = new FileNameExtensionFilter(
                        "Image Type", ImageIO.getReaderFileSuffixes());

                fileChooser.setAcceptAllFileFilterUsed(false);

                int option = fileChooser.showOpenDialog(f);
                if(option == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    lab.setText("File Selected: " + file.getName());
                }else{
                    lab.setText("Open command canceled");
                }
            }
        });

        lb.setBounds(100, 0, 400, 50);
        lb.setFont(new Font("Serif", Font.BOLD, 30));
        ownlb.setBounds(120, 80, 120, 30);
        owntf.setBounds(250, 80, 150, 25);
        loclb.setBounds(120, 120, 120, 30);
        loctf.setBounds(250, 120, 150, 25);
        norlb.setBounds(120, 160, 120, 30);
        nortf.setBounds(250, 160, 150, 25);

        gaslb.setBounds(120, 200, 120, 30);
        gastf.setBounds(250, 200, 150, 25);
        f.add(gastf);
        // gasL.setBounds(250, 200, 80, 30);
        // gasS.setBounds(360, 200, 120, 30);

        allowedlb.setBounds(120, 240, 120, 30);
        allowedtf.setBounds(250, 240, 150, 25);
        f.add(allowedtf);
        // famicb.setBounds(250, 240, 100, 30);
        // bachcb.setBounds(360, 240, 150, 30);

        permlb.setBounds(120, 280, 120, 30);
        permtf.setBounds(250, 280, 150, 25);
        hnolb.setBounds(120, 320, 120, 30);
        hnotf.setBounds(250, 320, 150, 25);
        moblb.setBounds(120, 360, 120, 30);
        mobtf.setBounds(250, 360, 150, 25);
        imlb.setBounds(120, 400, 120, 30);
        deslb.setBounds(120, 440, 120, 30);
        destf.setBounds(250, 440, 180, 80);
        b.setBounds(200, 565, 200, 30);
        imgBtn.setBounds(250, 400, 130, 30);
        lab.setBounds(400, 400, 150, 40);
//        Adding all components to frame

        f.add(lb);
        f.add(ownlb);
        f.add(owntf);
        f.add(loclb);
        f.add(loctf);
        f.add(norlb);
        f.add(nortf);
        f.add(gaslb);
        //   f.add(gasL);
        //   f.add(gasS);
        f.add(allowedlb);
        //   f.add(famicb);
        //   f.add(bachcb);
        f.add(permlb);
        f.add(permtf);
        f.add(hnolb);
        f.add(hnotf);
        f.add(moblb);
        f.add(mobtf);
        f.add(imlb);
        f.add(deslb);
        f.add(destf);
        f.add(b);
        f.add(imgBtn);
        f.add(lab);

        f.setSize(600, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new OwnerInfo();

    }
}