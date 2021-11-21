/*
Assignment: JavaFXAssignment
Name: Kaitlyn, Niloofar, Wei-Lun
ID: kzd5345, wbh5098
JavaFX features: Motion Blur (javafx.scene.effect) and we also used 
several different shapes.
*/
import java.io.File;
import java.net.MalformedURLException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.MotionBlur;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) throws MalformedURLException
    {
        
            Group root = new Group();
            Line seesaw = new Line(60,350, 350, 150);
            seesaw.setStroke(Color.DARKGREEN);
            seesaw.setStrokeWidth(20);
            Circle cir = new Circle (60,270,60);
            cir.setStroke(Color.CORAL);
            cir.setFill(Color.CHOCOLATE);
            Rectangle rec = new Rectangle (270, 80,70, 60);
            rec.setStroke(Color.BLUE);
            rec.setStrokeWidth(8);
            rec.setFill(Color.YELLOW);
            Line left = new Line(180, 280,160, 340);
            left.setStrokeWidth(8);
            Line right = new Line (180, 280,250, 340);
            right.setStrokeWidth(8);
            
            Text t = new Text();
            t.setX(10);
            t.setY(40);
            t.setCache(true);
            t.setText("Seesaw");
            t.setFill(Color.GREEN);
            t.setFont(Font.font(null, FontWeight.BOLD, 36));
            
            MotionBlur mbEffect = new MotionBlur(); //uses effect controls to add motion blur to word "seesaw"
            mbEffect.setRadius(10);
            mbEffect.setAngle(30);
            
            t.setEffect(mbEffect);
            t.setTranslateX(10);
            t.setTranslateY(150);
            
            
            ToggleButton play = new ToggleButton("Music On/Off");
            String uriString = new File("src/vid.mp3").toURI().toURL().toString();
            Media videoFile = new Media(uriString);
            MediaPlayer mediaplayer = new MediaPlayer(videoFile);
            mediaplayer.setCycleCount(999999999);
            mediaplayer.setVolume(0.1);
            mediaplayer.setAutoPlay(true);
            play.setOnAction(event -> {
                if (play.isSelected()) {
                    mediaplayer.pause();
                }
                else {
                    mediaplayer.play();
                }
            });
            
            root.getChildren().addAll(seesaw,cir,rec,left,right, t, play);
            Scene scene = new Scene(root, 400, 400,Color.SKYBLUE);
            
            primaryStage.setTitle("IST 261");
            primaryStage.setScene(scene);
            primaryStage.show();
        } 

    public static void main(String[] args) {
        launch(args);
    }   
}