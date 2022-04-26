/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Network;

import Backend.Email;
import Backend.Enterprise.EnterpriseDirectory;
import Backend.User.UserDirectory;
import Backend.UserAccount.UserAccountDirectory;

/**
 *
 * @author ap
 */
public class Network {
    private String name;
    private String city;
    private String zipcode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    private EnterpriseDirectory enterpriseDirectory;
     Email email;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        email = new Email();
    }
    
    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
