/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreatmentManage;
import UserManage.Patient;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bingnan Dong
 */
public class Prescription {
    private Integer prescriptionID;
    private String patientID;
    private String symptoms;
    private String drugName;
    private String drugUse;
    private Integer drugDays;
    private String doctorName;
    private LocalDate prescriptionDate;
    private ArrayList<Drug> drug;
    
      /**
     * This creates a prescription for a patient
     * @param prescriptionID Set prescription ID for the prescription
     * @param patientID  set patient ID for the prescription
     * @param symptoms  set patient's symptoms for the prescription
     * @param drugName set drug name for the prescription
     * @param drugUse set drug use for the prescription
     * @param drugDays set drug days for the prescription
     * @param doctorName set  doctor name  for the prescription
     * @param prescriptionDate set date for the prescription
   */ 
    public Prescription(Integer prescriptionID, String patientID, String symptoms,String drugName, String drugUse,Integer drugDays,String doctorName,LocalDate prescriptionDate){
        this.prescriptionID = prescriptionID;
        this.patientID = patientID;
        this.symptoms =symptoms;
        this.drugName = drugName;
        this.drugUse = drugUse;
        this.drugDays =drugDays;
        this.doctorName =doctorName;
        this.prescriptionDate = prescriptionDate;
    }
    
    
     /**
     * This creates a prescription for a patient
     * @param patientID  set patient ID for the prescription
     * @param symptoms  set patient's symptoms for the prescription
     * @param drugName set drug name for the prescription
     * @param drugUse set drug use for the prescription
     * @param drugDays set drug days for the prescription
     * @param doctorName set  doctor name  for the prescription
     * @param prescriptionDate set date for the prescription
   */ 
    
     public Prescription(String patientID, String symptoms,String drugName, String drugUse,Integer drugDays,String doctorName,LocalDate prescriptionDate){
        this.prescriptionID = prescriptionID;
        this.patientID = patientID;
        this.symptoms =symptoms;
        this.drugName = drugName;
        this.drugUse = drugUse;
        this.drugDays =drugDays;
        this.doctorName =doctorName;
        this.prescriptionDate = prescriptionDate;
    }
     /**
     * Returns the prescription ID of a prescription
     * @return  A Integer representing the prescription ID of a prescription
     */
    
    public Integer getPrescriptionID(){
      
       return prescriptionID;
    }
    
    
     /**
     * Returns the patient's symptoms of a prescription
     * @return  A string representing the patient's symptoms of a prescription
     */
    
    public String getSymptoms(){
      
       return symptoms;
    }
   
    
      /**
     * Returns the patient ID of a prescription
     * @return  A string representing the patient ID of a prescription
     */
    
    public String getPatientID(){
      
       return patientID;
    }
    
     /**
     * Returns the order date of a prescription
     * @return  A date representing the order date of a prescription
     */
    
    public LocalDate getPrescriptionDate(){
      
       return prescriptionDate;
    }
    
    
   
    /**
     * Returns doctor name of a prescription
     * @return  A string  representing the doctor name of a prescription
     */
    
    public String getDoctorName(){
      
       return doctorName;
    }
    
     /**
     * Returns drug name of a prescription
     * @return  A string  representing the drug name of a prescription
     */
    public String getDrugName(){
      
       return drugName;
    }
     
     /**
     * Returns drug use of a prescription
     * @return  A string  representing the drug use of a prescription
     */
    public String getDrugUse(){
      
       return drugUse;
    }
   
     /**
     * Returns drug days of a prescription
     * @return  A Integer  representing the drug days of a prescription
     */
    public Integer getDrugDays(){
      
       return drugDays;
    }
}

