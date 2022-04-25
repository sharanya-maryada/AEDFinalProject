/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import Backend.EcoSystem;
import Backend.Employee.Employee;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.Organization;
import Backend.Organization.Organization.LegalType;
import Backend.Organization.Organization.Type;
import Backend.Organization.OrganizationDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ap
 */
public class ManageEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private OrganizationDirectory organizationDir;
    private Enterprise enterprise;

    public ManageEmpJPanel(OrganizationDirectory organizationDir, Enterprise enterprise) {
        initComponents();
        this.organizationDir = organizationDir;
        this.enterprise = enterprise;
        enterpriseNameTextField.setText(enterprise.getName());
        populateOrganizationComboBox();
        populateTable();
//        for (Organization o : organizationDir.getOrganizationList()) {
//
//            populateTable(o);
//        }

    }

    private void populateOrganizationComboBox() {
        organizationComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationComboBox.addItem(organization);
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);
        for (Organization o : organizationDir.getOrganizationList()) {
            for (Employee employee : o.getEmployeeDirectory().getEmployeeList()) {
                Object[] row = new Object[3];
                row[0] = o.getOrgName();
                row[1] = employee.getName();
                row[2] = o;
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

        jPanel1 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        enterpriseNameTextField = new javax.swing.JTextField();
        nameSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        empNameTextField = new javax.swing.JTextField();
        nameSeparator = new javax.swing.JSeparator();
        createOrgButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        orgNameTextField = new javax.swing.JTextField();
        nameSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(55, 96, 128));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 760, 121, 33));

        enterpriseNameTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        enterpriseNameTextField.setBorder(null);
        enterpriseNameTextField.setCaretColor(new java.awt.Color(30, 59, 92));
        enterpriseNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterpriseNameTextFieldFocusGained(evt);
            }
        });
        enterpriseNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseNameTextFieldActionPerformed(evt);
            }
        });
        add(enterpriseNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, 30));

        nameSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(nameSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 120, 10));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel4.setFont(new java.awt.Font("Raleway", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create Employee");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 928, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Organization");

        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                organizationComboBoxItemStateChanged(evt);
            }
        });
        organizationComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organizationComboBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                organizationComboBoxMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                organizationComboBoxMousePressed(evt);
            }
        });

        jLabel1.setText("Name of Employee");

        empNameTextField.setBorder(null);
        empNameTextField.setCaretColor(new java.awt.Color(30, 59, 92));
        empNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                empNameTextFieldFocusGained(evt);
            }
        });
        empNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameTextFieldActionPerformed(evt);
            }
        });

        nameSeparator.setForeground(new java.awt.Color(0, 0, 0));
        nameSeparator.setPreferredSize(new java.awt.Dimension(0, 10));

        createOrgButton.setBackground(new java.awt.Color(255, 255, 255));
        createOrgButton.setText("Create");
        createOrgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrgButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Name of Organization");

        orgNameTextField.setEditable(false);
        orgNameTextField.setBorder(null);
        orgNameTextField.setCaretColor(new java.awt.Color(30, 59, 92));
        orgNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                orgNameTextFieldFocusGained(evt);
            }
        });
        orgNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgNameTextFieldActionPerformed(evt);
            }
        });

        nameSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(createOrgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(217, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(orgNameTextField)
                            .addComponent(nameSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(empNameTextField)))
                        .addGap(52, 52, 52))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(createOrgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 630, 250));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name of Enterprise");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 30));

        organizationJTable.setBackground(new java.awt.Color(204, 255, 255));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Org Name", "Name", "Enterprise Name"
            }
        ));
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 633, 305));
    }// </editor-fold>//GEN-END:initComponents

    private void empNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empNameTextFieldFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_empNameTextFieldFocusGained

    private void empNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNameTextFieldActionPerformed

    private void createOrgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrgButtonActionPerformed
        // TODO add your handling code here:
        //directory.createDonorBankOrganization((Type)organizationComboBox.getSelectedItem());

        if (empNameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Employee  name cannot be empty");
            return;
        }

        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {

            if (employee.getName().equals(empNameTextField.getText())) {
                JOptionPane.showMessageDialog(null, "Employee cannot have same name");
                return;

            }

        }
        String name = empNameTextField.getText();
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable();
        empNameTextField.setText("");
    }//GEN-LAST:event_createOrgButtonActionPerformed

    private void enterpriseNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterpriseNameTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNameTextFieldFocusGained

    private void enterpriseNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNameTextFieldActionPerformed

    private void orgNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_orgNameTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_orgNameTextFieldFocusGained

    private void orgNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgNameTextFieldActionPerformed

    private void organizationComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizationComboBoxMouseClicked
        // TODO add your handling code here:

//        Organization o = (Organization) organizationComboBox.getSelectedItem();
//        orgNameTextField.setText(o.getOrgName());
    }//GEN-LAST:event_organizationComboBoxMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedItem = organizationJTable.getSelectedRow();
        if (selectedItem >= 0) {
            int dialougeButton = JOptionPane.YES_NO_OPTION;
            int dialougeSubmit = JOptionPane.showConfirmDialog(null, "Would you like to delete the employee?", "Warning!", dialougeButton);
            if (dialougeSubmit == JOptionPane.YES_OPTION) {
                Organization organization = (Organization) organizationJTable.getValueAt(selectedItem, 2);
                String employeeName = (String) organizationJTable.getValueAt(selectedItem, 1);
                for (Employee employ : organization.getEmployeeDirectory().getEmployeeList()) {

                    if (employ.getName().equals(employeeName)) {
                        organization.getEmployeeDirectory().removeEmployee(employ);
                        populateTable();
                    }
                }
      
                
            }
        } else {

            JOptionPane.showMessageDialog(null, "Please select a row");
        }

        //  for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
        //  }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void organizationComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizationComboBoxMousePressed
        // TODO add your handling code here:
       //     Organization o = (Organization) organizationComboBox.getSelectedItem();
      //  orgNameTextField.setText(o.getOrgName());
    }//GEN-LAST:event_organizationComboBoxMousePressed

    private void organizationComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_organizationComboBoxItemStateChanged
        // TODO add your handling code here:
//          Organization o = (Organization) organizationComboBox.getSelectedItem();
//        orgNameTextField.setText(o.getOrgName());
    }//GEN-LAST:event_organizationComboBoxItemStateChanged

    private void organizationComboBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizationComboBoxMouseEntered
        // TODO add your handling code here:
        Organization o = (Organization) organizationComboBox.getSelectedItem();
        orgNameTextField.setText(o.getOrgName());
    }//GEN-LAST:event_organizationComboBoxMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createOrgButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField empNameTextField;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator nameSeparator;
    private javax.swing.JSeparator nameSeparator1;
    private javax.swing.JSeparator nameSeparator2;
    private javax.swing.JTextField orgNameTextField;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables

}
