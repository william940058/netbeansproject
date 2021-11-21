/*WEILUN HUNG id:982557284
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wow;

import java.util.Scanner;

/**
 *
 * @author macbookpro
 */
public class Wow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean start = true;
        while (start == true) {
            double thickness = getNumber();
            if (thickness <= 2) {
                System.out.println("Enter again!!");
            }
            if (thickness > 2) {
                System.out.println("Use 4WD");
            }
            if (thickness > 4) {
                System.out.println("and drive slowly." + "\n");
            }
            if (thickness == 0) {
                break;
            }
        }
    }

    private static double getNumber() {
        System.out.print("Enter the inch of snow(enter 0 to quit):");
        Scanner in = new Scanner(System.in);
        double inch = in.nextDouble();
        return inch;
    }

}
