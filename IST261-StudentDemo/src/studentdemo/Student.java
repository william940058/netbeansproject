/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

/**
 *
 * @author macbookpro
 */
public class Student {
    private String firstName;
    private String lastName;
    private double gpa;
    
    public Student(String firstName, String lastName, double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
    public String toString() {
        return firstName + ", " + lastName + ", " + gpa;
    }
}
