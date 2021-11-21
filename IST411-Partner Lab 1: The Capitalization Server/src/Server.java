
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {
    public static void main(String[] args) {
        System.out.println("Server: Starting...");
        
        try{
            ServerSocket server = new ServerSocket(6000);
            System.out.println("Server: waiting for connection...");
            Socket clientSocket = server.accept();
            
            BufferedReader br = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
            String inputLine;    
            while ((inputLine = br.readLine()) != null) { 
                inputLine = inputLine.toUpperCase();
                System.out.println("Server: " + inputLine);        
                out.println(inputLine);    
            }  
        }
        catch(IOException e){
            System.out.println("Server: Error occurred");
            e.printStackTrace();
        }
         
    }
    
}
