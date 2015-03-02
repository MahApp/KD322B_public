package se.mah.k3.pfi2.jsonhack;

public class Weather {
	
	private String name;		//Ortsnamn
	private float temp;			//Temperatur i kelvin
	private String main;		//V�der
	private String descrption;	//V�der detaljerat
	private String icon;		//Namn p� ikonfil, anv�nd f�r att bygga path. ex: 10d.
	
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