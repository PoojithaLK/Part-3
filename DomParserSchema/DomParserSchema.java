package java_dom_parser;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DomParserSchema {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		     File inputFile = new File("person_details.xml");
		     DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		     DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		     Document doc = dBuilder.parse(inputFile);
		     doc.getDocumentElement().normalize();
		     System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		     NodeList nodeList = doc.getElementsByTagName("person_details");
		     for (int temp = 0; temp < nodeList.getLength(); temp++) {
		        Element element = (Element) nodeList.item(temp);
		        System.out.println("First Name : " + element.getElementsByTagName("first_name").item(0).getTextContent());
		        System.out.println("Last Name : " + element.getElementsByTagName("last_name").item(0).getTextContent());
		        System.out.println("Weight Scale : " + element.getElementsByTagName("weight").item(0).getAttributes().getNamedItem("scale").getTextContent());
		        System.out.println("Weight : " + element.getElementsByTagName("weight").item(0).getTextContent());
		        System.out.println("Shoe Device : " + element.getElementsByTagName("shoe_size").item(0).getAttributes().getNamedItem("device").getTextContent());
		        System.out.println("Shoe Size : " + element.getElementsByTagName("shoe_size").item(0).getTextContent());
		     }
		  } catch (Exception e) {
		     e.printStackTrace();
		  }
	}

}
