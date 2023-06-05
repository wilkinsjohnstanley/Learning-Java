
public class ReturnTheSlab {
	public static void main(String[] args) {
		
		int sum=add(5,8);
		System.out.println(sum);
		String yelling = caps("why are you yelling?!");
		System.out.println(yelling);
		
		
	}
         
	
	public static void printAMessage() {
		System.out.println("This is our first method!");
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static String caps(String s) {
		return s.toUpperCase();
	}
	
	
	
	
}

