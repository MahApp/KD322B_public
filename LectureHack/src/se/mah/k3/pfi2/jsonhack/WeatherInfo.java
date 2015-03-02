package se.mah.k3.pfi2.jsonhack;

import java.net.URL;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class WeatherInfo {
	//Detta är en class som läser JSON-filen
	//test
	
	//läs json-filen
	//presentera den genom consol prints
	//gör variable String som skapar URL
	//gör gui med väljbar lista
	
	public static void main (String[] args){
		WeatherInfo wI = new WeatherInfo();
		wI.parse();
	}
	
	public void parse(){
		try {
			JsonFactory jF = new JsonFactory();
			URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=Malmo,se");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
