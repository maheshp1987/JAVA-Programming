package com.logging;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

public class log4jExample{

   /* Get actual class name to be printed on */
   static Logger log = Logger.getLogger(log4jExample.class.getName());
   
   public static void main(String[] args)throws IOException,SQLException{
        log.info("Hello this is an info message");
   }
}