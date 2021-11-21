
import java.io.IOException;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbookpro
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String urlString = "http://www.psu.edu";
            URL url = new URL(urlString);
            System.out.println(url.getProtocol());
            System.out.println(url.getFile());
            System.out.println(url.getPath());
            System.out.println(url.getHost());
            System.out.println(url.getDefaultPort());
        }catch(IOException e){
            e.printStackTrace();  
        }
    }
    
}
