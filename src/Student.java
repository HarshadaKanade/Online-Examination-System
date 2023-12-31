
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
/**
 *
 * @author Harshada
 */
public class Student extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
    DBConnection db;
    PreparedStatement pst,pst1,pst2,pst3;
    ResultSet rs,rs1;
    Connection con;
 
    String answer,correct,selectedExam,selectedid ;
     int count=0,getmarks=0;
    JLabel exid,setqueid,setexid,queid,quenm,sample,sample2,result,score,score1,namelabel,myans;
    JTextField mark;
    JButton nextb,submit1b,submit;
    JComboBox Combobox_name,combo2;
    JRadioButton r1,r2,r3,r4;
    ButtonGroup b1;
    
    public Student() {
        initComponents();
        namelabel=new JLabel();
        namelabel.setBounds(35,87,128,27);
        namelabel.setFont(new Font("Tahoma",Font.BOLD,20));
        namelabel.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(namelabel);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        StartExam = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        resultbutton = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 102));
        setMinimumSize(new java.awt.Dimension(1600, 776));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student");

        StartExam.setBackground(new java.awt.Color(102, 0, 102));
        StartExam.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        StartExam.setForeground(new java.awt.Color(255, 255, 255));
        StartExam.setText("Start Exam");
        StartExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartExamActionPerformed(evt);
            }
        });

        LogOut.setBackground(new java.awt.Color(102, 0, 102));
        LogOut.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setText("Log out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        resultbutton.setBackground(new java.awt.Color(102, 0, 102));
        resultbutton.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        resultbutton.setForeground(new java.awt.Color(255, 255, 255));
        resultbutton.setText("Result");
        resultbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(StartExam, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(resultbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 493, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StartExam, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        Homepage.main(null);
        dispose();
    }//GEN-LAST:event_LogOutActionPerformed

    private void StartExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartExamActionPerformed
        // TODO add your handling code here:        
        jPanel.removeAll();
        jPanel.repaint();
        jPanel.revalidate();
        
        sample=new JLabel();
        sample.setText("Select Subject code");
        sample.setFont(new Font("Tahoma",Font.BOLD,16));       
        sample.setBounds(450,184,160,50);
        jPanel.add(sample);
        sample2=new JLabel();
        sample2.setText("Select Exam");
        sample2.setFont(new Font("Tahoma",Font.BOLD,16));       
        sample2.setBounds(450,130,160,50);
        jPanel.add(sample2);
        Combobox_name = new JComboBox();
        Combobox_name.setBounds(635,184,200,50);
        Combobox_name.setFont(new Font("Calibiri",Font.BOLD,16));
        jPanel.add(Combobox_name);
        combo2 = new JComboBox();
        combo2.setBounds(635,130,200,50);
        
        combo2.setFont(new Font("Calibiri",Font.BOLD,16));
        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IA1", "IA2", "IA3" }));
        jPanel.add(combo2);
        
        submit1b=new JButton();
        submit1b.setText("Take Exam");
        submit1b.setBounds(550,300,200,50);
        submit1b.setFont(new Font("Tahoma",Font.BOLD,16));
        jPanel.add(submit1b);
        FillCombo();
        Combobox_name.addActionListener(this::Combobox_nameActionPerformed);
        combo2.addActionListener(this::combo2ActionPerformed);
        submit1b.addActionListener(this::submit1bActionPerformed);
    }//GEN-LAST:event_StartExamActionPerformed
    private  void Combobox_nameActionPerformed(java.awt.event.ActionEvent evt){
        selectedExam =Combobox_name.getSelectedItem().toString();
    }
     private  void combo2ActionPerformed(java.awt.event.ActionEvent evt){
        selectedid =combo2.getSelectedItem().toString();
      
    }
    private void submit1bActionPerformed(java.awt.event.ActionEvent evt){
        int a = 0;
        db=new DBConnection();
        try {
            con=db.CONN();
            pst3=con.prepareStatement("select que_id,que_name,option1,option2,option3,option4,correct_ans,total_marks from questions where sub_code=? and IA=?");
            pst3.setString(1,selectedExam);
            pst3.setString(2,selectedid);
            rs1=pst3.executeQuery();
            if(rs1.first()==false){
                JOptionPane.showMessageDialog(this,"Exam is currently unavailable!");
            }
            else{
                db=new DBConnection();
                try {
                    con=db.CONN();
                     pst1=con.prepareStatement("insert into score values(?,?,?,?)");
                    pst1.setString(1,selectedExam);
                    pst1.setString(2,selectedid);
                    pst1.setString(3,namelabel.getText());
                    pst1.setInt(4,0);
                    a=pst1.executeUpdate();
                }
                 catch (Exception e) {
                        JOptionPane.showMessageDialog(this,e.getMessage()+ "\n Sorry,you've already given the exam!!!");
                }
            //JOptionPane.showMessageDialog(this,"All the best");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage()+ "\n Sorry,you've already given the exam!!!");
        }
        
        if(a==1){
            jPanel.removeAll();
            jPanel.repaint();
            jPanel.revalidate();
        
            b1= new ButtonGroup();
            r1=new JRadioButton();
            r2=new JRadioButton();
            r3=new JRadioButton();
            r4=new JRadioButton();
            exid=new JLabel();
            setexid=new JLabel();
            setqueid=new JLabel();
            queid=new JLabel();
             quenm=new JLabel();
            myans=new JLabel();
            exid.setText("Sub_code:");
            exid.setBounds(1200,50,110,40);
            exid.setFont(new Font("Calibiri",Font.BOLD,20));
      
            //myans.setBounds(1270,200,150,40);
            //myans.setFont(new Font("Calibiri",Font.BOLD,20));
            setexid.setBounds(1320,50,120,40);
            setexid.setFont(new Font("Calibiri",Font.BOLD,20));
            setexid.setText(selectedExam);
       
            setqueid.setBounds(200,50,40,40);
            setqueid.setFont(new Font("Calibiri",Font.BOLD,20));
            queid.setText("Question no:");
             queid.setBounds(70,50,140,40);
            queid.setFont(new Font("Calibiri",Font.BOLD,20));
            quenm.setBounds(70,110,900,148);
            quenm.setBorder(BorderFactory.createCompoundBorder(new SoftBevelBorder(BevelBorder.RAISED), BorderFactory.createEtchedBorder()));
            quenm.setFont(new Font("Calibiri",Font.BOLD,20));
            b1.add(r1);
            b1.add(r2);
            b1.add(r3);
            b1.add(r4);
            r1.setBounds(70, 280, 400, 40);
            r1.setFont(new Font("Calibiri",Font.BOLD,20));
            r2.setBounds(70, 325, 400, 40);
            r2.setFont(new Font("Calibiri",Font.BOLD,20));
            r3.setBounds(70, 370, 400, 40);
             r3.setFont(new Font("Calibiri",Font.BOLD,20));
            r4.setBounds(70, 415, 400, 40);
            r4.setFont(new Font("Calibiri",Font.BOLD,20));
        
             jPanel.add(exid);
            jPanel.add(queid);
            jPanel.add(quenm); 
             jPanel.add(setqueid);
            jPanel.add(r1);
            jPanel.add(r2);
            jPanel.add(r3);
            jPanel.add(r4);
             jPanel.add(setexid);

            resultbutton.setEnabled(false);
            StartExam.setEnabled(false);
            LogOut.setEnabled(false);
            nextb=new JButton();
             nextb.setText("Save & Next");
            //nextb.setFont(new Font("Calibiri",Font.BOLD,18));
            nextb.setBounds(120,560,160,48);
            nextb.setForeground(Color.WHITE);
            nextb.setBackground(new Color(102, 0, 102));
            nextb.setFont(new Font("Tahoma", 1, 16));
            jPanel.add(nextb);
                submit=new JButton();
            submit.setText("Submit");
             //submit.setFont(new Font("Calibiri",Font.BOLD,18));
            submit.setBounds(340,560,114,48);
             submit.setForeground(Color.WHITE);
            submit.setBackground(new Color(102, 0, 102));
            submit.setFont(new Font("Tahoma", 1, 16));
             jPanel.add(submit); 
            submit.addActionListener(this::submitActionPerformed);
            db=new DBConnection();
            Connection con;
            try {
                con=db.CONN();
                pst=con.prepareStatement("select que_id,que_name,option1,option2,option3,option4,correct_ans,total_marks from questions where sub_code=? and IA=?");
                pst.setString(1,selectedExam);
                pst.setString(2,selectedid);
                rs=pst.executeQuery();
                    while(rs.next()){
                        //if(rs.first()==false)
                        setqueid.setText(rs.getString(1));
                        quenm.setText(rs.getString(2));
                        r1.setText(rs.getString(3));
                         r2.setText(rs.getString(4));
                        r3.setText(rs.getString(5));
                         r4.setText(rs.getString(6));
                        correct=rs.getString(7);
                        getmarks=rs.getInt(8);
                        count=count+getmarks;
                        break;
                }
                                  
            } catch (SQLException e) {
                  JOptionPane.showMessageDialog(this,e.getMessage());
             }
            nextb.addActionListener(this::nextbActionPerformed);
         }    
    }

     private void nextbActionPerformed(ActionEvent evt) {    
        if(r1.isSelected()){
            answer=r1.getText();
        }
        else if (r2.isSelected()){
            answer=r2.getText();
        }
        else if (r3.isSelected()){
            answer=r3.getText();
        }
        else if (r4.isSelected()){
            answer=r4.getText();
        }
        else{
            answer=null;
        }
        if(answer.equals(correct)){
            try {     
                pst1=con.prepareStatement("update score set marks=marks+? where sub_code=? and IA=? and Username=?");
                pst1.setInt(1,getmarks);
                pst1.setString(2,selectedExam);
                pst1.setString(3,selectedid);
                pst1.setString(4,namelabel.getText());
                
                int k=pst1.executeUpdate();
               // JOptionPane.showMessageDialog(this,k+" update success");
                    
            } catch (HeadlessException | SQLException e) {
                  JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
         b1.clearSelection();
         try {
            if(rs.next()){
                
                setqueid.setText(rs.getString(1));
                quenm.setText(rs.getString(2)); 
                r1.setText(rs.getString(3));
                r2.setText(rs.getString(4));
                r3.setText(rs.getString(5));
                r4.setText(rs.getString(6));
                correct=rs.getString(7);
                getmarks=rs.getInt(8);
                count=count+getmarks;
            }
            else{
                nextb.setEnabled(false);
                setqueid.setForeground(new java.awt.Color(204, 204, 204));
                quenm.setForeground(new java.awt.Color(204, 204, 204));
                queid.setForeground(new java.awt.Color(204, 204, 204));
                r1.setForeground(new java.awt.Color(204, 204, 204));
                r2.setForeground(new java.awt.Color(204, 204, 204));
                r3.setForeground(new java.awt.Color(204, 204, 204));
                r4.setForeground(new java.awt.Color(204, 204, 204));
                r1.setEnabled(false);
                r2.setEnabled(false);
                r3.setEnabled(false);
                r4.setEnabled(false);
            }
                                               
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }   
    } 
    private void submitActionPerformed(ActionEvent evt) {
        jPanel.removeAll();
         jPanel.repaint();
         jPanel.revalidate();
         result=new JLabel();
         result.setBounds(100,100,300,50);
         result.setText("Your score :");
         result.setFont(new Font("Tahoma",Font.BOLD,20));
         jPanel.add(result);
        score=new JLabel();
        score.setBounds(310,100,500,50);
         score.setFont(new Font("Tahoma",Font.BOLD,20));
         jPanel.add(score);
        db=new DBConnection();
        Connection con;
         try{
            con=db.CONN();
            pst2=con.prepareStatement("select marks from score where sub_code=? and IA=? and Username=?");
            pst2.setString(1, selectedExam);
            pst2.setString(2, selectedid);            
            pst2.setString(3,namelabel.getText());
            ResultSet rs2 = pst2.executeQuery();
            rs2.next();
            score.setText(rs2.getString("marks")+"/"+count);
         }catch(Exception e){
             JOptionPane.showMessageDialog(this,e.getMessage());
         }
         count=0;
         resultbutton.setEnabled(true);
        StartExam.setEnabled(true);
        LogOut.setEnabled(true);
     }
    private void resultbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultbuttonActionPerformed
        // TODO add your handling code here:
        jPanel.removeAll();
        jPanel.repaint();
        jPanel.revalidate();
        JScrollPane jp=new JScrollPane();
        JTable table;
         jp.setBounds(400,120,650,320);
         
         jPanel.add(jp);
         table=new JTable();
         jp.setViewportView(table);
        db=new DBConnection();
        try {
            con=db.CONN();
            //String sql=;
            pst=con.prepareCall("call MYresult(?)");
            pst.setString(1,namelabel.getText() );
            rs=pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
         table.getTableHeader().setFont(new Font("Tahoma",Font.BOLD,18));
        
        table.setRowHeight(40);
        table.setFont(new java.awt.Font("Tahoma", 0, 18));
        table.setEnabled(false);
    }//GEN-LAST:event_resultbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOut;
    private javax.swing.JButton StartExam;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resultbutton;
    // End of variables declaration//GEN-END:variables
    
    private void FillCombo() {
        
        db=new DBConnection();
        Connection con;
       
        try {
            con=db.CONN();
            pst=con.prepareStatement("Select sub_code from subject,student where subject.sem=student.sem group by sub_code");
            rs=pst.executeQuery();
            while(rs.next()){
                String name=rs.getString("sub_code");
                Combobox_name.addItem(name);
            }  
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }   
}
