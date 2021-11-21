/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

import java.util.ArrayList;

/**
 *
 * @author macbookpro
 */
public class StudentDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student students[] = new Student[3];
        
        
        //ArrayList<Student> students = new ArrayList();
        
        students[0] = new Student("John", "Doe", 3.1);
        students[1] = new Student("Jane", "Deere", 3.25);
        students[2] = new Student("Sam", "Spade", 2.9);
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    
    }
}
