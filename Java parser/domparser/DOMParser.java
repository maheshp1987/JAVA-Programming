package com.demo.domparser;

//Import all the packages
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//Write a public parser class
public class DOMParser {
	public static void main(String[] args) {
		try {
			// Access input data file and create document builder
			File inputDataFile = new File("C:\\Zeal\\ParserImplStrategies\\src\\com\\demo\\domparser\\DomParserInput.txt");
			DocumentBuilderFactory dbldrFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbldrFactory.newDocumentBuilder();
			Document docObject = docBuilder.parse(inputDataFile);
			docObject.getDocumentElement().normalize();
			System.out.println("Name of the Root element:"+ docObject.getDocumentElement().getNodeName());

			// Create node list
			NodeList ndList = docObject.getElementsByTagName("employee");
			System.out.println("*****************************");
			
			// Iterate through the node list and extract values
			for (int tempval = 0; tempval < ndList.getLength(); tempval++) {
				Node nd = ndList.item(tempval);
				System.out.println("\n Name of the current element :"+ nd.getNodeName());
				if (nd.getNodeType() == Node.ELEMENT_NODE) {
					Element elementObject = (Element) nd;
					System.out.println("Employee ID : "	+ elementObject.getAttribute("empid"));
					System.out.println("Employee First Name: "+ elementObject.getElementsByTagName("firstname").item(0)
									.getTextContent());
					System.out.println("Employee Last Name: "+ elementObject.getElementsByTagName("lastname").item(0)
									.getTextContent());
					System.out.println("Employee Nick Name: "+ elementObject.getElementsByTagName("nickname").item(0)
									.getTextContent());
					System.out.println("Employee Salary: "+ elementObject.getElementsByTagName("salary").item(0)
									.getTextContent());
				}
			}
		} catch (Exception e) {
			// Catch and print exception - if any
			e.printStackTrace();
		}
	}
}