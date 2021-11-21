import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            String url = "google.com";
        try {  
            
            Socket socket = new Socket(url, 80);
            PrintStream out = new PrintStream(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            out.println("GET / HTTP1.1");
            out.println();
            
            String lineIn = "";
            boolean done = false;
            
            while(!done){
                lineIn = in.readLine();
                
                if(lineIn == null){
                    done = true;
                }
                else{
                    System.out.println(lineIn);
                }
            }
            in.close();
            out.close();
            socket.close();
            
        } catch(Exception e) {
            
            System.out.println("Oops.");
            e.printStackTrace();
        }
        
        
    }
    
}
