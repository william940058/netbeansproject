/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author macbookpro
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String fileName = "studentInfo.txt";
        ArrayList<Student> studentList = addStudentsToList(fileName);
        System.out.println(studentList);
        
    }
    
    private static ArrayList<Student> addStudentsToList(String fileName) {
      
    ArrayList<Student> studentList = new ArrayList();
    File fr = new File(fileName);
    try {
        BufferedReader br = new BufferedReader(new FileReader(fr));
        String line;
        while((line = br.readLine()) != null){
            String[] data = line.split(" ");
            studentList.add(new Student(data[0],data[1],Double.parseDouble(data[2])));
        
        }
    }
    catch(IOException err){
        System.out.println("error occurred");
    }
    return studentList;
    }
    
    
}
