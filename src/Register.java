import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Register extends JFrame{
    private JPanel panel;
    private JTextField name;
    private JTextField username;
    private JPasswordField passwordField;
    private JTextField email;
    private JTextField mobile;
    private JTextField textField_3;


    /**
     * Create the frame.
     */
    public Register() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 200, 600, 500);
        panel = new JPanel();
//        panel.setForeground(new Color(255, 255, 255));
        panel.setBackground(Color.BLACK);
        setContentPane(panel);
        panel.setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        JLabel lblNewLabel = new JLabel("Register");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 34));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(242, 57, 200, 35);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("House Renting System");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
        lblNewLabel_1.setBounds(195, 93, 300, 27);
        panel.add(lblNewLabel_1);
//        Form making
        JLabel lblNewLabel_name = new JLabel("Name         : ");
        lblNewLabel_name.setForeground(Color.RED);
        lblNewLabel_name.setBounds(150, 165, 120, 16);
        lblNewLabel_name.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(lblNewLabel_name);

        JLabel lblNewLabel_2 = new JLabel("Username  : ");
        lblNewLabel_2.setForeground(Color.RED);
        lblNewLabel_2.setBounds(150, 200, 120, 16);
        lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Password   :");
        lblNewLabel_3.setForeground(Color.RED);
        lblNewLabel_3.setBounds(150, 240, 120, 16);
        lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(lblNewLabel_3);

        name = new JTextField();
        name.setBounds(250, 160, 150, 25);
        panel.add(name);

        username = new JTextField();
        username.setBounds(250, 195, 150, 25);
        panel.add(username);

        passwordField = new JPasswordField();
        passwordField.setBounds(250, 235, 150, 25);
        panel.add(passwordField);

        JLabel lblNewLabel_4 = new JLabel("Email          : ");
        lblNewLabel_4.setForeground(Color.RED);
        lblNewLabel_4.setBounds(150, 275, 120, 16);
        lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(lblNewLabel_4);

        email = new JTextField();
        email.setBounds(250, 270, 150, 25);
        panel.add(email);

        JLabel lblNewLabel_5 = new JLabel("Mobile No  :");
        lblNewLabel_5.setForeground(Color.RED);
        lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 16));
        lblNewLabel_5.setBounds(150, 310, 150, 16);
        panel.add(lblNewLabel_5);

        mobile = new JTextField();
        mobile.setBounds(250, 305, 150, 26);
        panel.add(mobile);


        JButton sign_up = new JButton("Sign Up");


        Color bg = new Color(25,110,217);
        sign_up.setForeground(Color.GREEN);
        sign_up.setBackground(bg);
        sign_up.setBounds(250, 400, 150, 30);
        // panel.add(sign_up);

        JLabel lblNewLabel_7 = new JLabel("Register as  :");
        lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 16));
        lblNewLabel_7.setForeground(Color.RED);
        lblNewLabel_7.setBounds(150, 355, 160, 20);
        panel.add(lblNewLabel_7);

        JButton r1=new JButton("OWNER");
        JButton r2=new JButton("USER");
        r1.setBounds(250,350,80,30);
        r2.setBounds(340,350,80,30);


        r1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String Name = name.getText();
                String UserName = username.getText();
                char [] Pass = passwordField.getPassword();
                String newPass = String.valueOf(Pass);
                String tmp = mobile.getText();
                int Mobile = Integer.parseInt(tmp);
                String Email = email.getText();

                java.sql.Connection con = ConnectDatabase.connect();

                try {

                    Statement st = con.createStatement();

                    st.executeUpdate("use house_rent");
                    st.executeUpdate("Insert into owner_reg(name, username, password, email, mobile) "
                            + "values ('"+Name+"', '"+UserName+"', '"+newPass+"', '"+Email+"', '"+Mobile+"' )");
                    JOptionPane.showMessageDialog(null, "Done");
                    HomePage h = new HomePage();
                    h.setVisible(true);
                }catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1);
                }

            }
        });

        r2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String Name = name.getText();
                String UserName = username.getText();
                char [] Pass = passwordField.getPassword();
                String newPass = String.valueOf(Pass);
                String tmp = mobile.getText();
                int Mobile = Integer.parseInt(tmp);
                String Email = email.getText();

                java.sql.Connection con = ConnectDatabase.connect();

                try {

                    Statement st = con.createStatement();

                    st.executeUpdate("use house_rent");
                    st.executeUpdate("Insert into user_reg(name, username, password, email, mobile) "
                            + "values ('"+Name+"', '"+UserName+"', '"+newPass+"', '"+Email+"', '"+Mobile+"' )");
                    JOptionPane.showMessageDialog(null, "Done");
                    HomePage h = new HomePage();
                    h.setVisible(true);
                }catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1);
                }

            }
        });




        panel.add(r1);
        panel.add(r2);



    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
//        Register register = new Register();
//        register.setVisible(true);

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Register frame = new Register();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
