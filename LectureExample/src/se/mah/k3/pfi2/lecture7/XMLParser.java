package se.mah.k3.pfi2.lecture7;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
	 
	public class XMLParser { 
	  public static void main(String argv[]) {
	 
	    try {
	 
		String url = "https://gist.githubusercontent.com/k3larra/ea39c0375448e4b1d651/raw/9be844de6eb5cbb54c4ba86f136811ffc3b34305/staff.xml";
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
	  }
	 
}
