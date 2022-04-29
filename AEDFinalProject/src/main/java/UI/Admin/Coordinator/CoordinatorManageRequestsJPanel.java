/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.Coordinator;

import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Organization.CoordinatorOrganization;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import Backend.WorkQueue.CoordinatorTestWorkRequest;
import Backend.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ms
 */
public class CoordinatorManageRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUsersJPanel
     */
   private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private CoordinatorOrganization coordinator;
    private Enterprise enterprise;

    public CoordinatorManageRequestsJPanel( JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.coordinator = (CoordinatorOrganization)organization;
        this.enterprise = enterprise ;
        userNameJTextField.setText(userAccount.getEmployee().getName());
        orgTextField.setText(coordinator.getOrgName());
        organBankTextField.setText(enterprise.getName());
        populateTable();
          if(userAccount.getEmployee().getdP() !=null){
        //Working line
         byte[] JLabelpictureLabel = userAccount.getEmployee().getdP();
        ImageIcon i = setPicturebyte(JLabelpictureLabel);
        pictureLabel.setIcon(i);
        }
        else{
            System.err.println("No Image");
        }
          
    }
   private ImageIcon setPicturebyte(byte[] byteArrayImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(byteArrayImage);
        Image picCar = imageCar.getImage();
        JLabel pictureLabel1 = new JLabel();
        pictureLabel1.setSize(107, 133);
        Image resizedImage = picCar.getScaledInstance(pictureLabel1.getWidth(), pictureLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;  
}
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : coordinator.getWorkQueue().getWorkRequestList()){

         if ( request.getCoordinatorStatus().equals("Requested by Donor") ||request.getCoordinatorStatus().equals("Requested by Receiver") || request.getCoordinatorAssigned().getUsername() == userAccount.getUsername() )
  { 
      
            Object[] row = new Object[6];
            row[0] = request.getUser();
            row[1] = request.getUser().getType() == 'd'  ? "donor" : "receiver" ;
            row[2] = request    ;     
            if (request.getCoordinatorStatus().equals("Requested by Donor")||request.getCoordinatorStatus().equals("Requested by Receiver"))  {
                row[3] =  "unassinged";
            }
            else {
             row[3] = request.getCoordinatorAssigned().getUsername();
            }
            row[4] = request.getCoordinatorStatus();
            if(request.getUser().getType() == 'd'){
            row[5] = request.getDonorOrgan();
                    }
            else{
            row[5] = request.getReceiverOrgan();
            }
                     
            model.addRow(row);
            
            }
      }
        
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        nameSeparator = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        organBankTextField = new javax.swing.JTextField();
        nameSeparator9 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        orgTextField = new javax.swing.JTextField();
        nameSeparator10 = new javax.swing.JSeparator();
        pictureLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(890, 539));

        workRequestJTable.setAutoCreateRowSorter(true);
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client's Name", "Type", "Date", "Assigned", "Status", "Organ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        workRequestJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manage Requests for Coordinator");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel2.setText("Coordinator's Name");

        userNameJTextField.setEditable(false);
        userNameJTextField.setBorder(null);
        userNameJTextField.setCaretColor(new java.awt.Color(30, 59, 92));
        userNameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameJTextFieldFocusGained(evt);
            }
        });
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        nameSeparator.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel12.setText("Organ Bank ");

        organBankTextField.setEditable(false);
        organBankTextField.setBorder(null);
        organBankTextField.setCaretColor(new java.awt.Color(30, 59, 92));
        organBankTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                organBankTextFieldFocusGained(evt);
            }
        });
        organBankTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organBankTextFieldActionPerformed(evt);
            }
        });

        nameSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel13.setText("Organization");

        orgTextField.setEditable(false);
        orgTextField.setBorder(null);
        orgTextField.setCaretColor(new java.awt.Color(30, 59, 92));
        orgTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                orgTextFieldFocusGained(evt);
            }
        });
        orgTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgTextFieldActionPerformed(evt);
            }
        });

        nameSeparator10.setForeground(new java.awt.Color(0, 0, 0));

        pictureLabel.setBackground(new java.awt.Color(255, 255, 255));
        pictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(organBankTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(orgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(nameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(organBankTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(assignJButton)
                        .addGap(106, 106, 106)
                        .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(processJButton)
                            .addComponent(assignJButton))
                        .addGap(77, 77, 77))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

      int selectedRow = workRequestJTable.getSelectedRow();
        
       if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row to Process" ,"Warning" , JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         if (workRequestJTable.getValueAt(selectedRow, 4).equals("Completed") || workRequestJTable.getValueAt(selectedRow, 4).equals("Rejected") ) {
            JOptionPane.showMessageDialog(null, "Request is either Completed or Rejected " ,"Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        if (workRequestJTable.getValueAt(selectedRow, 3) != "unassinged") {
            JOptionPane.showMessageDialog(null, "Request is already assigned " ,"Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 2);
        request.setCoordinatorAssigned(userAccount);
        request.setCoordinatorStatus("With co-ordinator");
        request.setOverallStatus("Request with Co-ordinator " + userAccount.getUsername());
        request.setActionDate(new Date());
        JOptionPane.showMessageDialog(null, "Request assigned " ,"Info" , JOptionPane.INFORMATION_MESSAGE);
        populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
         int selectedRow = workRequestJTable.getSelectedRow();
        
         if (workRequestJTable.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(null, "Please select one row to Process" ,"Warning" , JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         if (workRequestJTable.getValueAt(selectedRow, 4).equals("Completed") || workRequestJTable.getValueAt(selectedRow, 4).equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "Request is either Completed or Rejected " ,"Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        if (workRequestJTable.getValueAt(selectedRow, 3) == "unassinged") {
            JOptionPane.showMessageDialog(null, "Please assign the request to yourself and then proceed" ,"Warning" , JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        CoordinatorTestWorkRequest request = (CoordinatorTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 2);
        CoordinatorMedicalCheckDetailsJPanel medicalHistory = new CoordinatorMedicalCheckDetailsJPanel(request,enterprise,userAccount);
        userProcessContainer.add("CoordinatorAssistantWorkAreaJPanel",medicalHistory);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_processJButtonActionPerformed

    private void userNameJTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameJTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldFocusGained

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void organBankTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_organBankTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_organBankTextFieldFocusGained

    private void organBankTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organBankTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organBankTextFieldActionPerformed

    private void orgTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_orgTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_orgTextFieldFocusGained

    private void orgTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator nameSeparator;
    private javax.swing.JSeparator nameSeparator10;
    private javax.swing.JSeparator nameSeparator9;
    private javax.swing.JTextField orgTextField;
    private javax.swing.JTextField organBankTextField;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JButton processJButton;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
