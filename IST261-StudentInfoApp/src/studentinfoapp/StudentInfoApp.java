package studentinfoapp;

import java.io.FileNotFoundException;

/**
 *
 * @author
 */
public class StudentInfoApp {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "StudentInfo.txt";
        StudentList studentList = new StudentList();
        studentList.addStudentsToList(fileName);

        System.out.println(studentList);
    }

}
