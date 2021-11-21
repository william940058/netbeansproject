/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istrunningclub;

/**
 *
 * @author macbookpro
 */
public class Runner{
    private int runnerID;
    private String firstName; 
    private String lastName;
    private String gender;
    private int age;

    public Runner(int runnerID, String firstName, String lastName, String gender, int age){
    this.runnerID = runnerID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.age = age;
    
    }
    @Override
    public String toString(){
    return "RunnerID: " + runnerID + ", FirstName: " + firstName + ", LastName: " + lastName 
            + ", Gender: " + gender + ", Age: " + age;
    }

    public int getRunnerID() {
        return runnerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    
    public void setRunnerID(int runnerID) {
        this.runnerID = runnerID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
