import java.util.*;

public class TryCatchExamples {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What's your favorite number?");
		try {
			int n = scan.nextInt();
			System.out.println("What a coincidence, "+ n + " is my favorite number too!");
		}	catch(Exception e) {
			System.out.println("Sorry, please enter a number.");
		}

	}

}
