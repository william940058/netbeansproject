
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macbookpro
 */
public class Cat {

    private String name;
    private String alphabet;
    private int age;

    public Cat(String name, String alphabet, int age) {
        this.name = name;
        this.alphabet = alphabet;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name=" + name + ", alphabet=" + alphabet + ", age=" + age;
    }

    //hashcode and equal is made using insert code
    //hashset is the fastest and can delete duplicate
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.alphabet);
        hash = 67 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cat other = (Cat) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.alphabet, other.alphabet)) {
            return false;
        }
        return true;
    }
}
