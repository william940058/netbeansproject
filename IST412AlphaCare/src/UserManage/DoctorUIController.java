/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserManage;
import TreatmentManage.CreatePrescriptionController;
import ist412alphacare.Navigation;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Group9
 */
public class DoctorUIController implements Initializable {
    @FXML private Button goBack;
    @FXML private Label  helloTxt;
    @FXML private Label Status;
    private static User loginUser;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          helloTxt.setText("Hello, " +  loginUser.getUsername() +"   ");
    }    
    
    /**
     * Set the login user
     */
    public void userSet(User user){
        this.loginUser = user;
    }
    
     /**
     * Display user interface to login
     */
    public void  handleLogout(ActionEvent event) throws IOException{
       Navigation navigation = new  Navigation();
       navigation.handleLogout(event);
     
    }
    
     /**
     * Display user interface to create prescription 
     */
    public void  handleCreatePrescription(ActionEvent event) throws IOException{
         // Status.setText("We'll implement this case later");
        CreatePrescriptionController createAppointment  = new CreatePrescriptionController();
        createAppointment.userSet(loginUser);
        Navigation navigation = new  Navigation();
        navigation.handleCreatePrescription(event);
       
    }
    
     /**
     * Display user interface to update prescription 
     */
    public void  handleUpdatePrescription(ActionEvent event) throws IOException{
          Status.setText("We'll implement this case later");
    }
    
     /**
     * Display user interface to display prescription history
     */
    public void  handlePrescriptionHistory(ActionEvent event) throws IOException{
          Status.setText("We'll implement this case later");
    }
}
