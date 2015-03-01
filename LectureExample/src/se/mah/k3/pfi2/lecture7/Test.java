package se.mah.k3.pfi2.lecture7;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		String saying = "There's a difference between knowing the path and walking the path...";
		saying = saying.toLowerCase();
		for (int i = 0; i < saying.length(); i++) {
			System.out.println("Kvadraten på :"+i+":"+ i*i+ " Bokstav: "+saying.charAt(i));
			
		}
		File f2;
		Random r = new Random();
		try {
			f2 = new File("c:/Users/K3lara/Downloads/Turing.txt");
			System.out.println("PATH: "+ f2.getAbsolutePath());
			if (!f2.exists()){
				f2.createNewFile();
			}
			PrintWriter pw = new PrintWriter(f2);
			int j = 0;
			for (int i = 0; i < 10000; i++) {
				char symbol = (char)(r.nextInt(26) + 'a'); 
				if (i%80==0&&i!=0){
					pw.println();
					System.out.println(""); 
				}
				if (i==j*j&&j<saying.length()){
					pw.print(saying.charAt(j));
					System.out.print(saying.charAt(j));
					j++;
				}else{
					pw.print(symbol);
					System.out.print(symbol);
				}
			}
			pw.close(); //Stänger filen
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
