/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispalindrome;

/**
 *
 * @author macbookpro
 */
public class IsPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isPalindrome("appa"));
    }
    public static boolean isPalindrome(String text){
        int length = text.length();
        if(length<=1){
            return true;
        }
        else{
            char first = Character.toLowerCase(text.charAt(0));
            char last = Character.toLowerCase(text.charAt(length-1));
            if(Character.isLetter(first)&& Character.isLetter(last)){
                if(first == last){
                    String shorter = text.substring(1, length-1);
                    return isPalindrome(shorter);
                            
                }
                else{
                    return false;
                }
            }
            else if(!Character.isLetter(last)){
                
               String shorter = text.substring(0, length - 1);
               return isPalindrome(shorter);
            }
            else{
                
                String shorter = text.substring(1);
                return isPalindrome(shorter);
            }
        }
    }
}
