
import java.util.NoSuchElementException;


public class LinkedStringList {
    private Node first;
    private Node currentNode;
    private int length;
    
    class Node
    {
       private String data;
       private Node next;
       
       public void printNodeData() {
           System.out.println("Node data" + data);
       }
       public Node getNext() {
           return next;
       }
       
    }

    public LinkedStringList() {
        first = null;
        currentNode = null;
        length = 0;
    }
    
    public void addFirst(String value)
    {
        Node newNode = new Node();
        newNode.data = value;
        
        newNode.next = first;
        
        first = newNode;
        
        currentNode = newNode;
        
        length++;
        
    }   
    
    public void setFirstValue(String value) {
        first.data = value;
    }
    
    public void setCurrentValue(String value) {
        currentNode.data = value;
        
    }
    public void moveNext() {
        if(currentNode.next == null) {
            throw new NoSuchElementException();
            
        }
        else {
            currentNode = currentNode.next;
        }
    }  
    public void moveFirst() {
        currentNode = first;
    }
    public boolean isEmpty() {
        return(first == null);
    }
    public String getLength() {
        if(first == null) {
            throw new NoSuchElementException();
        }
        else {
            return first.data;
        }
    }
    public String getCurrentValue() {
        if(currentNode == null) {
            throw new NoSuchElementException();
        }
        else {
            return currentNode.data;
        }
    }
    public void displayList() {
        currentNode = first;
        System.out.println("List contents:");
        
        while(currentNode != null) {
            currentNode.printNodeData();
            currentNode = currentNode.getNext();
        }
    }
            
}
