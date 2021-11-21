package studentinfogsonapp;

public class Student {

    private final String firstName;
    private final String lastName;
    private final String gpa;
    private final PhoneNumber phonenumber;
    private final String skill;

    public Student(String firstName, String lastName, String gpa, PhoneNumber phonenumber, String skill) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.phonenumber = phonenumber;
        this.skill = skill;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGpa() {
        return gpa;
    }

    public PhoneNumber getPhonenumber() {
        return phonenumber;
    }

    public String getSkill() {
        return skill;
    }

    }

    