/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.User;

import Backend.Address.Address;
import Backend.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author ap
 */
public class User {
 
    private String emailId;
    private String password;
    private String userName;
    private String name ;
    private char   type ;
    private String contactNumber;
    private Date dateOfBirth ;
    private String gender ;
    private String emergencyContactNumber;
    private String relation ;
    private String address; 
    private String zip ;
    private String state ;
    private String city ;
    private boolean heart ;
    private boolean liver ;
    private boolean lungs ;
    private boolean kidney ;
    private boolean eyes ;
    private JLabel pictureLabel;
    private byte[] dP;

    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }
    private boolean completeProfile = false;

    public boolean isCompleteProfile() {
        return completeProfile;
    }

    public void setCompleteProfile(boolean completeProfile) {
        this.completeProfile = completeProfile;
    }

    public JLabel getPictureLabel() {
        return pictureLabel;
    }

    public void setPictureLabel(JLabel pictureLabel) {
        this.pictureLabel = pictureLabel;
    }
    private ArrayList<WorkRequest> userRequestList ;

    public User() {
        userRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getUserRequestList() {
        return userRequestList;
    }

    public void setUserRequestList(ArrayList<WorkRequest> userRequestList) {
        this.userRequestList = userRequestList;
    }
    
    

    @Override
    public String toString() {
        return name ;
    }

    public boolean isHeart() {
        return heart;
    }

    public void setHeart(boolean heart) {
        this.heart = heart;
    }

    public boolean isLiver() {
        return liver;
    }

    public void setLiver(boolean liver) {
        this.liver = liver;
    }

    public boolean isLungs() {
        return lungs;
    }

    public void setLungs(boolean lungs) {
        this.lungs = lungs;
    }

    public boolean isKidney() {
        return kidney;
    }

    public void setKidney(boolean kidney) {
        this.kidney = kidney;
    }

    public boolean isEyes() {
        return eyes;
    }

    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public  void addUserRequest (WorkRequest  userRequest) {
    
    userRequestList.add(userRequest);
    }
     
}
