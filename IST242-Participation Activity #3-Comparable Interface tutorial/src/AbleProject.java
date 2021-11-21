
import java.util.ArrayList;
import java.util.Collections;


public class AbleProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Package>packages = new ArrayList();
        
        packages.add(new Package("Package A", 5.3));
        packages.add(new Package("Package B", 6.4));
        packages.add(new Package("Package C", 2.1));
        packages.add(new Package("Package D", 9.4));
        packages.add(new Package("Package E", 2.0));
        
        Collections.sort(packages);
        
        for(Package p : packages) {
            System.out.println(p);
        }
    }
    }
    

