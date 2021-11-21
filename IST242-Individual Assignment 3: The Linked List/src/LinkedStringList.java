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
           System.out.println("Node data: " + data);
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
    public void add(String value) {
        if(currentNode == null) {
            addFirst(value);
            currentNode = first;
        }
        else{
            Node newNode = new Node();
            newNode.data = value;
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            currentNode = newNode;
        }
        
    }
    public String removeFirst() {
        if(first == null) {
            throw new NoSuchElementException();
        }
        else{
            String value = first.data;
            first = first.next;
            return value;
        }
    }
    public void remove() {
        Node currentNode = null;
        for(currentNode = first; currentNode.next.next != null ; currentNode = currentNode.next){
            
        }
        currentNode.next = null;
    }
    
    public int indexOf(String value) {
        Node currentNode = first;
        int index = 0;
        while(currentNode.data != value) {
            currentNode = currentNode.next;
            index++;
            if(currentNode == null){
                System.out.println("The index: -1");
                return -1;
            }
        }
        System.out.println("The index: " + index);
        return index;
    }
    
    public void sortAscending(){
        for (Node a = first; a!= null; a = a.next){
            Node min = a;
            for(Node b = a; b != null; b = b.next){
                if(min.data.compareToIgnoreCase(b.data) > 0) {
                    min = b;
                }
            }
        Node now = new Node();
        now.data = a.data;
        a.data = min.data;
        min.data = now.data; 
        }
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
    public int getLength(){
        return length;
    }
    public String getFirstValue() {
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

    

