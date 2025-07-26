public class Addition {
	public static void main(String args[]){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        // int c = add(x, y);
        // System.out.println(c);
        System.out.println(add(x, y));
	}

    public static int add(int a, int b){
       return (a + b);
    }

}