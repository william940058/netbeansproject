/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javateaching;

import java.util.Scanner;

/**
 *
 * @author macbookpro
 */
public class JavaTeaching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("type ur topic: ");
        Scanner in = new Scanner(System.in);
        String topic = in.next();
        
        if(topic.equalsIgnoreCase("1")){
            System.out.println("IF AND IF...ELSE STATEMENT");
            System.out.println("If statement consists a condition, followed by statement or a set of statements as shown below:");
            System.out.println("if(condition){\n" +"  Statement(s);\n" +"}");
            System.out.println("The statements gets executed only when the given condition is true. If the condition is false then the statements inside if statement body are completely ignored.");
            System.out.println("Example of if statement:");
            System.out.println("public class IfStatementExample {\n" +
"\n" +"   public static void main(String args[]){\n" +"      int num=70;\n" +
"      if( num < 100 ){\n" +
"	  /* This println statement will only execute,\n" +
"	   * if the above condition is true\n" +
"	   */\n" +
"	  System.out.println(\"number is less than 100\");\n" +
"      }\n" +
"   }\n" +
"}");
            System.out.println("This output will be: number is less than 100");
            System.out.println("");
            System.out.println("Next topic would be if else statement in java: ");
            System.out.println("This is how an if-else statement looks: ");
            System.out.println("if(condition) {\n" +
"   Statement(s);\n" +
"}\n" +
"else {\n" +
"   Statement(s);\n" +
"}");
            
            System.out.println("The statements inside “if” would execute if the condition is true, and the statements inside “else” would execute if the condition is false.");
            System.out.println("Example of if-else statement: ");
            System.out.println("public class IfElseExample {\n" +
"\n" +
"   public static void main(String args[]){\n" +
"     int num=120;\n" +
"     if( num < 50 ){\n" +
"	System.out.println(\"num is less than 50\");\n" +
"     }\n" +
"     else {\n" +
"	System.out.println(\"num is greater than or equal 50\");\n" +
"     }\n" +
"   }\n" +
"}");        
            System.out.println("output would be: ");
            System.out.println("num is greater than or equal 50");
            System.out.println("");
            System.out.println("Since we have covered the topic of if and if...else, we will have a pop quiz");
            System.out.println("Evaluate and type the output of the following code:");
            System.out.println("public class IfElseExample {\n" +
"\n" +
"   public static void main(String args[]){\n" +
"     int num=30;\n" +
"     if( num < 50 ){\n" +
"	System.out.println(\"num is less than 50\");\n" +
"     }\n" +
"     else {\n" +
"	System.out.println(\"num is greater than or equal 50\");\n" +
"     }\n" +
"   }\n" +
"}");       
            System.out.println("Type ur answer: ");
            Scanner output = new Scanner(System.in);
            String ans = output.next();
            boolean t = false;
            while(t = false){
            if(ans.equalsIgnoreCase("num is greater than or equal 50")){
                System.out.println("Incorrect");
            }
            else{
                System.out.println("Correct");
               
            }
            }
            
        
        }
    
    
    
    }
}
