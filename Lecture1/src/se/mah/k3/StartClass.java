package se.mah.k3;	//Package �r hela adressen till klassen s� man inte bara s�ger "Kungsgatan 37" utan �ven anger i vilken stad 

import java.util.ArrayList;
import java.util.Iterator;

public class StartClass {
	/*Detta �r den enklaste m�jliga k�rbara klass, datorn letar efter en metod som heter main som den nedan 
	 * f�r att veta var den skall starta programmet
	 * en s�dan metod m�ste alltid finnas i en desktopapplikation. 
	 * Det �r bara s� det �r eftersom n�gon har beslutat det*/
	public static void main(String[] args) {
		System.out.println("Startar h�r"); //Denna kodrad g�r en utskrift i Console dvs i en ruta nedan
		
		//Till tenta....Svar uppgift 3
		String[] sA = new String[8];
		for (int i = 0; i < 8; i = i+1){
			sA[i] = "Tom";
		}
		//Kolla om det blev r�tt
		for (int i = 0; i < 8; i = i+1){
			System.out.println(sA[i]);
		}
		//Detta �r b�ttre varf�r???
		for (int i = 0; i < sA.length; i++) {
			sA[i] = "Empty";
			
		}
		//Eller s� h�r vad �r detta ?????
		for (String string : sA) {
			System.out.println(string);
		}
		
		
		ArrayList<User> aL = new ArrayList<User>();
		aL.add(new User("Tommy1"));
		aL.add(new User("Tommy2"));
		aL.add(new User("Tommy3"));
		aL.add(new User("Tommy4"));
		aL.add(new User("Tommy5"));
		for (User user : aL) {
			System.out.println(user.getName());
		}
		for (User u : aL) {
			u.setName("treo");
		}
		for (User user : aL) {
			System.out.println(user.getName());
		}
		
		//Uppgift 4:
		//Version A
		int i = 10;
		while (i<30){
			i = i + 11;
		}
		System.out.println("V�rdet p� i i version A �r: "+i);
		//Version B
		i=40;
		while (i<40){
			i = i + 11;
		}
		System.out.println("V�rdet p� i i version B �r: "+i);
		//Version C
		i=5;
		while (i<40){
			i = i + 10;
		}
		System.out.println("V�rdet p� i i version C �r: "+i);
		
		//Slutar h�r
	}
}
