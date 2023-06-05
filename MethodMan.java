
public class MethodMan {
	
	public static void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public static void divide(int a, int b) {
		System.out.println(a/b);
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	//Call the methods in the main method, but define them in a class
	public static void main(String[] args) {
		
		multiply(10,10);
		divide(10,10);
		add(10,10);
		sub(10,10);

	}

}
