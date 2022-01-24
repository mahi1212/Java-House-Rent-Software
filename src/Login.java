import javax.swing.*;
import java.awt.*;

public class Login {
    JFrame frame;
    JPanel panel;
    JLabel loginLabel, userLabel, passLabel;
    JTextField userField, passField;
    JButton login_btn;

    Login(){
        frame = new JFrame("Login");
        panel = new JPanel();
        loginLabel = new JLabel("LOGIN  PAGE");
        loginLabel.setBounds(130, 90, 200, 50);
        loginLabel.setFont(new Font("Serif", Font.PLAIN, 18));
        loginLabel.setForeground(Color.WHITE);

        userLabel = new JLabel("USER NAME  :");
        userLabel.setBounds(70, 170, 100 , 40);
        userLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        userLabel.setForeground(Color.WHITE);

        userField = new JTextField();
        userField.setBounds(170, 175, 160 , 25);
        userField.setFont(new Font("Arial", Font.PLAIN, 13));
        userField.setBackground(Color.BLACK);
        userField.setForeground(Color.WHITE);

        passLabel = new JLabel("PASSWORD  :");
        passLabel.setBounds(70, 220, 100 , 40);
        passLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        passLabel.setForeground(Color.WHITE);

        passField = new JTextField();
        passField.setBounds(170, 225, 160 , 25);
        passField.setFont(new Font("Arial", Font.PLAIN, 13));
        passField.setBackground(Color.BLACK);
        passField.setForeground(Color.WHITE);

        login_btn = new JButton("Login");
        login_btn.setBackground(new Color(0, 0 , 90));
        login_btn.setForeground(Color.WHITE);
        login_btn.setBounds(170, 300, 80, 40);
        login_btn.setFont(new Font("Arial", Font.PLAIN, 13));


        frame.setContentPane(panel);
        frame.add(loginLabel);
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(login_btn);


        panel.setBackground(new Color(0,0,40));
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Login log = new Login();
////        log.setVisible(true);
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    Login log = new Login();
//                    log.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
    }

}
