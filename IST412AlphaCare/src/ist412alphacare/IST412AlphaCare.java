/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412alphacare;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Bingnan Dong
 */
public class IST412AlphaCare extends Application  {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       
       
     Parent root = FXMLLoader.load(getClass().getResource("/UserManage/Login.fxml"));
      //  Parent root = FXMLLoader.load(getClass().getResource("/TreatmentManage/AppointmentHistoryView.fxml"));
         
       Scene scene = new Scene(root);
       primaryStage.setTitle("AlphaCare System");
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
       
        // sqlite_user.dropTable(conn,"User");
    }
    
}
