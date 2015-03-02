package se.mah.k3.pfi2.turing;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class TuringDecoder extends JFrame {
	public File f;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TuringDecoder frame = new TuringDecoder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TuringDecoder() {
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String wholeCoded="";
		String adress ="https://gist.githubusercontent.com/k3larra/a0d5e6ff7622f5a78872/raw/7958992cebf92e76b07f8adac820107894447b6f/Turing";
		//String adress = "https://gist.github.com/k3larra/a0d5e6ff7622f5a78872";
		
		
		try {
			URL gist = new URL(adress);
			Scanner s = new Scanner(gist.openStream());
			while (s.hasNext()){
				String coded = s.nextLine().toUpperCase();
				//System.out.println(coded);
				wholeCoded=wholeCoded+coded;
			}
			s.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
			
		System.out.println("");
		
		System.out.println(wholeCoded);
		
//	//!!!	stolen code !!!
//		   String msg = "";
//		           String[] msgCheck = new String[3];
//		   	        //String encMsg = encryptMsg_txt.getText().toUpperCase();
//		   	        int diff[] = new int[3];
//		   	        int[] alphaIndex = new int[3];
//		  	         
//		 	        for (int i = 0; i < 3; i++)
//		   	            diff[i] = char_txt[i].getText().toUpperCase().charAt(0) - 'A';
//		            
//		         for (int index = 0; index < wholeCoded.length(); index++)
//		        {
//		            if (isAlpha(wholeCoded.charAt(index) ) )
//			            {
//		                alphaIndex[index % 3] = (wholeCoded.charAt(index) + diff[index % 3]++ - 'A') % 26;
//		                 msgCheck[index % 3] += new String(alphabet, alphaIndex[index % 3], 1);
//		                if (diff[index % 3] > 'Z' - 'A')
//		                    diff[index % 3] -= 'Z' - 'A';
//		  	            }
//		  	            else
//		  	            {
//		                for (int i = 0; i < 3; i++)
//		   	                {
//		  	                    msgCheck[i] += wholeCoded.substring(index, 1);
//		                  }
//		              }
//		  	        }
//		  	         
//		  	        if (msgCheck[0].equals(msgCheck[1]) && msgCheck[1].equals(msgCheck[2]) ) {
//		            msg = msgCheck[0];
//					}else{
//		 	            msg = "COULD NOT DECRYPT PROPERLY";
//		  	        }
//		
//			    	System.out.println(msg);
//	
		
			
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
