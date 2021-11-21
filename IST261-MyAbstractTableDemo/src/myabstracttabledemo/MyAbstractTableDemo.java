/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstracttabledemo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author macbookpro
 */
public class MyAbstractTableDemo extends JPanel{

    /**
     * @param args the command line arguments
     */
    public MyAbstractTableDemo(){
        JTable table = new JTable(new myATD());
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }
    public class myATD extends AbstractTableModel {
        final String[] columnNames = {"first", "second", "third", "fourth"};
        private Object[][] data = {
            {"one", "two", "three", "four"},
                    {"uno", "dos", "tres", "quattor"},
                            {"1", "2", "3", "4"}
        };
    
        @Override 
        public int getRowCount(){
        return data.length;
        }
        
        @Override 
        public int getColumnCount(){
        return columnNames.length;
        }
        @Override
        public Object getValueAt(int row, int col){
        return data[row][col];
        }
        @Override
        public boolean isCellEditable(int row, int col){
            return true;
        }
        @Override
        public void setValueAt(Object value, int row, int col){
            data[row][col]=value;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("myAbstractTableDemo");
        MyAbstractTableDemo newContentPane = new MyAbstractTableDemo();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }
    
}
