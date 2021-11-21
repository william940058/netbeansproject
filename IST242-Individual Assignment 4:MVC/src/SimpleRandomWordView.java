/**
 *
 * @author jrimland
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleRandomWordView extends JFrame{
    private JTextField currentWordField;
    private JButton getWordButton;
    
    JTextField newCurrentWordField;
    private JButton newGetWordButton;
    
    
    private RandomWordArrayListModel model;
    private RandomWordLinkedListModel list;
    SimpleRandomWordView(RandomWordArrayListModel model){
        this.model = model;
        
        currentWordField = new JTextField(20);
        getWordButton = new JButton("Get new word");
        
        JPanel content = new JPanel();
        content.add(currentWordField);
        content.add(getWordButton);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Random Word MVC Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        newCurrentWordField = new JTextField(20);
        newGetWordButton = new JButton("Submit");
        content.add(newCurrentWordField);
        content.add(newGetWordButton);
        this.setContentPane(content);
        this.pack();
        
    }
    SimpleRandomWordView(RandomWordLinkedListModel list){
        this.list = list;
        
        currentWordField = new JTextField(20);
        getWordButton = new JButton("Get a new word");
        
        JPanel content = new JPanel();
        content.add(currentWordField);
        content.add(getWordButton);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Random Word MVC Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        newCurrentWordField = new JTextField(20);
        newGetWordButton = new JButton("Submit");
        content.add(newCurrentWordField);
        content.add(newGetWordButton);
        this.setContentPane(content);
        this.pack();
        
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
