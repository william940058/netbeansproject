package studentinfogsonapp;

public final class StudentList {

    private final Student s1, s2, s3;
    private PhoneNumber phonenumber;

    StudentList(String[] students) {
        String[] s1Array = students[0].split(",");
        String[] s1Skills = s1Array[4].split(";");
        String[] s2Array = students[1].split(",");
        String[] s2Skills = s2Array[4].split(";");
        String[] s3Array = students[2].split(",");
        String[] s3Skills = s3Array[4].split(";");
        s1 = new Student(s1Array[0], s1Array[1], s1Array[2], stringToPhoneNumber(s1Array[3]), s1Skills[0]);
        s2 = new Student(s2Array[0], s2Array[1], s2Array[2], stringToPhoneNumber(s2Array[3]), s2Skills[4]);
        s3 = new Student(s3Array[0], s3Array[1], s3Array[2], stringToPhoneNumber(s3Array[3]), s3Skills[2]);

    }

    public PhoneNumber stringToPhoneNumber(String a) {
        int areaCode = Integer.valueOf(a.substring(1, 4));
        int prefix = Integer.valueOf(a.substring(4, 8));
        int lineNumber = Integer.valueOf(a.substring(8, 11));
        setPhonenumber(new PhoneNumber(areaCode, prefix, lineNumber));
        return getPhonenumber();
    }

    public Student getS1() {
        return s1;
    }

    public Student getS3() {
        return s3;
    }

    public Student getS2() {
        return s2;
    }

    public PhoneNumber getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(PhoneNumber phonenumber) {
        this.phonenumber = phonenumber;
    }

}
