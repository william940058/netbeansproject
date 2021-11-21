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
public class BinarySearchDogTree {
    class Node
    {
        private Dog data;
        private Node leftChild;
        private Node rightChild;
        
        Node(Dog data)
        {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }
    private Node root;

    
    public BinarySearchDogTree(){
        root = null;
    }
    
    public boolean addDog(String name, double weight){
        if(containsDog(name)){
            return false;
        }else{
            root = addRecursive(root, name, weight);
            return true;
        }
    }
    
    private Node addRecursive(Node current, String name, double weight)
    {
        if(current == null)
        {
            Dog data = new Dog(name, weight);
            return new Node(data);
        }
        else if (name.compareTo(current.data.getName())<0)
        {   
            current.leftChild = addRecursive(current.leftChild, name, weight);
            return current;
        }
        else if (name.compareTo(current.data.getName())>0)
        {
            current.rightChild = addRecursive(current.rightChild, name, weight);
            return current;
        }
        else{
            return current;
        }
        
    }
    public boolean containsDog(String name){
        return containsRecursive(root, name);
    }
    
    private boolean containsRecursive(Node current, String name){
        if(current == null)
        {
            return false;
        }
        else if(name.equals(current.data.getName())){
            return true;
        }
        else if (name.compareTo(current.data.getName())<0)
        {
            return containsRecursive(current.leftChild, name);
        }
        else 
        {
            return containsRecursive(current.rightChild, name);
        }
    } 
    public void displayInOrder(){
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Node node)
    {
        if (node != null){
            inOrderTraversal(node.leftChild);
            System.out.println(" " + node.data);
            inOrderTraversal(node.rightChild);
        }
    }
    private Dog getSmallest(Node root)
    {
        if (root.leftChild == null){
            return root.data;
        }else{
            return getSmallest(root.leftChild);
        }
    }
    public boolean removeDog(String name){
        if(containsDog(name)){
            root = removeRecursive(root, name);
            return true;
        }else{
            return false;
        }
    }
    private Node removeRecursive(Node current, String name){
        if (current == null)
            return null;
        else if (name.equals(current.data.getName())){  //found node to delete
            //CASE 1: Node has Children
            if (current.leftChild == null && current.rightChild == null){
                return null;
            }
            //CASE 2: Node has 1 childelse 
            if (current.rightChild == null){
                return current.leftChild;
            }else if (current.leftChild == null){
                return current.rightChild;
            }//CASE 3: Node has 2 children  (...the tricky case...)
            else{
                //Step 1) find smallest value S in right subtree of Node
                Dog smallestVal = getSmallest(current.rightChild);
                //Step 2) Replace Node's value with S's value
                current.data = smallestVal;
                //Step 3) Delete S from right subtree
                current.rightChild = removeRecursive(current.rightChild, smallestVal.getName());
                return current;
            }
        }
        else if (name.compareTo(current.data.getName())<0){
            current.leftChild = removeRecursive(current.leftChild, name);
            return current;
        }else{
            current.rightChild = removeRecursive(current.rightChild, name);
            return current;
        }
    
    }
    public double getDogWeight(String name){
        return getWeightRecursive(root,name);
    }
    
    private double getWeightRecursive(Node current, String name){
        if(current == null){
            return -1;
        }
        else if(name.equals(current.data.getName())){
            return current.data.getWeight();
        }
        else if(name.compareTo(current.data.getName())<0)
            {
            return getWeightRecursive(current.leftChild, name);
        }
        else 
        {
            return getWeightRecursive(current.rightChild, name);
        }
    }
    
    private void addWeight(String name, double weight){
        root = addWeightRecursive(root, name, weight);
    }
    private Node addWeightRecursive(Node current, String name, double weight){
        if(current == null)
        {
            Dog data = new Dog(name, weight);
            return new Node(data);
        }
        else if (weight < current.data.getWeight())
        {   
            current.leftChild = addWeightRecursive(current.leftChild, name, weight);
            return current;
        }
        else if (weight > current.data.getWeight())
        {
            current.rightChild = addWeightRecursive(current.rightChild, name, weight);
            return current;
        }
        else{
            return current;
        }
    }
    public BinarySearchDogTree switchSortCriteria(String criteria){
        if (criteria.equalsIgnoreCase("name")){
            BinarySearchDogTree BST = new BinarySearchDogTree();
            switchSortName(BST, root);
            return BST;
        }else if(criteria.equalsIgnoreCase("weight")){
            BinarySearchDogTree BST = new BinarySearchDogTree();
            switchSortWeight(BST, root);
            return BST;
        }else{
            return null;
        }
    }
    private BinarySearchDogTree switchSortName(BinarySearchDogTree BST, Node current){
        if(current != null){
            switchSortName(BST, current.leftChild);
            BST.addDog(current.data.getName(), current.data.getWeight());
            switchSortName(BST, current.rightChild);
        }
        return BST;
    }
    private BinarySearchDogTree switchSortWeight(BinarySearchDogTree BST, Node current){
        if(current != null){
            switchSortWeight(BST,current.leftChild);
            BST.addWeight(current.data.getName(), current.data.getWeight());
            switchSortWeight(BST, current.rightChild);
        }
        return BST;
    }
}



