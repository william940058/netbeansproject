//Store date using other way
//Redundant Hello to user
//No need to separate for declaring fname, lname, and date.
//Everthing should be printed out at the end to show the user's the info.
//minor bug fix and delete unnecessary code
//format the code

// Refactored by: Weilun HUNG
package refactoringcode;

import java.time.LocalDate;
import java.util.Scanner;

public class RefactoringCode {

    public static void main(String[] args) {
        //customers are able to see their name and date after entering in
        Scanner userInfo = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fname = userInfo.next();
        System.out.println("Enter your last name:");
        String lname = userInfo.next();

        System.out.println("Enter todays date //format yyyy-mm-dd:");
        LocalDate ld = LocalDate.parse(userInfo.next());
        String date = ld.toString();

        System.out.println("");
        System.out.println("Hello " + fname + " " + lname);
        System.out.println("Today's date is " + date);

    }

}
