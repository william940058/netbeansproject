


public class LinkedListProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedStringList list = new LinkedStringList();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.moveFirst();
        list.setCurrentValue("Red");
        list.moveNext();
        list.setCurrentValue("Green");
        list.moveNext();
        list.setCurrentValue("Blue");
        list.indexOf("Green");
        list.displayList();
        list.sortAscending();
        list.displayList();
        list.remove();
        list.remove();
        list.displayList();
    }
    
}
