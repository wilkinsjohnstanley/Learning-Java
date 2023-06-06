
public class Account {
	//We are going to have two details stored in our program. The Name and The Age of the person.
		String name;
		int age;
		
	public static void main(String[] args) {
		//We then create an instance/object of our class(which is like a blueprint) with the following constructor.
		Account a = new Account();
		//we use the setter method we defined below to set the name. Dots are used in the following way: variable.method()
		a.setName("John");
		System.out.println(a.getName());
		a.setAge(27);
		System.out.println(a.getAge());
		a.printDetails();
	}
//it's public because it's access is not limited. And it's void because it's not returning anything. It's like any other method definition, and we include the input in the parentheses.
		public void setName(String name) {
			this.name=name;
		}
		public void setAge(int age) {
			this.age=age;
		}
//getters are also public, but they do return the input so they are not void. We use the 'this' keyword because we don't know what the input will be until it arrives.
		
		public String getName() {
			return this.name;
		}
		public Integer getAge() {
			return this.age;
		}
		public void printDetails() {
			System.out.println(name+", "+age);
		}
		
}
