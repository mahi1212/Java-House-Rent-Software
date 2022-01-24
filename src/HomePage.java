import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage{
    //      Customizing btn clr
    Color FrameColor = new Color(22,145,217);
    Color BtnColor = new Color(25,110,217);

    HomePage(){
//      Creating Components
        JFrame f = new JFrame("House Rent Software");
        JLabel lb = new JLabel("WELCOME TO HOUSE RENT PROJECT");
        JLabel reg = new JLabel("New Here?");
        JButton user = new JButton("User Login");
        JButton owner = new JButton("Owner Login");
        JButton admin = new JButton("Admin Login");
        JButton regBtn = new JButton("Register");


//      Setting Bounds
        lb.setBounds(150, 50, 650, 70);
        lb.setFont(new Font("Serif", Font.BOLD, 25));
        reg.setBounds(300, 380, 100, 30);
        reg.setFont(new Font("Arial", Font.BOLD, 15));

        user.setBounds(340, 150, 140, 35);
        user.setFont(new Font("Arial", Font.BOLD, 14));
        user.setBackground(BtnColor);
        user.setForeground(Color.WHITE);
        user.setToolTipText("Login as user");
        user.setFocusPainted(false);
//        user.addActionListener(this);
//        user.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Login log = new Login();
//
//                f.dispose();
//            }
//        });

        owner.setBounds(340, 190, 140, 35);
        owner.setFont(new Font("Arial", Font.BOLD, 14));
        owner.setBackground(BtnColor);
        owner.setForeground(Color.WHITE);
        owner.setToolTipText("Login as owner");
        owner.setFocusPainted(false);

        admin.setBounds(340, 230, 140, 35);
        admin.setFont(new Font("Arial", Font.BOLD, 14));
        admin.setBackground(BtnColor);
        admin.setForeground(Color.WHITE);
        admin.setToolTipText("Login as admin");
        admin.setFocusPainted(false);

        regBtn.setBounds(400, 375, 120, 35);
        regBtn.setFont(new Font("Arial", Font.BOLD, 14));
        regBtn.setBackground(FrameColor);
        regBtn.setForeground(Color.WHITE);
        regBtn.setToolTipText("Register");
        regBtn.setFocusPainted(false);
        regBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register register = new Register();
                register.setVisible(true);
                f.dispose();
            }
        });
//        user btn
        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                f.dispose();
            }
        });
//        Owner btn
        owner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                f.dispose();
            }
        });
//        Admin btn
        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                f.dispose();
            }
        });

//      Setting up frame
        f.add(lb);
        f.add(user);
        f.add(owner);
        f.add(admin);
        f.add(reg);
        f.add(regBtn);

        f.setSize(800, 500);
        f.getContentPane().setBackground(FrameColor);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);


    }

    public static void main(String[] args) {
        new HomePage();
    }
}
