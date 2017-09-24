package euclidLab;



//multiplies i by j to get a value. if the value is less than 10, it is printed.
//otherwise, i * j is divided by 10 to the power of the log10 of i * j


public class Loops {

	
	public void loops(int col, int row) {
		for(int i = 1; i <=	 row; i++) {
			for(int j = 1; j <= col; j++) {
				if(i * j < 10 ) {
					System.out.print(((i * j)  + " "));
				} else {
					int tmp1 = (int) (Math.log10(i * j));
					int tmp = (int) (Math.pow(10, (tmp1))); 
					System.out.print((i * j) / tmp   + " ");
					
				}
			}
			System.out.println();
		}
	}
}
