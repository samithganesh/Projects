public class FactorialFor {
	public static void main(String args[]){
		factorial(6);
	}

	public static void factorial(int n) {
		int result = 1;
		for(int i=2; i<=n; i++) {
			result = result * i;
		}
		System.out.println(result);
	}
}