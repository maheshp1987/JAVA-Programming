
public class TypeCastingExample {

	public static void main(String[] args) {
		String str="37";
		//string into int
		int no=Integer.parseInt(str);
		
		System.out.println("The no is ="+ no);
		
		float val=99.9f;
		//float into int
		int no1=(int)val;
		System.out.println("The no1 is ="+no1);
		
		float no2=no1;
		System.out.println("The no1 is ="+no2);
		

	}

}
