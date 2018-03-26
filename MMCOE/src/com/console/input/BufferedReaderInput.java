package com.console.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderInput 
{
    public static void main(String[] args) throws IOException 
    {
        //Create object of BufferReader
        BufferedReader reader = 
    new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your text = ");
        // Reading data using readLine
        String name = reader.readLine();
 
        // Printing the read line
        System.out.println(name);        
    }
}