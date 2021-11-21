/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istrunningclub;

/**
 *
 * @author macbookpro
 */ 
//Partner: Muffiser Warraich
public class Istrunningclub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RunningClub rc = new RunningClub();
        Runner a = new Runner(100, "Joe", "Smith", "male", 18);
        Runner b = new Runner(101, "Peter", "Doe", "female", 25);
        rc.addRunner(100, "Joe", "Smith", "male", 18);
        rc.addRunner(101, "Peter", "Doe", "female", 25);
        Race r1 = new Race(1000, "Sydney", 20190510);
        Race r2 = new Race(1010, "Egypt", 20190520);
        Race r3 = new Race(1005, "Paris", 20190530);
        rc.addRace(1000, "Sydney", 20190510);
        rc.addRace(1010, "Egypt", 20190520);
        rc.addRace(1005, "Paris", 20190530);
        rc.recordCompletedRace(a, r1, "10hrs", "1st");
        rc.recordCompletedRace(a, r2, "9hrs", "3rd");
        rc.recordCompletedRace(b, r2, "8hrs", "2nd");
        rc.recordCompletedRace(b, r3, "7hrs", "1st");
        rc.recordCompletedRace(b, r1, "5hrs", "1st");
        rc.showAll();
    }
}
