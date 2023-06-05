
public class NestedForLoops {

	public static void main(String[] args) {
		String[][] fancyColors = {{"Red","Blue","Green"},
	                              {"Cyan", "Magenta", "Turquoise"}
};
			for (int row=0;row<2;row++) {
				for(int column=0;column<3;column++) {
						System.out.println(fancyColors[row][column]);
}
}		
			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					System.out.println("i: "+i+", j: "+ j);
				}
			}
			
			
			
	}

}
