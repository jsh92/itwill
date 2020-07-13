/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swingapp.view;

import com.swingapp.member.model.MemberDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SubUserid extends javax.swing.JFrame implements ActionListener {

    private MemberFrame memberFrame;
    private MemberDAO dao = new MemberDAO();

    /**
     * Creates new form SubUserid
     */
    public SubUserid() {
        initComponents();
        init();
        addEvent();
    }

    public SubUserid(MemberFrame memberFrame, String userid) {
        this();

        this.memberFrame = memberFrame;
        tfUserid.setText(userid);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfUserid = new javax.swing.JTextField();
        btDup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("아이디 중복검사");

        jLabel1.setText("아이디");

        tfUserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUseridActionPerformed(evt);
            }
        });

        btDup.setText("아이디확인");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tfUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDup)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfUserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDup))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUseridActionPerformed

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
            java.util.logging.Logger.getLogger(SubUserid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubUserid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubUserid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubUserid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubUserid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfUserid;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    private void addEvent() {
        btDup.addActionListener(this);

    }

    @Override
     public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btDup){
            try {
                useridDup();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

        private void useridDup() throws SQLException {
        //1
        String userid=tfUserid.getText();
        if(userid==null || userid.isEmpty()){
            JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
            tfUserid.requestFocus();
            return;
        }
        
        //2
        int result=dao.duplicateId(userid);
        
        //3
        if(result==MemberDAO.USABLE){
            int opt=JOptionPane.showConfirmDialog(this, userid
                + "는 사용가능한 아이디입니다. 사용하시겠습니까?",
                    "아이디 중복확인", JOptionPane.YES_NO_OPTION);
            
            if(opt==JOptionPane.YES_OPTION){
                this.dispose();
                memberFrame.tfUserid.setText(userid);
                memberFrame.setIsDuplicate(true); //중복확인 처리
            }
        }else if(result==MemberDAO.UNUSABLE){
            JOptionPane.showMessageDialog(this, userid
                +"는 이미 등록된 아이디입니다. 다른 아이디를 입력하세요");            
        }else{
            JOptionPane.showMessageDialog(this, "아이디 중복확인 실패!");            
        }
    }

}