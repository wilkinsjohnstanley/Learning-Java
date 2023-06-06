import java.util.*;
public class FinallyWeGetToLearnFinally {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your favorite ice cream flavor?");
		try {
			//get user input
			String n = scan.nextLine();
			System.out.println("What a coincidence, I was about to say "+ n + " too!");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//finally always gets run
		finally {
			scan.close();
		}
	}

}
