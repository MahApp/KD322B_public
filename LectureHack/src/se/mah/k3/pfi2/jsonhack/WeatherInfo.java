package se.mah.k3.pfi2.jsonhack;

import java.net.URL;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class WeatherInfo {
	//Detta � en class som l�ser JSON-filen
	//test
	
	//ls json-filen
	//presentera den genom consol prints
	//g�r variable String som skapar URL
	//g�r gui med valbar lista
	
	public static void main (String[] args){
		WeatherInfo wI = new WeatherInfo();
		wI.parse();
	}
	
	public void parse(){
		try {
			JsonFactory jF = new JsonFactory();
			URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=Malmo,se");
			JsonParser jP = jF.createParser(url);
			while (jP.nextToken() != JsonToken.END_OBJECT) {
				String fieldname = jP.getCurrentName();
				if("coord".equals(fieldname)){
					jP.nextToken();
					System.out.println(jP.getText());
				}
			}
			jP.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
