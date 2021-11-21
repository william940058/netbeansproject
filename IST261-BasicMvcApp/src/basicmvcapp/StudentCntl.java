package basicmvcapp;

import java.util.ArrayList;

public class StudentCntl {

    private static final int STARTING_INDEX_OF_DISPLAY = 0;
    StudentList studentList;
    StudentUI studentUI;

    public StudentCntl() {
        studentList = new StudentList();
        studentUI = new StudentUI(this, STARTING_INDEX_OF_DISPLAY); // pass 0 so UI starts at first element in list
        studentUI.setVisible(true);
    }
    public Student getStudent(int index) {
        // you'll need to change this to return the Student item at the given index in StudentList
        ArrayList<Student> newList = studentList.getListOfStudents();
        Student list = newList.get(index);
        String[] studentInfo = {list.getFirstName(), list.getLastName(), Double.toString(list.getGpa())};
        return new Student(studentInfo);
    
    }

    public StudentList getStudentList() {
        return studentList;
    }

    public void addNewStudent() {
        String[] list4 = {"XXX", "YYY", "444"};
        studentList.getListOfStudents().add(new Student(list4));
        studentUI.refreshDisplayWithNewValues(4);
    }
}
