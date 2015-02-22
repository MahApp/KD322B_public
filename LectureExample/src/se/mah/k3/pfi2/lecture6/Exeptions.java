package se.mah.k3.pfi2.lecture6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exeptions {

	public static void main(String[] args) {
		//Not enforced
		try
		{
		    Integer.parseInt("one");      // Statement that can cause an exception.
		}
		catch (NumberFormatException e)   // Specify which exception to catch.
		{
		   e.printStackTrace();
		}
		//enforced
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Multiple try catch
		File f = new File("KAlle");
		try {
			FileInputStream fs = new FileInputStream(f);
			byte[] b = null;
			fs.read(b);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
