package basicmvcapp;

import java.util.ArrayList;

public class StudentList {

    private final ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<>();
        addStudentsToList();
    }

    private void addStudentsToList() {
        getListOfStudents().add(new Student(new String[] {"John", "Doe", "3.1"}));
        getListOfStudents().add(new Student(new String[] {"Jane", "Deere", "3.25"}));
        getListOfStudents().add(new Student(new String[] {"Sam", "Spade", "2.9"}));
    }

    /**
     * @return the studentList
     */
    public ArrayList<Student> getListOfStudents() {
        return studentList;
    }

}
