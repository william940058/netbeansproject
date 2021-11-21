/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.netbeansmavenjsonptest;

import java.io.StringReader;
import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParser;

/**
 *
 * @author macbookpro
 */
public class JsonpTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JsonObject json = Json.createObjectBuilder()
                .add("name", "Falco")
                .add("age", BigDecimal.valueOf(3))
                .add("biteable", Boolean.FALSE).build();
        String result = json.toString();

        System.out.println(result);

// Read back
        JsonReader jsonReader = Json.createReader(new StringReader("{\"name\":\"Falco\",\"age\":3,\"bitable\":false}"));
        JsonObject jobj = jsonReader.readObject();
        System.out.println(jobj);

        try (JsonParser parser = Json.createParser(new StringReader(result))) {
            String key = null;
            String value = null;
            while (parser.hasNext()) {
                final JsonParser.Event event = parser.next();
                switch (event) {
                    case KEY_NAME:
                        key = parser.getString();
                        System.out.println(key);
                        break;
                    case VALUE_STRING:
                        String string = parser.getString();
                        System.out.println(string);
                        break;
                    case VALUE_NUMBER:
                        BigDecimal number = parser.getBigDecimal();
                        System.out.println(number);
                        break;
                    case VALUE_TRUE:
                        System.out.println(true);
                        break;
                    case VALUE_FALSE:
                        System.out.println(false);
                        break;
                }
            }
        }
    }

}
