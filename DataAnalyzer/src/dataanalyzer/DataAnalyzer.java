/*WEILUN HUNG id:982557284
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author macbookpro
 */
public class DataAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1.find the file 2. prompt the user for the correct file 3. input the file 4. make some exception
        String myFile = "census-state-populations.csv";
        boolean fileExists = false;
        File newFile;
        while(!fileExists) {
            System.out.println("Enter the name of the file. hint:census-state-populations.csv: ");
            Scanner scan = new Scanner(System.in);
            myFile = scan.nextLine();
            newFile = new File(myFile);
            fileExists = newFile.exists();
            if (!fileExists) {
                System.out.println(myFile + " not found...");
            }
        }
        try {
            File fileToRead = new File(myFile);
            Scanner in = new Scanner(fileToRead);
            readFile(in);
            
        } catch (FileNotFoundException fne) {
            System.out.println(fne.getMessage());
        }
    }
    
    public static void readFile(Scanner inputFile) {
        //1.declare variables for state and population 2.if there's nextline print it out 3. find highest, lowest, and average pop 4.print
        String nextLine;
        String state;
        int highpop = 0;
        String statehighpop = "";
        int lowpop = 0;
        String statelowpop = "";
        int population;
        double cumulative = 0;
        int numstate = 0;
        while (inputFile.hasNextLine()) {
            nextLine = inputFile.nextLine();
            System.out.println(nextLine);
            String[] data = nextLine.split(",");
            state = data[0];
            population = Integer.parseInt(data[1]);
            if(numstate == 0) {
                statelowpop = state;
                lowpop = population;
            }
            if(population > highpop) {
                highpop = population;
                statehighpop = state;
            }
            if(population < lowpop) {
                lowpop = population;
                statelowpop = state;
            }
            cumulative += population;
            numstate++;
        }
        System.out.printf("Avg population: %.2f\n", (double)cumulative/numstate);
        System.out.printf("%s has the highest population: %d\n", statehighpop, highpop);
        System.out.printf("%s has the lowest population: %d\n", statelowpop, lowpop);
    }
    
}
