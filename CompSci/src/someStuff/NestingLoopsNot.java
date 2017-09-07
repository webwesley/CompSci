package someStuff;

public class NestingLoopsNot {
	public static void main(String[] args0){
		int n = 1000000;
		String dash = "";
		String asterix = "* ";
		for(int i = 0; i < n; i++){
			dash += "_ ";
			
		}
		for(int i = 1; i <=n; i++){
			System.out.println(dash);
			System.out.print(asterix);
			asterix += "* ";
			dash = dash.substring(2);
			
		}
	}
}
