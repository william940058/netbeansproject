/* Kaitlyn, Niloofar, WEILUN 
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcapp;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTable;

/** 
 *
 * @author macbookpro
 */

public class ExtendsAbstractTableModel extends JFrame
{
    protected JTable table;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PlayerCntl play = new PlayerCntl();
         ExtendsAbstractTableModel stt = new ExtendsAbstractTableModel();
    stt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    stt.setSize(400, 200);
    stt.setVisible(true);
    }
    public ExtendsAbstractTableModel() {
    Container pane = getContentPane();
    pane.setLayout(new BorderLayout());
    TableValues tv = new TableValues();
    table = new JTable(tv);
    pane.add(table, BorderLayout.CENTER);
  }
}
  
    

