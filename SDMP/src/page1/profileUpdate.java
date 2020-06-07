package page1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Team Two Square
 */

public class profileUpdate extends javax.swing.JFrame {


    private String uname;
    private String update;
    private String info;
    
    public Connection con=null;
    
    public profileUpdate() {
        initComponents();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdms","root","");
            System.out.println("Connected");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        updateUser = new javax.swing.JLabel();
        updateUName = new javax.swing.JTextField();
        updateUser1 = new javax.swing.JLabel();
        updateBox = new javax.swing.JComboBox<>();
        newInfo = new javax.swing.JLabel();
        newinf = new javax.swing.JTextField();
        done = new javax.swing.JButton();
        back1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Profile Update");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        updateUser.setText("Username                       :");

        updateUName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUNameActionPerformed(evt);
            }
        });

        updateUser1.setText("Update                            :");

        updateBox.setBackground(new java.awt.Color(102, 0, 51));
        updateBox.setEditable(true);
        updateBox.setForeground(new java.awt.Color(204, 204, 255));
        updateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "ID", "Mail", "Department", "Batch" }));
        updateBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        newInfo.setText("New Info                         :");

        newinf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newinfActionPerformed(evt);
            }
        });

        done.setBackground(new java.awt.Color(102, 0, 51));
        done.setForeground(new java.awt.Color(204, 204, 255));
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        back1.setBackground(new java.awt.Color(102, 0, 51));
        back1.setForeground(new java.awt.Color(204, 204, 255));
        back1.setText("Back");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newInfo))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateUName)
                            .addComponent(updateBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newinf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateUser)
                    .addComponent(updateUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateUser1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newInfo)
                    .addComponent(newinf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(done)
                    .addComponent(back1))
                .addGap(0, 102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateUNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUNameActionPerformed

    }//GEN-LAST:event_updateUNameActionPerformed

    private void newinfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newinfActionPerformed
        
    }//GEN-LAST:event_newinfActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        uname=updateUName.getText();
        update= (String) updateBox.getSelectedItem().toString();
        info=newinf.getText();
        
       if(update.equals("Name")){
            try
            {
                String sql= "UPDATE signininfo set name =? where user= ?";
                PreparedStatement ps=con.prepareStatement(sql);
                
                ps.setString(1, info);
                ps.setString(2, uname);
                ps.executeUpdate();
                
                afterUp ap=new afterUp();
                this.dispose();
                ap.setVisible(true);
                
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
       else if(update.equals("Mail")){
            try
            {
                String sql= "UPDATE signininfo set email =? where user= ?";
                PreparedStatement ps=con.prepareStatement(sql);
                
                ps.setString(1, info);
                ps.setString(2, uname);
                ps.executeUpdate();
                
                afterUp ap=new afterUp();
                this.dispose();
                ap.setVisible(true);
                
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
       else if(update.equals("Department")){
            try
            {
                String sql= "UPDATE signininfo set dept =? where user= ?";
                PreparedStatement ps=con.prepareStatement(sql);
                
                ps.setString(1, info);
                ps.setString(2, uname);
                ps.executeUpdate();
                
                afterUp ap=new afterUp();
                this.dispose();
                ap.setVisible(true);
                
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
       else if(update.equals("Batch")){
            try
            {
                String sql= "UPDATE signininfo set batch =? where user= ?";
                PreparedStatement ps=con.prepareStatement(sql);
                
                ps.setString(1, info);
                ps.setString(2, uname);
                ps.executeUpdate();
                
                afterUp ap=new afterUp();
                this.dispose();
                ap.setVisible(true);
                
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
       else if(update.equals("ID")){
            try
            {
                String sql= "UPDATE signininfo set id =? where user= ?";
                PreparedStatement ps=con.prepareStatement(sql);
                
                ps.setString(1, info);
                ps.setString(2, uname);
                ps.executeUpdate();
                
                afterUp ap=new afterUp();
                this.dispose();
                ap.setVisible(true);
                
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        
        
    }//GEN-LAST:event_doneActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        profile pr=new profile();
        this.dispose();
        pr.setVisible(true);
    }//GEN-LAST:event_back1ActionPerformed


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
            java.util.logging.Logger.getLogger(profileUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profileUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profileUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profileUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profileUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JButton done;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newInfo;
    private javax.swing.JTextField newinf;
    private javax.swing.JComboBox<String> updateBox;
    private javax.swing.JTextField updateUName;
    private javax.swing.JLabel updateUser;
    private javax.swing.JLabel updateUser1;
    // End of variables declaration//GEN-END:variables
}
