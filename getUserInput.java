import java.util.Scanner;

public class getUserInput {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("Glad to have you here, " + name);
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		System.out.println("Oh wow, you look too young to be " + age);
	}
	

}
