/**
 *
 * @author jrimland
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FancyRandomWordView extends JFrame{
    private JTextField currentWordField;
    private JButton getWordButton;
    private JTextField newCurrentWordField;
    private JButton newGetWordButton;
    
    
    private RandomWordLinkedListModel list;
    private RandomWordArrayListModel model;
    FancyRandomWordView(RandomWordLinkedListModel list){
        this.list = list;
        
        currentWordField = new JTextField(20);
        getWordButton = new JButton("Add Words");
        newCurrentWordField = new JTextField(20);
        newGetWordButton = new JButton("Display");
        
        JPanel content = new JPanel();
        content.setLayout(null);
        currentWordField.setBounds(50, 20, 160, 20);
        content.add(currentWordField);
        getWordButton.setBounds(200, 20, 110, 20);
        content.add(getWordButton);
        newCurrentWordField.setBounds(50, 60, 160, 30);
        content.add(newCurrentWordField);
        newGetWordButton.setBounds(200, 60, 110, 30);
        content.add(newGetWordButton);
        
        
        this.setContentPane(content);
        this.pack();
        this.setTitle("Random Word MVC 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    FancyRandomWordView(RandomWordArrayListModel model){
        this.model = model;
        
        currentWordField = new JTextField(20);
        getWordButton = new JButton("Add Words");
        newCurrentWordField = new JTextField(20);
        newGetWordButton = new JButton("Display");
        
        JPanel content = new JPanel();
        content.setLayout(null);
        currentWordField.setBounds(50, 20, 160, 20);
        content.add(currentWordField);
        getWordButton.setBounds(200, 20, 110, 20);
        content.add(getWordButton);
        newCurrentWordField.setBounds(50, 60, 160, 30);
        content.add(newCurrentWordField);
        newGetWordButton.setBounds(200, 60, 110, 30);
        content.add(newGetWordButton);
        
        
        this.setContentPane(content);
        this.pack();
        this.setTitle("Random Word MVC 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void addWordButtonListener(ActionListener al) 
    {    
        getWordButton.addActionListener(al);
    }
    
    public void setCurrentWord(String newWord)
    {
        currentWordField.setText(newWord);
    }
    
    public void newAddWordButtonListener(ActionListener o) 
    {    
        newGetWordButton.addActionListener(o);
    }
    
    public String newSetCurrentWord()
    {
        return newCurrentWordField.getText();
    }
}
