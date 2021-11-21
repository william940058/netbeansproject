package Controller;

import Model.Model;
import View.NorthPanel;
import View.View;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.Timer;

public class Controller {

    private Model model;
    private View view;
    Timer tim;
    String direction;
    int score;
    private int loss;
    private int win;
    int point;
    ArrayList<JRadioButton> radioButtons;
   
    public Controller(Model imodel, View iview) {
        model = imodel;
        view = iview;
        view.initialSetup();
        radioButtons = view.getInitialframe().getInitialPanel().getWp().getSp().getRadioButtons();
        view.getInitialframe().getInitialPanel().getWp().getHp().DisplayButtons(model.getFPData().getColumnNames());
        view.getInitialframe().getInitialPanel().getWp().getPp().DisplayLabels(model.getFPData().getLines(model.start(), model.end()));
        view.getInitialframe().getInitialPanel().getWp().getSp().DisplayRadioButtons(model.getFPData().getRadioButtonNames());//prints radio button names
        RadioButtonListener();
        
    }
    
    public void RadioButtonListener()
    {
        radioButtons.get(0).addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
               view.getInitialframe().getInitialPanel().getCp().getRb().setText("2");
               view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonSelection(0);
               view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonColor();
               view.getInitialframe().getInitialPanel().getCp().getLb().setText("28");  
               JOptionPane.showMessageDialog(null,"RB will be 2 and LB will be 28"); 
            }
        });
        radioButtons.get(1).addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                view.getInitialframe().getInitialPanel().getCp().getRb().setText("37");
                view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonSelection(1);
                view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonColor();
                view.getInitialframe().getInitialPanel().getCp().getLb().setText("2");
                JOptionPane.showMessageDialog(null,"RB will be 37 and LB will be 2");
                
            }
        });
        radioButtons.get(2).addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                view.getInitialframe().getInitialPanel().getCp().getRb().setText("28");
                view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonSelection(2);
                view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonColor();
                view.getInitialframe().getInitialPanel().getCp().getLb().setText("37");
                JOptionPane.showMessageDialog(null,"RB will be 28 and LB will be 37");
                
            }
        });
        radioButtons.get(3).addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                view.getInitialframe().getInitialPanel().getCp().getRb().setText("35");
                view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonSelection(3);
                view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonColor();
                view.getInitialframe().getInitialPanel().getCp().getLb().setText("91");
                JOptionPane.showMessageDialog(null,"RB will be 35 and LB will be 91");
                
            }
        });
        radioButtons.get(4).addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                view.getInitialframe().getInitialPanel().getCp().getRb().setText("26");
                view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonSelection(4);
                view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonColor();
                view.getInitialframe().getInitialPanel().getCp().getLb().setText("35");
                JOptionPane.showMessageDialog(null,"RB will be 26 and LB will be 35");
                
            }
        });
        radioButtons.get(5).addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                view.getInitialframe().getInitialPanel().getCp().getRb().setText("91");
                view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonSelection(5);
                view.getInitialframe().getInitialPanel().getWp().getSp().radioButtonColor();     
                view.getInitialframe().getInitialPanel().getCp().getLb().setText("26");
                JOptionPane.showMessageDialog(null,"RB will be 91 and LB will be 26");
                
            }
        });
                
        tim = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Key Pressed");
            }
       });
             
           tim = new Timer (40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
               NorthPanel top = view.getInitialframe().getInitialPanel().getNp();
                Object obj = e.getSource();
                if (obj == tim) {
                    JButton rb = view.getInitialframe().getInitialPanel().getCp().getRb();
                    JButton lb = view.getInitialframe().getInitialPanel().getCp().getLb();

                    int speed = top.getSpeed();
                    view.getInitialframe().getInitialPanel().getCp();
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
                    if (x1>1178-50) x1 = 950-25 ;
                    if (y1>718-50) y1 = 500-50 ;
                    
                    if (x1 >= 950-50) {
                        win++;
                        JOptionPane.showMessageDialog(null, "Touchdown.");
                        view.getInitialframe().getInitialPanel().getNp().getScore().setText("Win: " + win + ", " + "Loss: " + loss);
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
                        JOptionPane.showMessageDialog(null, "You lose.");
                        loss++;
                        top.getScore().setText("Win: " + win + ", " + "Loss: " + loss);
                        InitGame();
                    }
                    if (win > 1) {
                        win = 0;
                        loss = 0;
                        JOptionPane.showMessageDialog(null, "Next level???");
                        view.getInitialframe().getInitialPanel().getNp().getScore().setText("Win: " + win + ", " + "Loss: " + loss);
                        InitGame1();
                        return;
                    }
                }
            }
         });
    
    view.getInitialframe().getInitialPanel().getCp().getRb().addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                //System.out.println("Timer Pressed");
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                Rectangle rb = model.getRb().getBounds();
               // System.out.println("Timer Pressed");
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
        JButton rb = view.getInitialframe().getInitialPanel().getCp().getRb();
        JButton lb = view.getInitialframe().getInitialPanel().getCp().getLb();
        rb.setBounds(150, 350, 50, 50);
        lb.setBounds(800, 150, 50, 50);
        tim.stop();
    }
     private void InitGame1(){
        JButton rb = view.getInitialframe().getInitialPanel().getCp().getRb();
        JButton lb = view.getInitialframe().getInitialPanel().getCp().getLb();
        rb.setBounds(150, 350, 50, 50);
        lb.setBounds(800, 150, 50, 500);
        tim.stop();
    }
     
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

}