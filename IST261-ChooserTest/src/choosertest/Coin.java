/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choosertest;

/**
 *
 * @author macbookpro
 */
public class Coin {
    private String name;
    private double value;

    public Coin(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "I'm a coin; my name is " + name + "; my value is " + value;
    }
           
}
