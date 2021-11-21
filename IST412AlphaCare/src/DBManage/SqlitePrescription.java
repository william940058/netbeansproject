/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBManage;

import TreatmentManage.Appointment;
import TreatmentManage.Prescription;
import UserManage.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author group9
 */
public class SqlitePrescription extends SqliteDB {
    
    ArrayList<Prescription> prescription = new ArrayList<>();
     /**
     * Create Table Appointment
     */
     public  void createTable(Connection conn){
     
      
        String sql = "CREATE TABLE IF NOT EXISTS Prescription ("
                + "prescriptionID integer PRIMARY KEY AUTOINCREMENT, "
                + "patientID text,"
                + "symptoms text,"
                + "drugName text," 
                + "drugUse text,"
                + "drugDays ineger,"
                + "doctorName text," 
                + "prescriptionDate text);";  // Date format
       try (
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            stmt.close();
            System.out.println("Table Prescription created successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }    
    }
  
    /**
     * Insert a new prescription in DB
     * @param conn  the connection of DB
     * @param prescription Insert a new prescription in DB
     */
    public  void insertTable(Connection conn,Prescription prescription){
         
        try (
            Statement stmt = conn.createStatement()) {
           
           String sql = "INSERT INTO Prescription (patientID,symptoms,drugName,drugUse,drugDays,doctorName,prescriptionDate) " +
                   "VALUES (+"
                     + "'" + prescription.getPatientID() + "', " 
                     + "'" + prescription.getSymptoms() + "', " 
                     + "'" + prescription.getDrugName() + "', "
                     + "'" + prescription.getDrugUse() + "', "
                     +       prescription.getDrugDays() + ", "
                     + "'" + prescription.getDoctorName() + "', "
                     + "'" + prescription.getPrescriptionDate().toString() + "'); ";
            stmt.execute(sql);
            stmt.close();
            System.out.println("Table Prescription inserted successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }        
     }
    
    /**
     * Returns prescriptions of a given user
     * @return   A Arraylist representing prescription of a given user
     * @param conn  the connection of DB
     * @param username the username of a given user
     */
     public ArrayList<Prescription> selectTable(Connection conn, String username,String userType)  {
           
           ArrayList<Prescription> prescription= new ArrayList<>();
           try (
            Statement stmt = conn.createStatement()) {
             ResultSet rs;
            if (userType.equalsIgnoreCase("Patient"))
              rs = stmt.executeQuery( "SELECT * FROM Prescription where patientID =" + "'" + username + "';" );
            else
              rs = stmt.executeQuery( "SELECT * FROM Prescription where doctorName =" + "'" + username + "';" );
          
            while ( rs.next() ) {
             Integer prescriptionID =  rs.getInt("prescriptionID");
             String  patientID = rs.getString("patientID");
             String  symptoms = rs.getString("symptoms");
             String  drugName = rs.getString("drugName");
             String  drugUse = rs.getString("drugUse");
             Integer drugDays = rs.getInt("drugDays");
             String  doctorName = rs.getString("doctorName");
             String  prescriptionDate = rs.getString("prescriptionDate");
             prescription.add(new Prescription(prescriptionID,patientID,symptoms,drugName,drugUse,drugDays,doctorName,LocalDate.parse(prescriptionDate, DateTimeFormatter.ISO_DATE)));
           }
            rs.close();
            stmt.close();
            System.out.println("Table Prescription selected successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return  prescription;  
      }
}
