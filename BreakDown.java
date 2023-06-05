
public class BreakDown {

	public static void main(String[] args) {
		// The break statement only allows it to print Hi! once. If removed, it will print 3 times.
		int i=0;
		while(i<3) {
			System.out.println("Hi!");
			i++;
			break;
		}
		
//This only prints out 10 and 20 because it breaks if it equals 30
		int[]numbers= {10,20,30,40,50};
		for(int j=0;j<numbers.length;j++) {
			if(numbers[j]==30) {
				break;
			}
			System.out.println(numbers[j]);
		}
//k is 1 which corresponds to case 1, so it prints One!
		int k=1;
		switch(k) {
		case 0:
			System.out.println("Zero!");
			break;
		case 1:
			System.out.println("One!");
			break;
		default:
			System.out.println("Anything else");
			break;
		}
	}

}
