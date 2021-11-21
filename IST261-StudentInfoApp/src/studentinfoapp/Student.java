package studentinfoapp;

/**
 *
 * @author
 */
public class Student {

    private String firstName;
    private String lastName;
    private Double gPA;
    private PhoneNumber phoneNumber;
    private String skills;

    public Student(String firstName, String lastName, Double gPA, String phoneNumber, String skills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gPA = gPA;
        this.phoneNumber = new PhoneNumber(phoneNumber);
        this.skills = skills.replace(";", ",");
    }

    @Override
    public String toString() {
        return "studentinfoapp.Student[" + "firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gPA + ", phoneNumber=" + phoneNumber + ", skills=" + skills + ']';
    }

}
