
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.io.IOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class App {

    /**
     * @param args the command line arguments
     */
    private static void displayJokeCategories() throws IOException {

        String str4 = "";
        String decodedString = "";
        URL url = new URL("https://api.chucknorris.io/jokes/categories");
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setRequestMethod("GET");
        httpConn.setRequestProperty("Accept-Charset", "UTF-8");
        httpConn.setRequestProperty("Content-type", "application/xwww-form-urlencoded");
        httpConn.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(httpConn.getInputStream()));

        while ((decodedString = in.readLine()) != null) {
            if (decodedString.contains("political")) {
                String str1 = decodedString.replace("\"political\",", "");
                String str2 = str1.replace("\"explicit\",", "");
                String str3 = str2.replace("\"religion\",", "");
                str4 = str3.substring(1, str3.length() - 1);
                System.out.println(str4);
            }
        }
    }

    public static String displayJokes(String url2) throws IOException {

        String jokeValue1 = "";
        String decodedString1 = "";
        URL url3 = new URL(url2);
        HttpURLConnection httpConn1 = (HttpURLConnection) url3.openConnection();
        httpConn1.setRequestMethod("GET");
        httpConn1.setRequestProperty("Accept-Charset", "UTF-8");
        httpConn1.setRequestProperty("Content-type", "application/xwww-form-urlencoded");
        httpConn1.setRequestProperty("User-Agent", "Mozilla/5.0");
        try {
            BufferedReader in1 = new BufferedReader(
                    new InputStreamReader(httpConn1.getInputStream()));

            while ((decodedString1 = in1.readLine()) != null) {
                JsonParser parser = new JsonParser();
                JsonObject jokeObj1 = parser.parse(decodedString1).getAsJsonObject();
                jokeValue1 = jokeObj1.get("value").getAsString();

            }
        } catch (FileNotFoundException e) {
            jokeValue1 = "error";
        }

        return jokeValue1;

    }

    public static void main(String[] args) {
        while (true) {
            try {
                ArrayList<String> list1 = new ArrayList<>();
                displayJokeCategories();
                System.out.print("Enter a jokes' category(type quit to exit): ");
                Scanner scan = new Scanner(System.in);
                String s = scan.next();
                if (s.equalsIgnoreCase("quit")) {
                    break;
                }
                String url2 = "https://api.chucknorris.io/jokes/random?category=";
                url2 = url2 + s;
                if (displayJokes(url2).equalsIgnoreCase("error")) {
                    System.out.println("Categories not found!!");
                    System.out.println("");
                } else {
                    for (int i = 0; i < 3; i++) {
                        list1.add(displayJokes(url2));
                    }
                    LinkedHashSet<String> hashSet = new LinkedHashSet<>(list1);
                    ArrayList<String> listWithoutDuplicates = new ArrayList<>(hashSet);
                    int j = 1;
                    for (String sen : listWithoutDuplicates) {
                        System.out.println(j + ". " + sen);
                        j = j + 1;
                    }
                    System.out.println("");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
