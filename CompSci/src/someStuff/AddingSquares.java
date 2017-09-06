package someStuff;


public class AddingSquares {
	
	public static void main(String[] args0){
		int n = 100;
		long sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += (i * i);
		}
		System.out.println(sum);
	}

}
