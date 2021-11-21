/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wedding1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author macbookpro
 */
public class Wedding1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String bride = "";
        String groom = "";
        int totalAttend = 0;
        double area = 0;
        ArrayList<String> names = new ArrayList<>();
        double perArea = 0;
        
        bride = getBNames(bride);
        groom = getGNames(groom);
        totalAttend = getTotalAttend(totalAttend);
        area = getArea(area);
        names = getNames(names);
        perArea = getPerArea(perArea,totalAttend,area);
        
        writeFile(bride, groom, totalAttend, area, names, perArea);
        readFile("wedding.txt");
    }
    public static String getBNames(String bride) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the bride:");
        bride = in.next();
        return bride;
    }
    public static String getGNames(String groom) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the groom:");
        groom = in.next();
        return groom;
    }
    public static int getTotalAttend(int totalAttend) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of attendees in the wedding:");
        totalAttend = in.nextInt();
        return totalAttend;
    }
    public static double getArea(double area) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the square footage of the location:");
        area = in.nextDouble();
        return area;
    }
    public static ArrayList<String> getNames(ArrayList<String>names) {
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the names of everyone in the wedding party(type done when finished):");
        while(true) {
            String friends = in.next();
            if(friends.equals("done")) {
                break;
            }
            names.add(friends);
        }
        return names;
    }
    public static double getPerArea(double perArea, int totalAttend, double area) {
        perArea = (double)totalAttend/area;
        System.out.println("The number of attendees per square foot of the location is " + perArea);
        return perArea;
    }
    public static void writeFile(String bride, String groom, int totalAttend, double area, ArrayList<String>names, double perArea) {
        String fileName = "wedding.txt";
        PrintWriter out = null;
        try{
            out = new PrintWriter(fileName);
            out.println("The bride name is: " + bride);
            out.println("The groom name is: " + groom);
            out.println("The total number of attendees in the wedding is: " +totalAttend);
            out.printf("The square footage of the location is: %.1f\n", area);
            out.println("The names of everyone in the wedding party are:" + names);
            out.println("The number of attendees per square foot of the location is:" + perArea);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if(out != null) {
                out.close();
            }
        }
    }
    public static void readFile(String fileName) {
        File fileToRead = new File(fileName);
        String nextLine = "";
        ArrayList<String> myArrayList = new ArrayList<>();
        try{
            Scanner in = new Scanner(fileToRead);
            while(in.hasNextLine()) {
                nextLine = in.nextLine();
                myArrayList.add(nextLine);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myArrayList);
    }
    
    
}
