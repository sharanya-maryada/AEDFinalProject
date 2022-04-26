/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Role;

import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import UI.Admin.AdminDashBoardJPanel;
import UI.Advocate.AdvocateDashBoardJPanel;
import UI.Coordinator.CoordinatorDashBoardJPanel;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import UI.Coordinator.CoordinatorManageRequestsJPanel;
import UI.InventoryManager.InventoryManagerDashBoardJPanel;

/**
 *
 * @author ms
 */
public class AdvocateRole extends Role {

    @Override
   public void createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        AdvocateDashBoardJPanel lab = new AdvocateDashBoardJPanel(account,organization,business,dB4OUtil,enterprise);
        userProcessContainer.add("AdvocateDashBoardJPanel",lab);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        lab.setVisible(true);
    }
    
}
