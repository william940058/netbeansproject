
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbookpro
 */
public class BSTree {
    class Node
    {
        private int data;
        private Node leftChild;
        private Node rightChild;
        
        Node(int data)
        {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }
    private Node root;
    
    public BSTree(){
        root = null;
    }
    
    public void add(int data){
        root = addRecursive(root, data);
    }
    
    private Node addRecursive(Node current, int data)
    {
        if(current == null)
        {
            return new Node(data);
        }
        else if (data < current.data)
        {
            current.leftChild = addRecursive(current.leftChild, data);
            return current;
        }
        else if (data > current.data)
        {
            current.rightChild = addRecursive(current.rightChild, data);
            return current;
        }
        else{
            return current;
        }
    }
    public boolean containsValue(int data){
        return containsRecursive(root, data);
    }
    
    private boolean containsRecursive(Node current, int data){
        if(current == null)
        {
            return false;
        }
        else if(data == current.data){
            return true;
        }
        else if (data < current.data)
        {
            return containsRecursive(current.leftChild, data);
        }
        else 
        {
            return containsRecursive(current.rightChild, data);
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
    private int getSmallest(Node root)
    {
        if (root.leftChild == null){
            return root.data;
        }else{
            return getSmallest(root.leftChild);
        }
    }
    public void delete(int data){
        deleteRecursive(root, data);
    }
    private Node deleteRecursive(Node current, int data){
        if (current == null)
            return null;
        else if (data == current.data){  //found node to delete
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
                int smallestVal = getSmallest(current.rightChild);
                //Step 2) Replace Node's value with S's value
                current.data = smallestVal;
                //Step 3) Delete S from right subtree
                current.rightChild = deleteRecursive(current.rightChild, smallestVal);
                return current;
            }
        }
        else if (data < current.data){
            current.leftChild = deleteRecursive(current.leftChild, data);
            return current;
        }else{
            current.rightChild = deleteRecursive(current.rightChild, data);
            return current;
        }
    
    }
}

