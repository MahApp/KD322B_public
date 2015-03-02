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
		
		String adress ="https://gist.githubusercontent.com/k3larra/a0d5e6ff7622f5a78872/raw/7958992cebf92e76b07f8adac820107894447b6f/Turing";
		//String adress = "https://gist.github.com/k3larra/a0d5e6ff7622f5a78872";
		
		
		try {
			URL gist = new URL(adress);
			Scanner s = new Scanner(gist.openStream());
			while (s.hasNext()){
				String coded = s.nextLine();
				System.out.println(coded);
			}
			s.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
			
			
		
		
		
		
		
		
		
		/*
		

	    try {
	 
		String url = adress;
		//Prepare
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		//Read and parse the file and place the result in doc
		Document doc = dBuilder.parse(url);
		doc.getDocumentElement().normalize(); //Fixa till lite med xml.....
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("staff");
		System.out.println("----------------------------");
		for (int temp = 0; temp < nList.getLength(); temp++) {  //Iterate throuh all nodes
			Node nNode = nList.item(temp);
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				System.out.println("Staff id : " + eElement.getAttribute("id")); //This is the name in the nodes...
				System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
				System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
			}
		}
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	  

		*/
		
			
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
