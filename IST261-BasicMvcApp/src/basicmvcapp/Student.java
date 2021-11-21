package basicmvcapp;

public class Student {
    
    private final String firstName;
    private final String lastName;
    private final double gpa;

    public Student(String[] studentInfo) {
        // studentInfo has firstName, lastName, gpa
        firstName = studentInfo[0];
        lastName = studentInfo[1];
        gpa = Double.parseDouble(studentInfo[2]);
    }
    
    // just getters below

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }
    
}
