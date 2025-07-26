public class IfExample {
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		if(a > 10) {
			System.out.println("HIGH");
		} else {
			System.out.println("LOW");
		}
	}

	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		if(a == 1) {
			System.out.println("LOWEST");
		} else if(a == 2){
			System.out.println("LOW");
		} else if(a == 3) {
			System.out.println("MEDIUM");
		} else if(a == 4) {
			System.out.println("HIGH");
		} else {
			System.out.println("HIGHEST");
		}
	}
}

