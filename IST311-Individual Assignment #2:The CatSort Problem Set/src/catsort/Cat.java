/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catsort;

/**
 *
 * @author macbookpro
 */
public class Cat {
    private String name;
    private double weight;
    private int age;

    public Cat(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", weight=" + weight + ", age=" + age + '}';
    }
    
}
