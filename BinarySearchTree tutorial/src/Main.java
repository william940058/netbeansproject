
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       BSTree tree = new BSTree();
       tree.add(43);
       tree.add(17);
       tree.add(61);
       tree.displayInOrder();
       System.out.println("");
       
       boolean t = tree.containsValue(17);
       System.out.println(t + "\n");
      
       tree.delete(17);
       tree.displayInOrder();
      
        
    }
    
}
