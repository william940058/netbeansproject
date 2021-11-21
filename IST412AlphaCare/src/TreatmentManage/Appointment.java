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
public class Appointment {
    private Integer appointmentID;
    private String patientID;
    private LocalDate appointmentDate;
    private String appointmentTime;
    private String doctorName;
    private String appointmentDepartment;
    private String status;
   
    
    /**
     * This creates an appointment for a patient
     * @param patientID  Set  patient ID for the appointment
     * @param appointmentDepartment set department for the appointment
     * @param doctorName set doctor name  for the appointment
     * @param appointmentDate  set apointment date for the appointment
     * @param appointmentTime set appointment time for the appointment
     * @param status set  appointment status for appointment
   */ 

   public Appointment(String patientID, String appointmentDepartment,String doctorName,LocalDate appointmentDate, String appointmentTime, String status  ){
        this.patientID =patientID;
        this.appointmentDepartment=appointmentDepartment;
        this.doctorName =doctorName;
        this.appointmentDate  =appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status =status;  
   }
   
    /**
     * This creates an appointment for a patient
     * @param appointmentID Set appointment ID for the appointment
     * @param patientID  Set  patient ID for the appointment
     * @param appointmentDepartment set department for the appointment
     * @param doctorName set doctor name  for the appointment
     * @param appointmentDate  set apointment date for the appointment
     * @param appointmentTime set appointment time for the appointment
     * @param status set  appointment status for appointment
   */ 
     public Appointment(Integer appointmentID,String patientID, String appointmentDepartment,String doctorName,LocalDate appointmentDate, String appointmentTime, String status  ){
        this.appointmentID = appointmentID;
        this.patientID =patientID;
        this.appointmentDepartment=appointmentDepartment;
        this.doctorName =doctorName;
        this.appointmentDate  =appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status =status;  
   }
   
  
    
     /**
     * Returns the appointment ID of an appointment
     * @return   A integer representing the appointment ID of an appointment
     */
    
    public Integer getAppointmentID(){
      
       return appointmentID;
    }   
    
    /**
     * Returns the patient ID of an appointment
     * @return   A string representing the patient ID of an appointment
     */
    
    public String getPatientID(){
      
       return patientID;
    }
    
    /**
     * Returns the appointment date of an appointment
     * @return  A date representing the appointment date of an appointment
     */
    
    public LocalDate getAppointmentDate(){
      
       return appointmentDate;
    }
    
     /**
     * Returns the appointment time of an appointment
     * @return   A String representing the appointment time of an appointment
     */
    
    public String getAppointmentTime(){
     return appointmentTime;
    }
     /**
     * Returns the doctor name of an appointment
     * @return   A string representing the doctor name of an appointment
     */
    
    public String getDoctorName(){
     return doctorName;
    }
    
     /**
     * Returns the appointment status of an appointment
     * @return   A string representing the appointment description of an appointment
     */
    public String getStatus(){
      
       return status;
    }

    /**
     * Returns the appointment department of an appointment
     * @return   A String representing the appointment department of an appointment
     */
    
    public String getAppointmentDepartment(){
     return appointmentDepartment;
    } 
}
