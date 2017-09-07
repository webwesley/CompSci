package someStuff;

public class FactorialsAgain {

	public static void main(String[] args0){
		factDo(5);
		factWhile(5);
		System.out.println(factorial(5));
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
	
	
	
}
