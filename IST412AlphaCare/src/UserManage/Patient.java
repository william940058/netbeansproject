/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserManage;

import TreatmentManage.Appointment;
import TreatmentManage.MedicalRecord;
import TreatmentManage.Prescription;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * A Patient is the entity that represents a person who is registered with an
 * office and visits with a doctors or multiple doctors.
 * @author Bingnan Dong
 */
public class Patient extends User {

    private ArrayList<Appointment> appointments;
    private ArrayList<MedicalRecord> medicalData;
    private ArrayList<Prescription> prescriptions;
   
 
/**
     * This is the constructor for the Doctor class
     * @param firstName Set first name for the Patient
     * @param lastName  Set last name for the Patient
     * @param username  set username for the Patient
     * @param emailaddress set emailaddress for the Patient 
     * @param  password set  password for thePatient
     * @param  type set type for the Patient
   */
    
   public Patient(String firstName, String lastName, String username, String emailaddress, String password, LocalDate dateBirth,String type){
        super(firstName, lastName, username, emailaddress, password, dateBirth,type  );
    }
   
      /**
     * Returns a apointment list of a  patient
     * @return a apointment list of a  patient
     */
    
   public ArrayList<Appointment> getApointment(String username){
        return appointments;
    }
   
     /**
     * Returns a medicaldata list of a patient
     * @return a apointment list of a  patient
     */
    
   public ArrayList<MedicalRecord> getMedicaldata(String username){
        return medicalData;
    }
   
      /**
     * Returns a prescription list of a patient
     * @return a prescription  list of a  patient
     */
    public ArrayList<Prescription> getPrescription(String username){
        return prescriptions;
    }
   
     /**
     * Sets a appointment list of a patient
     * @param appointments a prescription list of a patient 
     */
    
   public void setAppointment(ArrayList<Appointment> appointments)
   {
       this.appointments = appointments;
   }
}

