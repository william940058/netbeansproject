/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choosertest;

import java.util.ArrayList;

/**
 *
 * @author macbookpro
 */
public class ChooserTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Coin> coin = new ArrayList();
        addCoin(coin);
        Chooser chooser = new Chooser(coin);
        for(int num = 1; num <= 10; num++){
            System.out.println(chooser.choose());
        }
    }
    private static void addCoin(ArrayList<Coin> coin){
        String [] coinName = {"penny", "nickel", "dime", "quarter", "half", "dollar", "dollar"};
        double [] coinValue = {.01, .05, .10, .25, .50, 1.0};
        for(int i = 0; i<6; i++){
            Coin c = new Coin(coinName[i], coinValue[i]);
            coin.add(c);
        }
    }
}
