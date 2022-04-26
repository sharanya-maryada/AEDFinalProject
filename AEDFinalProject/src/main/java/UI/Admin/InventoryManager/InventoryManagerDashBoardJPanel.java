/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.InventoryManager;

import UI.Donor.*;
import UI.Receiver.ManageRequestReceiverJPanel;
import UI.Coordinator.*;
import UI.Admin.*;
import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Organization.CoordinatorOrganization;
import Backend.Organization.InventoryManagerOrganization;
import Backend.Organization.Organization;
import Backend.User.User;
import Backend.UserAccount.UserAccount;
import MainPages.LoginPage;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.SwingUtilities.getWindowAncestor;

/**
 *
 * @author ms
 */
public class InventoryManagerDashBoardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserDashBoardJPanel
     */

    private EcoSystem system;
    private Enterprise enterprise ;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private InventoryManagerOrganization inventoryManager;
    public InventoryManagerDashBoardJPanel(UserAccount account, Organization organization, EcoSystem system,DB4OUtil dB4OUtil,Enterprise enterprise) {
        initComponents();
       this.enterprise = enterprise ;
        this.dB4OUtil = dB4OUtil;
        this.system = system;
        this.userAccount =account;
        this.inventoryManager = (InventoryManagerOrganization)organization;
        setColor(profileInventoryBtn);
        resetColor(new JPanel[]{manageRequest,chartsPanelButton});
        ManageInventoryManagerDetailsJPanel jpanel = new ManageInventoryManagerDetailsJPanel(userAccount,system,inventoryManager,enterprise);
        userProcessContainer.add("ManageInventoryManagerDetailsJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane4 = new javax.swing.JSplitPane();
        manageAdmin = new javax.swing.JPanel();
        manageRequest = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        profileInventoryBtn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        chartsPanelButton = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(974, 682));

        jSplitPane4.setBackground(new java.awt.Color(55, 96, 128));
        jSplitPane4.setDividerSize(0);

        manageAdmin.setBackground(new java.awt.Color(255, 255, 255));

        manageRequest.setBackground(new java.awt.Color(0, 0, 0));
        manageRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageRequestMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Manage Request");

        javax.swing.GroupLayout manageRequestLayout = new javax.swing.GroupLayout(manageRequest);
        manageRequest.setLayout(manageRequestLayout);
        manageRequestLayout.setHorizontalGroup(
            manageRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageRequestLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageRequestLayout.setVerticalGroup(
            manageRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageRequestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sign-out.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        profileInventoryBtn.setBackground(new java.awt.Color(0, 0, 0));
        profileInventoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profileInventoryBtnMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Profile");

        javax.swing.GroupLayout profileInventoryBtnLayout = new javax.swing.GroupLayout(profileInventoryBtn);
        profileInventoryBtn.setLayout(profileInventoryBtnLayout);
        profileInventoryBtnLayout.setHorizontalGroup(
            profileInventoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileInventoryBtnLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        profileInventoryBtnLayout.setVerticalGroup(
            profileInventoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileInventoryBtnLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        chartsPanelButton.setBackground(new java.awt.Color(0, 0, 0));
        chartsPanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chartsPanelButtonMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Charts");

        javax.swing.GroupLayout chartsPanelButtonLayout = new javax.swing.GroupLayout(chartsPanelButton);
        chartsPanelButton.setLayout(chartsPanelButtonLayout);
        chartsPanelButtonLayout.setHorizontalGroup(
            chartsPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chartsPanelButtonLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        chartsPanelButtonLayout.setVerticalGroup(
            chartsPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chartsPanelButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        javax.swing.GroupLayout manageAdminLayout = new javax.swing.GroupLayout(manageAdmin);
        manageAdmin.setLayout(manageAdminLayout);
        manageAdminLayout.setHorizontalGroup(
            manageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profileInventoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chartsPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        manageAdminLayout.setVerticalGroup(
            manageAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageAdminLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(profileInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(chartsPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        jSplitPane4.setLeftComponent(manageAdmin);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane4.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageRequestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageRequestMousePressed
        // TODO add your handling code here:
        setColor(manageRequest);
        resetColor(new JPanel[]{chartsPanelButton,profileInventoryBtn});
        OrganAvailabilityCheckInventoryJPanel jpanel = new OrganAvailabilityCheckInventoryJPanel (userAccount, inventoryManager, system, dB4OUtil,enterprise);
        userProcessContainer.add("OrganAvailabilityCheckInventoryJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageRequestMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_exitMousePressed

    private void profileInventoryBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileInventoryBtnMousePressed
        // TODO add your handling code here:
        setColor(profileInventoryBtn);
        resetColor(new JPanel[]{manageRequest,chartsPanelButton});
        ManageInventoryManagerDetailsJPanel jpanel = new ManageInventoryManagerDetailsJPanel(userAccount,system,inventoryManager,enterprise);
        userProcessContainer.add("ManageInventoryManagerDetailsJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_profileInventoryBtnMousePressed

    private void chartsPanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chartsPanelButtonMousePressed
        // TODO add your handling code here:
        setColor(chartsPanelButton);
        resetColor(new JPanel[]{manageRequest,profileInventoryBtn});
        Charts jpanel = new Charts(system);
        userProcessContainer.add("Charts",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_chartsPanelButtonMousePressed

 private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(255,102,102));
    }
    
    private void resetColor(JPanel [] pane)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } 
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chartsPanelButton;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JPanel manageAdmin;
    private javax.swing.JPanel manageRequest;
    private javax.swing.JPanel profileInventoryBtn;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}