/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchdogtree;

/**
 *
 * @partner Muffiser
 */
public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchDogTree BST = new BinarySearchDogTree();
        
        Dog d1 = new Dog("Oscar", 8.3);
        Dog d2 = new Dog("Max", 6.6);
        Dog d3 = new Dog("Tiger", 7.9);
        Dog d4 = new Dog("Coco", 2.1);
        Dog d5 = new Dog("Coco", 4.2);
        
        BST = BST.switchSortCriteria("name");
        
        BST.addDog("Oscar", 8.3);
        BST.addDog("Max", 6.6);
        BST.addDog("Tiger", 7.9);
        BST.addDog("Coco", 2.1);
        BST.addDog("Molly", 4.2);
        BST.displayInOrder();
        System.out.println("");
        BST = BST.switchSortCriteria("weight");
        BST.displayInOrder();
        
    }
    
}
