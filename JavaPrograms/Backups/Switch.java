public class Switch	{
     public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		switch(a) {
			case 1:
				System.out.println("LOWEST");
				break;
			case 2:
				System.out.println("LOW");
				break;
			default:
				System.out.println("HIGHEST");
				break;
		}
    }
}
