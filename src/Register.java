import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame{
    private JPanel panel;
    private JTextField name;
    private JTextField username;
    private JPasswordField passwordField;
    private JTextField textField_1;
    private JTextField textField_2;
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

        textField_1 = new JTextField();
        textField_1.setBounds(250, 270, 150, 25);
        panel.add(textField_1);

        JLabel lblNewLabel_5 = new JLabel("Mobile No  :");
        lblNewLabel_5.setForeground(Color.RED);
        lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 16));
        lblNewLabel_5.setBounds(150, 310, 150, 16);
        panel.add(lblNewLabel_5);

        textField_2 = new JTextField();
        textField_2.setBounds(250, 305, 150, 26);
        panel.add(textField_2);


        JButton sign_up = new JButton("Sign Up");
//        sign_up.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                Login log = new Login();
//                boolean b = true;
//                String s1 = textField.getText();
//                char[] s = passwordField.getPassword();
//                String s2 = String.valueOf(s);
//                String s3 = textField_1.getText();
//                if (!s3.contains("@")) {
//                    JOptionPane.showMessageDialog(null, "Incorrect email address");
//                    log.dispose();
//                    b = false;
//                }
//                String s4 = textField_2.getText();
//                if (s4.length() != 10) {
//                    JOptionPane.showMessageDialog(null, "Incorrect mobile number");
//                    log.dispose();
//                    b = false;
//                }
//                String s5 = textField_3.getText();
//                try {
//                    Class.forName("org.sqlite.JDBC");
//                    String url = "jdbc:sqlite:HRS.db";
//                    Connection conn = null;
//                    conn = DriverManager.getConnection(url);
//                    String sql = "INSERT INTO details(un,pwd,email,phno,mode) VALUES(?,?,?,?,?)";
//                    PreparedStatement ps = conn.prepareStatement(sql);
//                    ps.setString(1, s1);
//                    ps.setString(2, s2);
//                    ps.setString(3, s3);
//                    ps.setString(4, s4);
//                    ps.setString(5, s5);
//                    ps.executeUpdate();
//                    ps.close();
//                    conn.close();
//                } catch (Exception a) {
//                    System.out.print(a.getMessage());
//                }
//                if (b == true) {
//                    log.setVisible(true);
//                    dispose();
//                }
//            }
//        });
        Color bg = new Color(25,110,217);
        sign_up.setForeground(Color.GREEN);
        sign_up.setBackground(bg);
        sign_up.setBounds(250, 400, 150, 30);
        panel.add(sign_up);

        JLabel lblNewLabel_7 = new JLabel("Register as  :");
        lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 16));
        lblNewLabel_7.setForeground(Color.RED);
        lblNewLabel_7.setBounds(150, 355, 160, 20);
        panel.add(lblNewLabel_7);

        JRadioButton r1=new JRadioButton("Owner");
        JRadioButton r2=new JRadioButton("User");
        r1.setBounds(250,350,70,30);
        r2.setBounds(330,350,70,30);
        ButtonGroup btngrp = new ButtonGroup();
        btngrp.add(r1);btngrp.add(r2);
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
