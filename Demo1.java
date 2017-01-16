import java.util.Scanner;


public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean flag=sc.nextBoolean();
		
		switch(flag){
		case "true":
			System.out.println("hello");
			break;
		case "false":
			System.out.println("Hello 2 ");
			break;
		default:
			System.out.println("default");
			break;
		}

	}

}
