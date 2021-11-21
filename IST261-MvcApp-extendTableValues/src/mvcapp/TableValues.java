/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcapp;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author niloofaryazdani
 */
class TableValues extends AbstractTableModel 
    {

         public final static int FIRST_NAME = 0;

  public final static int LAST_NAME = 1;

  public final static int GENDER = 4;

  public final static boolean GENDER_MALE = true;

  public final static boolean GENDER_FEMALE = false;

  public Object[][] values = {
      { "Celiea", "Abraham",new Float(15.67), new Boolean(GENDER_MALE) },
      { "Jo", "A",
          new Float(2.78), new Boolean(GENDER_MALE) },
      { "Jay", "A", 
          new Float(3.89), new Boolean(GENDER_FEMALE) },
      { "Ebrahim", "K",
          new Float(-4.70), new Boolean(GENDER_FEMALE) },
      { "Babak", "S",
          new Float(5.00), new Boolean(GENDER_FEMALE) } };

  public int getRowCount() {
    return values.length;
  }

  public int getColumnCount() {
    return values[0].length;
  }

  public Object getValueAt(int row, int column) {
    return values[row][column];
  }

}


    

