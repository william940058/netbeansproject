/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcapp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author macbookpro
 */
public class PlayerUI extends JFrame{
    private int indexOfItemToDisplay;

    private final JTextField firstNameDisplayValue = new JTextField(15);
    private final JTextField lastNameDisplayValue = new JTextField(15);
    private final JTextField numberDisplayValue = new JTextField(15);

    private JPanel instrumentPanel;
    private JPanel buttonPanel;

    private final PlayerCntl playerCntl;

    public PlayerUI(PlayerCntl playerCntl, int startingIndexOfDisplay) {
        this.playerCntl = playerCntl;
        indexOfItemToDisplay = startingIndexOfDisplay;
        initComponents();
        setFieldView();
    }

    private void initComponents() {
        setTitle("Football Player Viewer");
        setSize(550, 300);
        setLocationRelativeTo(null);  // center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("Player First Name"));
        instrumentPanel.add(firstNameDisplayValue);
        instrumentPanel.add(new JLabel("Player Last Name"));
        instrumentPanel.add(lastNameDisplayValue);
        instrumentPanel.add(new JLabel("Player Number"));
        instrumentPanel.add(numberDisplayValue);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        TableValues tv = new TableValues();
        JTable jt = new JTable(tv);
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    jt.setColumnSelectionAllowed(true);
    JScrollPane jsp = new JScrollPane(jt);
    getContentPane().add(jsp, BorderLayout.CENTER);

        JButton previousButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");
        JButton newButton = new JButton("New");
        JButton deleteButton = new JButton("Delete");
        JButton editButton = new JButton("edit");
        JButton exitButton = new JButton("Exit");
        
        previousButton.addActionListener(event -> showPreviousPlayer());
        nextButton.addActionListener(event -> showNextPlayer());
        newButton.addActionListener(event -> playerCntl.addNewPlayer());
        deleteButton.addActionListener(event -> playerCntl.deletePlayer(indexOfItemToDisplay));
        editButton.addActionListener(event -> playerCntl.editPlayer(indexOfItemToDisplay));
        exitButton.addActionListener(event -> showExitPlayer());
        
        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(newButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(editButton);
        buttonPanel.add(exitButton);
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void showNextPlayer() {
        int listSize = playerCntl.getPlayerList().getListOfPlayers().size();
        if(indexOfItemToDisplay == listSize -1) {
            this.indexOfItemToDisplay = 0;
            playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay);
            setFieldView();
        }
        else{
            playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay++);
            setFieldView();
        }
    }
    private void showPreviousPlayer() {
        int listSize = playerCntl.getPlayerList().getListOfPlayers().size();
        if(indexOfItemToDisplay == 0){
            this.indexOfItemToDisplay = listSize - 1;
            playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay);
            setFieldView();
            
        }
        else{
            playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay--);
            setFieldView();
        }
                  
    }
    private void showExitPlayer() {
        System.exit(0);
    }

    private void setFieldView() {
        firstNameDisplayValue.setText(playerCntl.getPlayer(indexOfItemToDisplay).getFirstName());
        lastNameDisplayValue.setText(playerCntl.getPlayer(indexOfItemToDisplay).getLastName());
        numberDisplayValue.setText(playerCntl.getPlayer(indexOfItemToDisplay).getNumber());
    }
    public String editFirst()
    {
        return firstNameDisplayValue.getText();
    }
    public String editLast()
    {
        return lastNameDisplayValue.getText();
    }
    public String editNumber()
    {
        return numberDisplayValue.getText();
    }
    
    void refreshDisplayWithNewValues(int index) {
        boolean done = false;
        while(!done){
            try{
                if(indexOfItemToDisplay == index -1) {
                    this.indexOfItemToDisplay = 0;
                    playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay);
                    setFieldView();
                }
                else{
                    playerCntl.getPlayerList().getListOfPlayers().get(indexOfItemToDisplay++);
                    setFieldView();
                }
                done = true;
            }
            catch(IndexOutOfBoundsException e){
                this.indexOfItemToDisplay = 0;  
            }
        }
    }    
}


