/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Backend.Connection;

import Backend.UserAccount.UserAccount;
import Backend.WorkQueue.WorkRequest;

/**
 *
 * @author ms
 */
public class Connection {
    
    private WorkRequest donorRequest ;
    private WorkRequest receiverRequest ;
    private String doctorStatus; 
    private UserAccount doctorAssigned;
    private UserAccount advocateAssigned ;
    private String advocateStatus ;
    private String Organ ;
    private String inventoryStatus; 

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }
    
    

    public UserAccount getAdvocateAssigned() {
        return advocateAssigned;
    }

    public void setAdvocateAssigned(UserAccount advocateAssigned) {
        this.advocateAssigned = advocateAssigned;
    }

    public String getAdvocateStatus() {
        return advocateStatus;
    }

    public void setAdvocateStatus(String advocateStatus) {
        this.advocateStatus = advocateStatus;
    }
    
       
    public String getOrgan() {
        return Organ;
    }

    public void setOrgan(String Organ) {
        this.Organ = Organ;
    }
    

    public String getDoctorStatus() {
        return doctorStatus;
    }

    public void setDoctorStatus(String doctorStatus) {
        this.doctorStatus = doctorStatus;
    }

    public UserAccount getDoctorAssigned() {
        return doctorAssigned;
    }

    public void setDoctorAssigned(UserAccount doctorAssigned) {
        this.doctorAssigned = doctorAssigned;
    }


    public WorkRequest getDonorRequest() {
        return donorRequest;
    }

    public void setDonorRequest(WorkRequest donorRequest) {
        this.donorRequest = donorRequest;
    }

    public WorkRequest getReceiverRequest() {
        return receiverRequest;
    }

    public void setReceiverRequest(WorkRequest receiverRequest) {
        this.receiverRequest = receiverRequest;
    }

    @Override
    public String toString() {
        return Organ ;
    }
    
    
    
    
    
}
