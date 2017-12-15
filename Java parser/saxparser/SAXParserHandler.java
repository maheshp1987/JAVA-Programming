package com.demo.saxparser;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserHandler extends DefaultHandler {
     // List to hold Employees object
     private List<Employee> empList = new ArrayList<>();
     private Employee emp = null;

     boolean bAge = false;
     boolean bFirstName = false;
     boolean bLastName = false;
     boolean bRole = false;

     // getter method for employee list
     public List<Employee> getEmpList() {
        return empList;
     }

     /**
      * This method is called whenever start tag of an element is encountered
      */
      @Override
      public void startElement(String uri, String localName, String qName, Attributes attributes) 
                  throws SAXException {
          if (qName.equalsIgnoreCase("Employee")) {
                String id = attributes.getValue("id");
                // initialize Employee object and set id attribute
                emp = new Employee();
                emp.setId(Integer.parseInt(id));
          } else if (qName.equalsIgnoreCase("firstname")) {
                     // set boolean values for fields, will be used in setting Employee variables
                     bFirstName = true;
          } else if (qName.equalsIgnoreCase("lastname")) {
                     // set boolean values for fields, will be used in setting Employee variables
                     bLastName = true;
          } else if (qName.equalsIgnoreCase("age")) {
                     bAge = true;
          } else if (qName.equalsIgnoreCase("role")) {
                    bRole = true;
          }
       }

        /**
         * This method is called whenever ends tag of an element is encountered
         */
         @Override
         public void endElement(String uri, String localName, String qName) throws SAXException {
             if (qName.equalsIgnoreCase("Employee")) {
                 // add the created Employee object to list
                 empList.add(emp);
             }
         }

        /**
         * This method is called whenever character data is encountered
         */
        @Override
        public void characters(char ch[], int start, int length) throws SAXException {
            if (bAge) {
                // age element, set Employee age
                emp.setAge(Integer.parseInt(new String(ch, start, length)));
                bAge = false;
            } else if (bFirstName) {
                // set employee first name
                emp.setFirstname(new String(ch, start, length));
                bFirstName = false;
            } else if (bLastName) {
              // set employee last name
              emp.setLastname(new String(ch, start, length));
              bLastName = false;
            } else if (bRole) {
              emp.setRole(new String(ch, start, length));
              bRole = false;
            }
       }
}
