package basicmvcapp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentUI extends JFrame {

    private int indexOfItemToDisplay;

    private final JTextField firstNameDisplayValue = new JTextField(15);
    private final JTextField lastNameDisplayValue = new JTextField(15);
    private final JTextField gpaDisplayValue = new JTextField(15);

    private JPanel instrumentPanel;
    private JPanel buttonPanel;

    private final StudentCntl studentCntl;

    public StudentUI(StudentCntl studentCntl, int startingIndexOfDisplay) {
        this.studentCntl = studentCntl;
        indexOfItemToDisplay = startingIndexOfDisplay;
        initComponents();
        setFieldView();
    }

    private void initComponents() {
        setTitle("Student Viewer");
        setSize(400, 300);
        setLocationRelativeTo(null);  // center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        instrumentPanel = new JPanel(new GridLayout(5, 1));
        instrumentPanel.add(new JLabel("First Name"));
        instrumentPanel.add(firstNameDisplayValue);
        instrumentPanel.add(new JLabel("Last Name"));
        instrumentPanel.add(lastNameDisplayValue);
        instrumentPanel.add(new JLabel("GPA"));
        instrumentPanel.add(gpaDisplayValue);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton nextButton = new JButton("Next");
        JButton newButton = new JButton("New");

        nextButton.addActionListener(event -> showNextStudent());
        newButton.addActionListener(event -> studentCntl.addNewStudent());

        buttonPanel.add(nextButton);
        buttonPanel.add(newButton);

        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(instrumentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void showNextStudent() {
        int listSize = studentCntl.getStudentList().getListOfStudents().size();
        if(indexOfItemToDisplay == listSize -1) {
            this.indexOfItemToDisplay = 0;
            studentCntl.getStudentList().getListOfStudents().get(indexOfItemToDisplay);
            setFieldView();
        }
        else{
            studentCntl.getStudentList().getListOfStudents().get(indexOfItemToDisplay++);
            setFieldView();
        }
    }

    private void setFieldView() {
        firstNameDisplayValue.setText(studentCntl.getStudent(indexOfItemToDisplay).getFirstName());
        lastNameDisplayValue.setText(studentCntl.getStudent(indexOfItemToDisplay).getLastName());
        gpaDisplayValue.setText(Double.toString(studentCntl.getStudent(indexOfItemToDisplay).getGpa()));
    }

    void refreshDisplayWithNewValues(int index) {
        int listSize = studentCntl.getStudentList().getListOfStudents().size();
        if(indexOfItemToDisplay == listSize -1) {
            this.indexOfItemToDisplay = 0;
            studentCntl.getStudentList().getListOfStudents().get(indexOfItemToDisplay);
            setFieldView();
        }
        else{
            studentCntl.getStudentList().getListOfStudents().get(indexOfItemToDisplay++);
            setFieldView();
        }
    }
}
