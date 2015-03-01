package se.mah.k3.pfi2.lecture7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class SearchAndSortList {
	ArrayList<Walnut> arrayList;
	
	public static void main(String[] args) {
		new SearchAndSortList();  //Skapa instans av mig själv :) för att inte köra i statisk kontext
	}
	
	public SearchAndSortList() {
		arrayList = new ArrayList<Walnut>();
		//Add many walnuts with different amount of life.
		Random rand = new Random();
		for (int i = 0; i<100; i=i+1){
			int life = rand.nextInt(100); //Ger ett slumpvärde mellan 0-99
			Walnut w = new Walnut(life);
			arrayList.add(w);
		}
		
		//Print out them in the order they are
		System.out.println("Not sorted");
		for (Walnut walnut : arrayList) {
			System.out.print(walnut.getLife()+" , ");
		}
		System.out.println("");
		
		//Sort and print
		System.out.println("Sort them and print");
		Collections.sort(arrayList);
		for (Walnut walnut : arrayList) {
			System.out.print(walnut.getLife()+" , ");
		}
		System.out.println("");
		
		//if the collection is sorted it is possible to search it
		System.out.println("Search them");
		int i = Collections.binarySearch(arrayList, new Walnut(10)); //Returns the position for the first match
		System.out.println("Search result: "+ i);
		try {
			System.out.println("Found: "+arrayList.get(i).getLife());
		} catch (Exception e) {
			System.out.println("Not Found");
		}
	}
}
