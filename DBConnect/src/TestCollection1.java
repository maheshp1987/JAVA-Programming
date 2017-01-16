import java.util.ArrayList;
import java.util.Iterator;

class TestCollection1 {
	public static void main(String args[]) {

		ArrayList<String> al = new ArrayList<String>();// creating arraylist
		al.add("Ravi");// adding object in arraylist
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		Iterator itr = al.iterator();// getting Iterator from arraylist to
										// traverse elements
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
