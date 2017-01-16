
public class AreaFinder {

	public AreaFinder() {
		System.out.println("Welcome");
	}
	void area(int side){
		int area = side * side;
		System.out.println("Area of square="+area);
	}
	
	void area(float rad){
		float area = 3.14f * rad *rad;
		System.out.println("Area of Circle="+area);
	}
	
	void area(int l,int w){
		int area = l * w;
		System.out.println("Area of rect="+area);
	}
	
	void area(int l,int w,int h){
		int area = l * w * h;
		System.out.println("Area of cube="+area);
	}
	public static void main(String[] args) {
		AreaFinder a=new AreaFinder();
		a.area(4);
		a.area(3.2f);
		a.area(3,4);
		a.area(3,4,5);

		System.out.println("Thank you");
	}

}
