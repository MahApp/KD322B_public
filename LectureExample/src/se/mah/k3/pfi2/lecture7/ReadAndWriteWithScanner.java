package se.mah.k3.pfi2.lecture7;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class ReadAndWriteWithScanner {
	public static void main(String[] args) {
		ReadAndWriteWithScanner st = new ReadAndWriteWithScanner();  //Skapa instans av mig själv :) för att inte köra i statisk kontext
		st.readAndWriteExample();	
	}

	
	public void readAndWriteExample(){	
		//Read from a file in same package
		System.out.println("********************Read from a file in same package********************");
		URL url = this.getClass().getResource("test2.txt"); //Letar upp om det finns något som heter test.text bland mina filer
		File f;
		try {
			f = new File(url.toURI());
			if (f.exists()){
				System.out.println(url.toURI()+"THE file: "+ f.getName()+ "and has the path: "+ f.getAbsolutePath() );
				Scanner s = new Scanner(f);
				while (s.hasNext()){ // Read as long as there is anything to read;
					String string = s.nextLine();
					System.out.println(string);
				}
				s.close();
			}
		} catch (Exception e1) {
			System.out.println("No file found");
		}
		
		
		//Read from the net
		System.out.println("********************Read from the net********************");
		try {
				URL mah = new URL("http://www.mah.se");
				Scanner s = new Scanner(mah.openStream());
				while (s.hasNext()){
					String string = s.nextLine();
					System.out.println(string);
				}
				s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Write to a local file
	    System.out.println("********************Write to a local file********************");
		URL url2 = this.getClass().getResource("test2.txt");
		System.out.println(url2.getPath());
		
		File f2;
			try {
				f2 = new File("src/se/mah/k3/pfi2/lecture7/Test3.txt");
				System.out.println("PATH: "+ f2.getAbsolutePath());
				if (!f2.exists()){
					f2.createNewFile();
				}
				PrintWriter pw = new PrintWriter(f2);
				pw.println("Skriver till filen");
				pw.println("Skriver till filen igen");
				pw.close(); //Stänger filen
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
}

