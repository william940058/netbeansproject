/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catsort;

import java.util.NoSuchElementException;

/**
 *
 * @author macbookpro
 */
public class LinkedCatList {
    private Node first;
    private Node currentNode; 
    private int length;

    class Node
    {
        private Cat data;
        private Node next;

        public void printNodeData()
        {   
            System.out.println("Node data: " + data);
        }
        public Node getNext()
        {
            return next;
        }
    } 
    public LinkedCatList()
    {
        first = null;
        currentNode = null;
        length = 0;
    }
    public void setFirst(Cat value)
    {
        first.data = value;
    }
    public void setCurrent(Cat value)
    {
        currentNode.data = value;
    }
    public void addFirst(Cat value)
    {

    //create the Node and set its value
        Node newNode = new Node();
        newNode.data = value;

    // if newNode is the first node, this will be null
    // otherwise it will point to the former "first" now
        newNode.next = first; 

    //set our "first" Node to the Node we just created
        first = newNode;

        currentNode = newNode;

        length++;

    }

    public void removeFirst()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            first = first.next;
            length--;
        }
    }

    public void remove()
    {
        if (currentNode == first)
        {
            removeFirst();
        }
        else
        {
            Node tempCurrent = currentNode;
            moveFirst();
            boolean found = false;
            while (!found)
            {
                if(currentNode.next == tempCurrent)
                {
                    found = true;
                }
                else
                {
                    moveNext();
                }
            }

            currentNode.next = tempCurrent.next;
        }
}



    public int indexOf(Cat value)
    {
        Node tempNode = first;
        int position = 0;

        while (tempNode != null)
        {
            if (tempNode.data == value)
            {
                return position;
            }
            else
            {
                tempNode = tempNode.next;
                position++;
            }
        }

        return -1;

    }


//adds after currentNode
    public void add(Cat value)
    {
        if (first == null)
        {
            addFirst(value);
        }
        else
        {

//create node having "next" pointing to tempSwap
            Node newNode = new Node();
            newNode.data = value;
            newNode.next = currentNode.next; 

//make the old current node point to our newNode
            currentNode.next = newNode;

//move current refer to node we just added
            moveNext();

//increment length of list
            length++;
        }

}
    public boolean isEmpty()
    {
        return (first == null);
    }

    public int getLength()
    {
        return length;
    }

    public Cat getFirstValue()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return first.data;
        }
}

    public Cat getCurrentValue()
    {
        if (currentNode == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return currentNode.data;
        }
    }
    public void moveNext()
    {
        currentNode = currentNode.next;
    }
    public void moveFirst()
    {
        currentNode = first;
    }
    public void displayList()
    {
        Node currentNode = first;
        System.out.println("List contents:");
        while (currentNode != null)
        {
            currentNode.printNodeData();
            currentNode = currentNode.getNext();
        }
    }
    public Node getFirst()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return first;
        }
    }
    public Node getLast(){
        while(currentNode!=null && currentNode.next != null){
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    public static void swap(Node first, Node last){
        Cat temp = last.data;
        last.data = first.data;
        first.data = temp;
        
    }
    public Node partition(Node first, Node last){
        Node pivot = first;
        Node pn = first.next;
 
        while(pn != last){
            if(pn.data.getName().compareTo(pivot.data.getName()) < 0){
                pivot = pivot.next;
                swap(pn,pivot);
            }
            pn = pn.next;
        }
        if(pivot != first){
            swap(first,pivot);
        }
        return pivot;
    }
    public void quickSort(Node first, Node last){
        if(first != last){
            Node pivot = partition(first, last);
            quickSort(first, pivot);
            quickSort(pivot.next, last);
            
        }
    }

}
