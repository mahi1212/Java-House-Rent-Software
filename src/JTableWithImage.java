import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.*;

public class JTableWithImage extends javax.swing.JFrame {

    public JTableWithImage() {
        initComponents();
        populateJTable();
    }


    public void populateJTable(){
        MyQuery mq = new MyQuery();
        ArrayList<Functions> list = mq.BindTable();

        String[] columnName = {"Name","Location","Room", "Gas System", "Type", "Rent Cost", "House No", "Contract Number", "Image","Description"};
        Object[][] rows = new Object[list.size()][10];
        for(int i = 0; i < list.size(); i++){
            rows[i][0] = list.get(i).getName();
            rows[i][1] = list.get(i).getLocation();
            rows[i][2] = list.get(i).getRoom();
            rows[i][3] = list.get(i).getGas();
            rows[i][4] = list.get(i).getAllowed();
            rows[i][5] = list.get(i).getRentCost();
            rows[i][6] = list.get(i).getHouseNo();
            rows[i][7] = list.get(i).getMobile();
            rows[i][8] = list.get(i).getMyImage();
            rows[i][9] = list.get(i).getDescription();

            if(list.get(i).getMyImage() != null){
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage()
                        .getScaledInstance(150, 120, Image.SCALE_SMOOTH) );
                rows[i][8] = image;
            }
            else{
                rows[i][8] = "Coming Soon";
            }
            rows[i][4] = list.get(i).getAllowed();
        }

//        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
//        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
//        table.setDefaultRenderer(String.class, centerRenderer);

//        Setting size of cells
        TheModel model = new TheModel(rows, columnName);
        jTable1.setModel(model);
        jTable1.setRowHeight(120);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(55);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(300);
//        jTable1.setLineWrap(true);
//        jTable1.setWrapStyleWord(true);
    }



    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
                }
        ));

        jScrollPane1.setViewportView(jTable1);
        jTable1.setBackground(Color.BLACK);
        jTable1.setForeground(Color.WHITE);
        jTable1.setFont(new Font("Arial", Font.PLAIN, 18));


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(800, 800, 800)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JTableWithImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTableWithImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTableWithImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTableWithImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTableWithImage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
}