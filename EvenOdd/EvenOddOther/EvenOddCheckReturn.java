package com.another;
/**
 * This class contain logic for evenodd check
 * @author Mahesh
 *
 */
public class EvenOddCheckReturn {
	 Boolean flag;
	 /**
	  * This method take input as integer 
	  * and return value is boolean
	  * @param no
	  * @return flag
	  */
	 Boolean check(int no) {
			if(no%2==0){
				flag=true;
			}
			else{
				flag=false;
			}
			return flag;
		}//check() end
	 
}
