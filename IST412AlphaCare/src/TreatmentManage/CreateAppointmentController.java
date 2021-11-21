/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreatmentManage;

import DBManage.SqliteAppointment;
import DBManage.SqliteDB;
import DBManage.SqliteUser;
import UserManage.User;
import ist412alphacare.Navigation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author group9
 */
public class CreateAppointmentController implements Initializable {
    @FXML  private Label  helloTxt;
   
    @FXML private Label Status;
    @FXML private ChoiceBox<String> dapartmentChoice;
    @FXML private ChoiceBox<String> doctorChoice;
    @FXML private DatePicker appointmentDatePicker;
    @FXML private ChoiceBox<String> timeChoice;
    @FXML private ChoiceBox<String> statusChoice;
     
    private static User loginUser;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        helloTxt.setText("Create an appointment for user:" + loginUser.getUsername() );
        String[] department = {"General Surgery", "Neurology","Stomatology","Dermatology","Urology"};
        ObservableList<String> list;
        list = FXCollections.observableArrayList(department);
        dapartmentChoice.setItems(list);
     
         Connection conn =SqliteDB.getConnection();
         SqliteUser sqlite_user= new SqliteUser(); 
         ArrayList<String> doctorName = sqlite_user.getDoctorName(conn);
         list = FXCollections.observableArrayList(doctorName);
         doctorChoice.setItems(list);
        
      /*  String[] appointmentDoctor = {"Alan","Dennis","David"};
        list = FXCollections.observableArrayList( appointmentDoctor);
        doctorChoice.setItems(list);*/
      
        String[] appointmentTime = {"8:30am","9:00am","9:30am","10:00am","10:30am","11:00am","11:30am","2:00pm","2:30pm","3:00pm","3:30am","4:00pm"};
        list = FXCollections.observableArrayList(appointmentTime);
        timeChoice.setItems(list);
        
        String[] status = {"Scheduled","Cancelled"};
        list = FXCollections.observableArrayList(status);
        statusChoice.setItems(list);
       
    }   
    
    /**
     * Set the login user
     */
    public void userSet(User user){
        this.loginUser =user;
    }
    
    
     /**
     * check all input fields and store appointment in DB
     */
    @FXML
    private void handleSubmit(ActionEvent event) throws IOException {
        String dapartment = dapartmentChoice.getValue();
        String doctor = doctorChoice.getValue();
        LocalDate date =  appointmentDatePicker.getValue();
        String time = timeChoice.getValue();
        String status = statusChoice.getValue();
        
        if(!checkAppointmentInput())
            return;
      
      //insert appointment data in DB
        Appointment appointment= new Appointment(loginUser.getUsername(),dapartment, doctor,date,time ,status);
        insertAppointmentInDB(appointment);
        
        Status.setText("Appointment has saved in DB"); 
    }
  
    /**
     * Clear all input feilds for creating a new appointment
     */
    @FXML
    private void handleCancel(ActionEvent event) throws IOException {
      dapartmentChoice.setValue(null);
      doctorChoice.setValue(null);
      appointmentDatePicker.setValue(null);
      timeChoice.setValue(null);
      statusChoice.setValue(null);
     }

   
    
    /**
     * Returns whether all inputs for creating appointmet are correct
     * @return   A Boolean representing whether all inputs for creating appointmet are correct
     */
    public Boolean checkAppointmentInput(){
        
        String dapartment = dapartmentChoice.getValue();
        String doctor = doctorChoice.getValue();
        LocalDate date =  appointmentDatePicker.getValue();
        String time = timeChoice.getValue();
        String status = statusChoice.getValue();
        Boolean check =false;
       
       if(dapartment == null){
            Status.setText("Appointment Deparment can not be null.");
            return check;
        }
        
       if(doctor == null){
            Status.setText("Doctor name can not be null.");
             return check;
        }
       
      if (date == null){
         Status.setText("Appointment date can not be null.");
            return check;
       }
        
       if(time == null){
            Status.setText("Appointment time  can not be null.");
             return check;
        }
          
        if(status == null){
            Status.setText("Appointment status can not be null.");
            return check;
        }
        check =true;
        return check;
  
    }
    /**
     * Insert a new appointment in DB
     * @param appointment Insert a new appointment in DB
     */ 
    public void insertAppointmentInDB(Appointment appointment){
      
          //connect DataBase
         Connection conn =SqliteDB.getConnection();
         SqliteAppointment sqlite_appointment= new SqliteAppointment();
       
        // if not exists user table, create it
         sqlite_appointment.createTable(conn);
         sqlite_appointment.insertTable(conn, appointment);
     }
    
     /**
     * Display user interface to login
     */
     @FXML
    private void handleLogout(ActionEvent event) throws IOException {
        Navigation navigation = new  Navigation();
        navigation.handleLogout(event);

    }
   
     /**
     * Clear all input feilds for creating a new appointment
     */
    @FXML
    private void handleCreateAppointment(ActionEvent event) throws IOException {
      dapartmentChoice.setValue(null);
      doctorChoice.setValue(null);
      appointmentDatePicker.setValue(null);
      timeChoice.setValue(null);
      statusChoice.setValue(null);
    }
    
    /**
     * Display user interface to update selected appointment
     */
    @FXML
    private void handleUpdateAppointment(ActionEvent event) throws IOException {
       Status.setText("Please display appointment history, then select updated appointment in the table");
    }
    /**
     * Display user interface to access appointment history
     */
    @FXML
    private void handleAppointmentHistory(ActionEvent event) throws IOException {
    
     AppointmentHistoryViewController AppointmentHistory  = new AppointmentHistoryViewController();
     AppointmentHistory.userSet(loginUser);
     Navigation navigation = new  Navigation();
     navigation.handleAppointmentHistory(event);
    }
    /**
     * Display user interface to export appoinment
     */
    @FXML
    private void handleExportAppointment(ActionEvent event) throws IOException {
        Navigation navigation = new  Navigation();
        navigation.handleExportAppointment(event,loginUser.getUsername());
    }
    
     /**
     * Display user interface to patient's prescription
     */
    @FXML
   private void handlePatientPrescription(ActionEvent event) throws IOException {
       PrescriptionHistoryPatientController PrescriptionHistoryPatient  = new  PrescriptionHistoryPatientController();
        PrescriptionHistoryPatient.userSet(loginUser);
        Navigation navigation = new  Navigation();
        navigation.handlePatientPrescription(event);
    }
}
