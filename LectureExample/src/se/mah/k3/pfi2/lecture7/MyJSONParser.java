package se.mah.k3.pfi2.lecture7;

import java.net.URL;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class MyJSONParser {
	//http://wiki.fasterxml.com/JacksonInFiveMinutes
	//https://github.com/FasterXML/jackson-core/wiki
	public static void main(String[] args) {
		MyJSONParser jp = new MyJSONParser();  //Skapa instans av mig själv :) för att inte köra i statisk kontext
		jp.parse();	
	}

public void parse(){	
    try {
    	 
        JsonFactory jfactory = new JsonFactory();
        /*** READ JSON DATA FROM URL ***/
        URL url = new URL("https://gist.githubusercontent.com/k3larra/05345220f078e694d9f4/raw/e9979fe298ecd4c424fed9e55e455bfc86181059/data.json");
        JsonParser jParser = jfactory.createParser(url);
        // LOOP UNTIL WE READ END OF JSON DATA, INDICATED BY }
        while (jParser.nextToken() != JsonToken.END_OBJECT) {
            String fieldname = jParser.getCurrentName();  //This gets the name of the token 
            if ("name".equals(fieldname)) {
                // once we get the token name we are interested,
                // move next to get its value
                jParser.nextToken();
                // read the value of name
                System.out.println(jParser.getText());
            }
            if ("location".equals(fieldname)) {
                jParser.nextToken();
                System.out.println(jParser.getText());
            }
            if ("books".equals(fieldname)) {
                // current token is "[" beginning of array. So we move next
                jParser.nextToken();
                // iterate through the array until token equal to "]"
                while (jParser.nextToken() != JsonToken.END_ARRAY) {
                    fieldname = jParser.getCurrentName();
                  if ("id".equals(fieldname)) {
                      jParser.nextToken();
                      System.out.println(jParser.getText());
                  }
                  if ("language".equals(fieldname)) {
                      jParser.nextToken();
                      System.out.println(jParser.getText());
                  }
                  if ("author".equals(fieldname)) {
                      jParser.nextToken();
                      System.out.println(jParser.getText());
                  }
                }
            }
        }
        jParser.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 

	}

}
