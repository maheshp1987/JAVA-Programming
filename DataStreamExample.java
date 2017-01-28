package com.basics;

import java.io.FileInputStream;  
public class DataStreamExample {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("C:\\Users\\gs-0851\\Desktop\\om.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  