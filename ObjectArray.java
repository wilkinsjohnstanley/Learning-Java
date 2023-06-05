class Monkey{
	String type="Spider monkey";
	public static void sayOohAhhAhh() {
		System.out.println("Ooh Ahh Ahh!");
	}
}


public class ObjectArray {

	public static void main(String[] args) {
		
		//make three new monkey objects that inherit the method and attributes of the class
		Monkey m1=new Monkey();
		Monkey m2=new Monkey();
		Monkey m3=new Monkey();
		//each monkey will say Ooh Ahh Ahh!
		Monkey[] monkeys= {m1, m2, m3};
		for(Monkey m: monkeys) {
			m.sayOohAhhAhh();
		}
		
	}

}
