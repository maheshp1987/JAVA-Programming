
	static Boolean status;
	/**
	 * This is main() method containing args param
	 * @param args
	 */
	public static void main(String[] args) {
	
		String s=args[0];
		int no=Integer.parseInt(s);
		EvenOddCheckReturn object=new EvenOddCheckReturn();
		
		status=object.check(no);
		
		if(status==true){
			System.out.println(no+" is Even");
		}
		else{
			System.out.println(no+" is Odd");
		}
	}

