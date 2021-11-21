
import static com.sun.javafx.fxml.expression.Expression.or;
import static com.sun.javafx.fxml.expression.Expression.or;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static javafx.beans.binding.Bindings.or;
import static javax.management.Query.or;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.text.View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niloofaryazdani
 */
class Controller
{
    Model model;
    NavView view;
    Timer tim;
    String direction;
    int score;
     private int loss;
    private int win;
    int point;
    
    Controller(Model model, NavView view) {
        this.model = model;
        this.view = view;
       
        tim = new Timer (40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TopPanel top = view.getInitialframe().getInitialPanel().getTopPanel();
                Object obj = e.getSource();
                if (obj == tim) {
                    JButton rb = view.getInitialframe().getInitialPanel().getBotPanel().getRb();
                    JButton lb = view.getInitialframe().getInitialPanel().getBotPanel().getLb();

                    int speed = top.getSpeed();
                    view.getInitialframe().getInitialPanel().getBotPanel();
                    Rectangle r1 = rb.getBounds();

                    Rectangle r2 = lb.getBounds();
                    int x1 = (int)r1.getX();
                    int y1 = (int)r1.getY();
                    //int y2 = (int) r2.getY();
                    if (direction.equals("UP")) y1 -=10; 
                    if (direction.equals("DOWN")) y1 +=10;
                    if (direction.equals("LEFT")) x1 -=10;
                    if (direction.equals("RIGHT")) x1 +=10;
                    if (x1<0) x1=0;
                    if (y1<0) y1=0;
                    // Rectangle r0 = this.getBounds ();
                    if (x1>1178-50) x1 = 1178-25 ;
                    if (y1>718-50) y1 = 718-50 ;
                    
                    if (x1 >= 1178-50) {
                        win++;
                        JOptionPane.showMessageDialog(null, "You win.");
                        view.getInitialframe().getInitialPanel().top.getScore().setText("Win: " + win + ", " + "Loss: " + loss);
                        InitGame();
                        return;
                    }


                    rb.setLocation(x1,y1);


                    int x2 = (int)r2.getX();
                    int y2 = (int)r2.getY();
                    if (x2<=x1-50) x2+=speed;
                    if (x2>=x1+50) x2-=speed;
                    if (y2>=y1+50) y2-=speed;
                    if (y2<=y1-50) y2+=speed;
                    lb.setLocation (x2,y2);
 
                    if (r1.intersects(r2)) {
                        JOptionPane.showMessageDialog(null, "You loss.");
                        loss++;
                        top.getScore().setText("Win: " + win + ", " + "Loss: " + loss);
                        InitGame();
                    }
                }
            }
         });
            
        
                

        view.getInitialframe().getInitialPanel().getBotPanel().addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                Rectangle rb = model.getRb().getBounds();
              
                if (!tim.isRunning()) tim.start();
                Point p  = rb.getLocation(); //need import 
                int x = p.x;
                int y = p.y;
                if(e.getKeyCode() == KeyEvent.VK_UP) direction = "UP";
                if(e.getKeyCode() == KeyEvent.VK_DOWN) direction = "DOWN";
                if(e.getKeyCode() == KeyEvent.VK_LEFT) direction = "LEFT";
                if(e.getKeyCode() == KeyEvent.VK_RIGHT) direction = "RIGHT";
                //tim.start();
        
                //rb.setLocation (x,y);
            }

            @Override
            public void keyReleased(KeyEvent e) {} 
        });
    }
    private void InitGame(){
        JButton rb = view.getInitialframe().getInitialPanel().getBotPanel().getRb();
        JButton lb = view.getInitialframe().getInitialPanel().getBotPanel().getLb();
        rb.setBounds(150, 350, 50, 50);
        lb.setBounds(800, 150, 50, 50);
        tim.stop();
    }
}
                    
           

                