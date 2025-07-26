public class IfExample {
	public static void main(String args[]){
		int a[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
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

// n	5
// result	1	2	6	24	120
// i		2	3	4	5	6


// int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}
// for(int i = 0; i < list.length; i++) {
	//    System.out.println(list[i]);
	// }	


