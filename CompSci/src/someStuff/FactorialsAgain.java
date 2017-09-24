package someStuff;

public class FactorialsAgain {

	public static void main(String[] args0){
		System.out.println(combinations(2, 1));
	}
	
	
private static void factDo(int n){
	int fact = 1;
	if(n == 0) {
		System.out.println(fact);
		return;
	}
	do {
		fact *= n;
		n--;
		
	} while (n>1);
	System.out.println(fact);

}

private static void factWhile(int n){
	int fact = 1;
	if(n == 0) {
		System.out.println(fact);
		return;
	}
	while(n > 1){
		fact *= n;
		n--;
	}
	System.out.println(fact);
}

private static int factorial(int n){
	if(n == 0) {
		return 1;
	}
	return(n * factorial(n-1));
}

private static int combinations(int n, int r) {
	return (factorial(n) / (factorial(r) * factorial(n - r)));
}
	
	
	
}
