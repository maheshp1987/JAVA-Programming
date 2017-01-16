import java.util.Scanner;
public class AppleSell {
	public static void main(String[] args) {
		String days[]={"sun","mon","tue","wed","Thur","Fri","Sat"};
		int sell[]=new int[7];
		int total=0;
    	Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++){
			System.out.println("Enter sell on "+days[i]);
			sell[i]=sc.nextInt();
		}
	
		for(int i=0;i<7;i++){
			total=total+sell[i];
		}
		System.out.println("Total Number of sell in Week="+total);
		
		float avg=total/7;
		System.out.println("The Average Number of sell of Apple"+avg);

		sc.close();
	}
	
}
