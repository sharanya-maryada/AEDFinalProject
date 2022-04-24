/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Backend.Network.Network;
import Backend.Organization.Organization;
import Backend.Role.Role;
import Backend.Role.SystemAdminRole;
import Backend.User.UserDirectory;
import java.util.ArrayList;

/**
 *
 * @author ap
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private  UserDirectory userDirectory;
    private Email email;
    private SendMessageTwilio twilio;
    
    
    public static EcoSystem getInstance(){
        if(business==null){
           business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        userDirectory  = new UserDirectory();
        email = new Email();
        twilio=new SendMessageTwilio();
    }
    
     public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
    
      public SendMessageTwilio getTwilio() {
        return twilio;
    }

    public void setTwilio(SendMessageTwilio twilio) {
        this.twilio = twilio;
    }
    
    
 public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

      
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
