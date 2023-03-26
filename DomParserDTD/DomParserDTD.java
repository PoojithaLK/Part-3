package java_dom_parser;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DomParserDTD {
public static void main(String[] args){
	try {
	     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	     DocumentBuilder builder = factory.newDocumentBuilder();

	    
	     Document document = builder.parse("product.xml");

	     
	     Element root = document.getDocumentElement();

	     
	     String productId = root.getAttribute("ProductID");
	     System.out.println("Product ID: " + productId);

	     
	     NodeList nameList = root.getElementsByTagName("ProductName");
	     Element name = (Element) nameList.item(0);
	     System.out.println("Product Name: " + name.getTextContent());

	  } catch (Exception e) {
	     e.printStackTrace();
	  }
}
}