/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLauncher.app.view;

import MyLauncher.app.model.MemberDAO;
import MyLauncher.app.model.MemberDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jseun
 */
public class MemberFrame extends javax.swing.JFrame implements ActionListener, ItemListener{
    private LoginGUI loginGui;
     private String[] emailArr 
        = {"naver.com","nate.com","daum.net","gmail.com","직접입력"};
    private MemberDAO dao = new MemberDAO();
    private boolean isDuplicate;  //중복확인 여부
    private String id;
    private int memFlag;
    private static final int MEMBER_REGISTER=1;  //회원가입
    private static final int MEMBER_EDIT=2;     //회원수정
    /**
     * Creates new form MemberFrame
     */
    public MemberFrame() {
        initComponents();
        init();
        addEvent();
    }
     //회원가입시 사용
    public MemberFrame(LoginGUI loginGui){
        this();
        
        this.loginGui=loginGui;
        memFlag=MEMBER_REGISTER;
        settingMember();
    }
    //회원수정시 사용
    public MemberFrame(String userid){
        this();
        
        this.id=userid;
        memFlag=MEMBER_EDIT;
        settingMember();
    }
    public boolean getIsDuplicate() {
        return isDuplicate;
    }

    public void setIsDuplicate(boolean isDuplicate) {
        this.isDuplicate = isDuplicate;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfEmail1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfEmail3 = new javax.swing.JTextField();
        cbEmail2 = new javax.swing.JComboBox<>();
        btDup = new javax.swing.JButton();
        cbHp1 = new javax.swing.JComboBox<>();
        tfHp2 = new javax.swing.JTextField();
        tfHp3 = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfPwd = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfUserid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setText("@");

        cbEmail2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btDup.setText("중복확인");

        cbHp1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "010", "011", "016", "017", "018", "019" }));

        btAdd.setText("회원가입");

        jLabel1.setText("이름");

        btCancel.setText("취소");

        jLabel2.setText("아이디");

        jLabel3.setText("비밀번호");

        tfPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPwdActionPerformed(evt);
            }
        });

        jLabel4.setText("이메일");

        jLabel5.setText("전화번호");

        tfUserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUseridActionPerformed(evt);
            }
        });

        jLabel6.setText("추가정보");

        taDescription.setColumns(20);
        taDescription.setRows(5);
        jScrollPane1.setViewportView(taDescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdd)
                        .addGap(37, 37, 37)
                        .addComponent(btCancel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(tfEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEmail2, 0, 118, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbHp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfHp2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfHp3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                                .addComponent(tfUserid, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDup)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDup))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tfEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbHp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btCancel))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPwdActionPerformed

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
            java.util.logging.Logger.getLogger(MemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btDup;
    private javax.swing.JComboBox<String> cbEmail2;
    private javax.swing.JComboBox<String> cbHp1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDescription;
    private javax.swing.JTextField tfEmail1;
    private javax.swing.JTextField tfEmail3;
    private javax.swing.JTextField tfHp2;
    private javax.swing.JTextField tfHp3;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPwd;
    public javax.swing.JTextField tfUserid;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel(emailArr);
        cbEmail2.setModel(cbModel);
        tfEmail3.setEnabled(false); 
    }

    private void addEvent() {
        btAdd.addActionListener(this);
        btCancel.addActionListener(this);
        btDup.addActionListener(this);
        cbEmail2.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {if(e.getSource()==btAdd){
            try {
                //회원가입
                register();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }else if(e.getSource()==btCancel){
            clear_tf();
        }else if(e.getSource()==btDup){
            //중복확인
            SubUseridGUI f = new SubUseridGUI(this, tfUserid.getText());
            f.setVisible(true);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==cbEmail2){
            if(e.getStateChange() == ItemEvent.SELECTED){
                String selItem=cbEmail2.getSelectedItem().toString();
                if(selItem.equals("직접입력")){
                    tfEmail3.setEnabled(true);
                    tfEmail3.requestFocus();
                    tfEmail3.setText("");
                }else{
                    tfEmail3.setText("");
                    tfEmail3.setEnabled(false);                    
                }
            }
        }
    }
    
    private void register() throws SQLException {
        //1
        String email1=tfEmail1.getText();
        String email3=tfEmail3.getText();
        String hp2=tfHp2.getText();
        String hp3=tfHp3.getText();
        String name=tfName.getText();
        String pwd=tfPwd.getText();
        String id=tfUserid.getText();
        String email2=cbEmail2.getSelectedItem().toString();
        String hp1=cbHp1.getSelectedItem().toString();
        String description = taDescription.getText();
        if(name==null || name.isEmpty()){
            JOptionPane.showMessageDialog(this, "이름을 입력하세요");
            tfName.requestFocus();
            return;                    
        }
        if(id==null || id.isEmpty()){
            JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
            tfUserid.requestFocus();
            return;                    
        }
        if(pwd==null || pwd.isEmpty()){
            JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
            tfPwd.requestFocus();
            return;                    
        }
        if(!isDuplicate){
            JOptionPane.showMessageDialog(this, "중복확인을 하세요");
            btDup.requestFocus();
            return;                    
        }        
        
        String phone="", email="";
        if(hp2!=null && !hp2.isEmpty() && hp3!=null && !hp3.isEmpty()){
            phone=hp1+"-"+hp2+"-"+hp3;
        }
        
        if(email1!=null && !email1.isEmpty()){
            if(email2.equals("직접입력")){
                if(email3!=null && !email3.isEmpty()){                
                    email=email1+"@"+email3;
                }
            }else{                
                email=email1+"@"+email2;                
            }
        }
        
        //2
        MemberDTO dto = new MemberDTO();
        dto.setEmail(email);
        dto.setPhone(phone);
        dto.setName(name);
        dto.setPwd(pwd);
        dto.setId(id);
        dto.setDescription(description);
        int cnt=dao.insertMember(dto);
        
        //3
        String result="";
        
        if(cnt>0){
            result="회원가입되었습니다.";
            JOptionPane.showMessageDialog(this, result);
            this.dispose();
           
        }else{
            result = "회원가입실패!";
            JOptionPane.showMessageDialog(this, result);            
        }        
    }

    private void clear_tf() {
    }
    
     private void showMember() throws SQLException {
        //1        
        //2
        MemberDTO dto=dao.selectMember(id);
        
        //3
        tfName.setText(dto.getName());
        String email=dto.getEmail();
        String phone=dto.getPhone();
        
        if(phone!=null && !phone.isEmpty()){
            String[] hpArr=phone.split("-");
            
            tfHp2.setText(hpArr[1]);
            tfHp3.setText(hpArr[2]);
            cbHp1.setSelectedItem(hpArr[0]);
        }
        
        if(email!=null && !email.isEmpty()){
            String[] emails=email.split("@"); //h@itwill.com, H@NATE.COM
            
            tfEmail1.setText(emails[0]); //h
            
            String email2 = emails[1]; //itwill.com, nate.com
            boolean emailExist=false;
            for(int i=0;i<emailArr.length;i++){
                if(email2.equals(emailArr[i])){
                    emailExist=true;
                    break;
                }
            }//for
            
            if(emailExist){
                cbEmail2.setSelectedItem(email2);
            }else{
                cbEmail2.setSelectedItem("직접입력");
                tfEmail3.setText(email2);
                tfEmail3.setEnabled(true);
            }
        }//if
    }

    private void settingMember() {
         if(memFlag==MEMBER_REGISTER){
            setTitle("회원가입");
            btAdd.setText("회원가입");
            tfName.setEditable(true);
            tfUserid.setEditable(true);
            tfPwd.setEditable(true);
            btDup.setEnabled(true);
        }else if(memFlag==MEMBER_EDIT){
            setTitle("회원 정보 수정");
            btAdd.setText("수정");
            tfName.setEditable(false);
            tfUserid.setEditable(false);
            tfPwd.setEditable(false);
            btDup.setEnabled(false);
            tfUserid.setText(id);
            
            try {
                showMember();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
