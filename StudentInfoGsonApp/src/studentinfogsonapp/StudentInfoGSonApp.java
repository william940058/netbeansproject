package studentinfogsonapp;

import com.google.gson.JsonObject;

public class StudentInfoGSonApp {

    public static void main(String[] args) {

        String[] studentInfo = {"John, Doe, 3.1, 800-555-1212, none",
            "Jane, Deere, 3.25, 898-555-1212, sleeping;dreaming;kayaking;swimming;Solidity",
            "Sam, Spade, 2.9, 888-555-1212, coffee-drinking;Java;Python"};

        StudentList students = new StudentList(studentInfo);
        JsonObject Jane = new JsonObject();
        Jane.addProperty("FirstName", students.getS2().getFirstName());
        Jane.addProperty("LastName", students.getS2().getLastName());
        Jane.addProperty("AreaCode", String.valueOf(students.getS2().getPhonenumber().getAreaCode()));
        Jane.addProperty("Skill", students.getS2().getSkill());
        printSomeDetails(Jane);

    }

    private static void printSomeDetails(JsonObject Jane) {
        String line = Jane.get("FirstName").toString() + Jane.get("LastName").toString()
                + "'s area code is " + Jane.get("AreaCode").toString() + ", and the last skill listed for "
                + Jane.get("FirstName").toString() + " is " + Jane.get("Skill").toString() + ".";
        System.out.println(line.replaceAll("\"", ""));
    }

}
