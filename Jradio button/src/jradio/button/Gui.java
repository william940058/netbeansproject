/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jradio.button;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author macbookpro
 */
public class Gui extends JFrame {
    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;
    private ButtonGroup group;
    
    public Gui(){
        super("the title");
        setLayout(new FlowLayout());
        tf = new JTextField("Hello", 25);
        add(tf);
        pb = new JRadioButton("plain", true);
        bb = new JRadioButton("bold", false);
        ib = new JRadioButton("italic", false);
        bib = new JRadioButton("bold and italic", false);
        add(pb);
        add(bb);
        add(ib);
        add(bib);
        
        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);
        
        pf = new Font("Serif", Font.PLAIN, 14);
        bf = new Font("Serif", Font.BOLD, 14);
        itf = new Font("Serif", Font.ITALIC, 14);
        bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        tf.setFont(pf);
        
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));
        
        
    }
    private class HandlerClass implements ItemListener{
        private Font font;
        
        public HandlerClass(Font f){
            font = f;
            
        }
        public void itemStateChanged(ItemEvent event){
            tf.setFont(font);
        }
        
    }
}
