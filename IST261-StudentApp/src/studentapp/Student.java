/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;


/**
 *
 * @author macbookpro
 */
public class Student {
    
    String firstName;
    String lastName;
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "studentapp.Student[" + "firstName=" + firstName + " lastName= " + lastName + " gpa=" + gpa + ']';
    }
    
    
}
