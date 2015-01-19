package se.mah.k3;	//Package är hela adressen till klassen så man inte bara säger "Kungsgatan 37" utan även anger i vilken stad 

import java.util.ArrayList;
import java.util.Iterator;

public class StartClass {
	/*Detta är den enklaste möjliga körbara klass, datorn letar efter en metod som heter main som den nedan 
	 * för att veta var den skall starta programmet
	 * en sådan metod måste alltid finnas i en desktopapplikation. 
	 * Det är bara så det är eftersom någon har beslutat det*/
	public static void main(String[] args) {
		System.out.println("Startar här"); //Denna kodrad gör en utskrift i Console dvs i en ruta nedan
		
		//Till tenta....Svar uppgift 3
		String[] sA = new String[8];
		for (int i = 0; i < 8; i = i+1){
			sA[i] = "Tom";
		}
		//Kolla om det blev rätt
		for (int i = 0; i < 8; i = i+1){
			System.out.println(sA[i]);
		}
		//Detta är bättre varför???
		for (int i = 0; i < sA.length; i++) {
			sA[i] = "Empty";
			
		}
		//Eller så här vad är detta ?????
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
		System.out.println("Värdet på i i version A är: "+i);
		//Version B
		i=40;
		while (i<40){
			i = i + 11;
		}
		System.out.println("Värdet på i i version B är: "+i);
		//Version C
		i=5;
		while (i<40){
			i = i + 10;
		}
		System.out.println("Värdet på i i version C är: "+i);
		
		//Slutar här
	}
}
