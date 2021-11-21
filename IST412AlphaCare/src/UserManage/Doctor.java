/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserManage;

import TreatmentManage.Prescription;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Bingnan Dong
 */
public class Doctor extends User {
     
    private ArrayList<Patient> myPatientList = new ArrayList<Patient>();
    private ArrayList<Prescription> myPrescription = new ArrayList<Prescription>();
    
     /**
     * This is the constructor for the Doctor class
     * @param firstName Set first name for the Doctor
     * @param lastName  Set last name for the Doctor
     * @param username  set username for the Doctor
     * @param emailaddress set emailaddress for the Doctor 
     * @param  password set  password for the Doctor
     * @param  type set type for the Doctor
   */
    
   public Doctor(String firstName, String lastName, String username, String emailaddress, String password, LocalDate dateBirth,String type  ){
       super(firstName, lastName, username, emailaddress, password,dateBirth, type  );
    }
    
    /**
     * Returns a patient list of the doctor
     * @return  a patient list of the doctor 
     */
    public ArrayList<Patient> getMyPatientList(){
        return myPatientList;
    }
    
    /**
     * Sets a patient list of a doctor
     * @param PatientList a patient list of a doctor  
     */
    public void setMyPatientList(ArrayList<Patient> PatientList){
        myPatientList = PatientList;
    }  
    
      /**
     * Returns a prescription list of a doctor
     * @return a prescription list of a doctor
     */
    public ArrayList<Prescription> getMyPrescription(){
        return myPrescription;
    }
    
  
    /**
     * Sets a prescription list of a doctor
     * @param myPrescription a prescription list of a doctor 
     */
    
    public void setMyPrescription(ArrayList<Prescription>  myPrescription){
        this.myPrescription =myPrescription;
    }  
}

