package euclidLab;

// multiplies i by j to get a value. if the value is less than 10, it is printed. If the product
// is greater than 10 it is divided by 10 to get a value
public class Loops {

	
	public void loops() {
		for(int i = 1; i <=	 10; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i * j < 10) {
					System.out.print(((i * j)  + " "));
				} else {
					System.out.print((i * j) / 10 + " ");
				}
			}
			System.out.println();
		}
	}
}
