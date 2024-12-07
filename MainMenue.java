/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package moviepackage;
import javax.swing.JOptionPane;
/**
 *
 * @author nazee
 */
public class MainMenue extends javax.swing.JFrame {

    /**
     * Creates new form MainMenue
     */
    public MainMenue() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMovietype = new javax.swing.JPanel();
        txtheading1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        cmbMovietypes = new javax.swing.JComboBox<>();
        lblTickets = new javax.swing.JLabel();
        txtTickets = new javax.swing.JTextField();
        btnBill = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMovietype.setBackground(new java.awt.Color(51, 0, 51));

        txtheading1.setBackground(new java.awt.Color(51, 0, 51));
        txtheading1.setFont(new java.awt.Font("Bell MT", 0, 48)); // NOI18N
        txtheading1.setForeground(new java.awt.Color(204, 0, 204));
        txtheading1.setText("MovieHub");
        txtheading1.setBorder(null);
        txtheading1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtheading1txtheadingActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(51, 0, 51));
        jTextField1.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("From Couch to Cinema in Seconds!!!!");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("1. Action");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 153)));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "05. Superbad (2007) -LKR 2500/-", "06. The Hangover (2009) -LKR 1000/-", "07. Step Brothers (2008) -LKR 3000/-", "08. Mean Girls (2004) -LKR 2500/-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jTextField3.setText("Comedy");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        jTextField4.setText(" Romance");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 153)));

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "09.The Notebook (2004)) -LKR 3000/-", "10.The Notebook (2004) -LKR 2800/-", "11.La La Land (2016)) -LKR 6000/-", "12.Crazy Rich Asians (2018))  -LKR 6000/- " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jTextField5.setText("Science Fiction");
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jScrollPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 153)));

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "13.Inception (2010) -LKR 3000/-", "14.Interstellar (2014) -LKR 2800/-", "15.Blade Runner 2049 (2017) -LKR 3000/-", "16.The Matrix (1999)  -LKR 3500/- " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MovieType");

        cmbMovietypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01. Mad Max: Fury Road (2015)", "02. John Wick (2014)", "03. Die Hard (1988)", "04. The Dark Knight (2008)", "05. Superbad (2007)", "06. The Hangover (2009)", "07. Step Brothers (2008)", "08. Mean Girls (2004)", "09. The Notebook (2004)", "10. Pride and Prejudice (2005)", "11. La La Land (2016)", "12. Crazy Rich Asians (2018)", "13. Inception (2010)", "14. Interstellar (2014)", "15. Blade Runner 2049 (2017)", "16.The Matrix (1999)" }));
        cmbMovietypes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmbMovietypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMovietypesActionPerformed(evt);
            }
        });

        lblTickets.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTickets.setForeground(new java.awt.Color(255, 255, 255));
        lblTickets.setText("No. of tickets");

        txtTickets.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBill.setBackground(new java.awt.Color(0, 153, 153));
        btnBill.setForeground(new java.awt.Color(255, 255, 255));
        btnBill.setText("Bill Amount");
        btnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillActionPerformed(evt);
            }
        });

        jScrollPane5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 153)));

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "01 .Mad Max: Fury Road (2015)  - LKR 1500/-", "02.John Wick (2014) -LKR 1000/-", "03.Die Hard (1988) -LKR 2500/-", "04.The Dark Knight (2008) -LKR 1500/-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        javax.swing.GroupLayout lblMovietypeLayout = new javax.swing.GroupLayout(lblMovietype);
        lblMovietype.setLayout(lblMovietypeLayout);
        lblMovietypeLayout.setHorizontalGroup(
            lblMovietypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblMovietypeLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(lblMovietypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblMovietypeLayout.createSequentialGroup()
                        .addGap(0, 250, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(357, 357, 357))
                    .addGroup(lblMovietypeLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
            .addGroup(lblMovietypeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblMovietypeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lblMovietypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblMovietypeLayout.createSequentialGroup()
                        .addComponent(txtheading1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(375, 375, 375))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblMovietypeLayout.createSequentialGroup()
                        .addComponent(btnBill)
                        .addGap(391, 391, 391))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblMovietypeLayout.createSequentialGroup()
                        .addGroup(lblMovietypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(lblMovietypeLayout.createSequentialGroup()
                                .addComponent(lblTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTickets))
                            .addGroup(lblMovietypeLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMovietypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(296, 296, 296))))
        );
        lblMovietypeLayout.setVerticalGroup(
            lblMovietypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblMovietypeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtheading1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(lblMovietypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblMovietypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblMovietypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(lblMovietypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbMovietypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblMovietypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTickets)
                    .addComponent(txtTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnBill)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMovietype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMovietype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtheading1txtheadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtheading1txtheadingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtheading1txtheadingActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
    String cmbMovietype = (String) cmbMovietypes.getSelectedItem();
   
    
    double tickets = Double.parseDouble(txtTickets.getText());
    

    
    double cost = 0, totalCost = 0;

   
    switch (cmbMovietype) {
        case "01. Mad Max: Fury Road (2015)":   
        cost = 1500; 
            break;
        case "02. John Wick (2014)":
            cost = 1000; 
            break;
        case "03. Die Hard (1988)":
            cost = 2500; 
            break;
        case "04. The Dark Knight (2008)":
           cost = 1500; 
           break;
        case "05. Superbad (2007)":
           cost = 2500; 
           break;
        case "06. The Hangover (2009)":
           cost = 1000; 
           break;
        case "07. Step Brothers (2008)":
           cost = 3000; 
           break;
        case "08. Mean Girls (2004)":
           cost = 2500; 
           break;
        case "09. The Notebook (2004)":
           cost = 3000; 
             break;
        case "10. Pride and Prejudice (2005)":
           cost = 2800; 
           break;
        case "11. La La Land (2016)":
           cost = 6000; 
           break; 
        case "12. Crazy Rich Asians (2018)":
           cost = 6000; 
           break;
        case "13. Inception (2010)":
           cost = 3000; 
           break;
        case "14. Interstellar (2014)":
           cost = 2800; 
           break;
        case "15. Blade Runner 2049 (2017)":
           cost = 3000; 
           break;
        case "16.The Matrix (1999)":
           cost = 3500; 
           break;

        

    
    }

    
    totalCost = tickets * cost;
    
    // Display the total cost to the user
    JOptionPane.showMessageDialog(this, 
        "Number of Tickets: " + tickets + "\n" +
        "Total Cost: Rs. " + totalCost, 
        "Total Bill", JOptionPane.INFORMATION_MESSAGE);
      
        
    }//GEN-LAST:event_btnBillActionPerformed

    private void cmbMovietypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMovietypesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMovietypesActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBill;
    private javax.swing.JComboBox<String> cmbMovietypes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel lblMovietype;
    private javax.swing.JLabel lblTickets;
    private javax.swing.JTextField txtTickets;
    private javax.swing.JTextField txtheading1;
    // End of variables declaration//GEN-END:variables
}
