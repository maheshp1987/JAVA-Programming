package com.demo.saxparser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
public class SAXXMLParser {
    public static void main(String[] args) {
         SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
         try {
              SAXParser saxParser = saxParserFactory.newSAXParser();
              SAXParserHandler handler = new SAXParserHandler();
              saxParser.parse(new File("C:\\Zeal\\ParserImplStrategies\\src\\com\\demo\\saxparser\\saxparser.txt"), handler);
              // Get Employees list
              List<Employee> empList = handler.getEmpList();
              // print employee information
              for (Employee emp : empList)
                  System.out.println(emp);
          } catch (SAXException | ParserConfigurationException | IOException e) {
                  e.printStackTrace();
          }
     }
}