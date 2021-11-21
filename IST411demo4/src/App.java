
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;


public class App {

    /**
     * @param args the command line arguments
     */
    private static void displayWeatherData() throws IOException{
        String decodedString = "";
        URL url = new URL("https://www.ncdc.noaa.gov/swdiws/xml/plsr/20121029");
        
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        
        httpConn.setDoOutput(true);
        httpConn.setRequestMethod("POST");
        httpConn.setRequestProperty("Accept-Charset", "UTF-8");
        httpConn.setRequestProperty("Content-type", "application/xwww-form-urlencoded");
        
        OutputStreamWriter out = new OutputStreamWriter(httpConn.getOutputStream());
        BufferedReader in = new BufferedReader(
            new InputStreamReader(httpConn.getInputStream()));
        
        System.out.println(httpConn.getResponseCode());
        System.out.println(httpConn.getResponseMessage());
        
        while((decodedString = in.readLine()) != null){
            System.out.println(decodedString);
        }
      
    }
    public static void main(String[] args) {
        try{
            displayWeatherData();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
