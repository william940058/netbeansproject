
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.io.IOException;

import java.util.Scanner;


public class app {

    /**
     * @param args the command line arguments
     */
    private static void displayDates(String method, String request) throws IOException {

        
        String decodedString = "";
        URL url = new URL("http://127.0.0.1:3001" + request);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setRequestMethod(method);
        httpConn.setRequestProperty("Accept-Charset", "UTF-8");
        httpConn.setRequestProperty("Content-type", "application/xwww-form-urlencoded");
        httpConn.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(httpConn.getInputStream()));

        while ((decodedString = in.readLine()) != null) {
            System.out.println(decodedString);
        }
    }

    public static void main(String[] args) {
            while(true){
                System.out.println("Please enter ur option(1,2,3,4): ");
                System.out.println("1. Log the current date");
                System.out.println("2. View the entire contents of the server log");
                System.out.println("3. Other HTTP request");
                System.out.println("4. Quit");
                Scanner scan = new Scanner(System.in);
                String s = scan.next();
                if (s.equalsIgnoreCase("4")) {
                    break;
                }
                else if (s.equalsIgnoreCase("1")) {
                    try {
                        displayDates("POST", "/logdate");
                        break;

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if (s.equalsIgnoreCase("2")){
                    try {
                        displayDates("GET","/dates");
                        break;

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if (s.equalsIgnoreCase("3")){
                    try {
                        displayDates("PUT","/wonder");
                        break;

                    } catch (IOException e) {
                        System.out.println("Resource not available");
                        break;
                    }
                }
                else{
                    System.out.println("PLEASE ENTER AGAIN!!!");
                }
                
            }
        
    }

}
