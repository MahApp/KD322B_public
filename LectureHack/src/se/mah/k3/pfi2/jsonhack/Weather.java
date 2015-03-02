package se.mah.k3.pfi2.jsonhack;

public class Weather {
	
	private String name;		//Ortsnamn
	private float temp;			//Temperatur i kelvin
	private String main;		//Väder
	private String descrption;	//Väder detaljerat
	private String icon;		//Namn på ikonfil, använd för att bygga path. ex: 10d.
	
	public Weather(String name, float temp, String main, String descrption, String icon) {

		this.name = name;
		this.temp = temp;
		this.main = main;
		this.descrption = descrption;
		this.icon = icon;
		
	}

	public String getName() {
		return name;
	}

	public float getTemp() {
		return temp + (float) 273.15;
	}

	public String getMain() {
		return main;
	}

	public String getDescrption() {
		return descrption;
	}

	public String getIcon() {
		return icon;
	}
	
		
	
}