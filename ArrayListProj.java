import java.util.ArrayList;
public class ArrayListProj {

	public static void main(String[] args) {
		ArrayList fruitList=new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Green bean");
		fruitList.remove("Green bean");
		//fruitList.clear();
		System.out.println(fruitList.contains("Rasberry"));
		System.out.println(fruitList);

	}

}
