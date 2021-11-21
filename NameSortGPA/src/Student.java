
public class Student implements Gradable, Comparable<Student> {
    private String name;
    private double GPA;
    private double quiz1;
    private double quiz2;
    private int absences;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }
    
    @Override
    public int compareTo(Student students) {
        int compare = this.name.compareTo(students.name);
        return compare;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "GPA: " + GPA;
    }
    
    @Override
    public int getAbsences(){
        return absences;
    }
    
    @Override
    public double calculateGrade() {
        int numGrades = 20;
        numGrades = numGrades - NUM_GRADES_TO_DROP;
        
        double grade = (quiz1+ quiz2) /2;
        return grade;
             
    }
}
