/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchdogtree;

/**
 *
 * @author macbookpro
 */
public class Dog {
    private String Name;
    private double weight;

    public Dog(String Name, double weight) {
        this.Name = Name;
        this.weight = weight;
    }
    
    public String getName() {
        return Name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Dog{" + "Name=" + Name + ", weight=" + weight + '}';
    }
    
}
