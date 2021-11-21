package studentinfoapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author
 */
public class StudentList {

    private final ArrayList<Student> studentList = new ArrayList<>();

    public void addStudentsToList(String fileName) {
        try {
            Scanner scnr = new Scanner(new File(fileName));
            while (scnr.hasNext()) {
                String[] line = scnr.nextLine().replaceAll(" ", "").split(",");

                //studentInfo.add();
                Student newStudent = new Student(line[0], line[1], Double.parseDouble(line[2]), line[3], line[4]);
                studentList.add(newStudent);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        String output = "";
        for (Student student : studentList) {
            output += student.toString() + "\n";
        }
        return output;
    }
}
