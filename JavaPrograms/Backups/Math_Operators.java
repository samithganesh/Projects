public class Addition {
	public static void main(String args[]){
		int a = 5;
		int b = 4;
        System.out.println(a + b);
        subtraction();
        multiplication();
        division();
        modulus();
	}

    public static void subtraction(){
        int a = 18;
        int b = 6;
        System.out.println(a - b);
    }
    
    public static void multiplication(){
        int a = 6;
        int b = 3;
        System.out.println(a * b);
    }

    public static void division(){
        int a = 20;
        int b = 5;
        System.out.println(a / b);
    }

    public static void modulus(){
        int a = 20;
        int b = 6;
        System.out.println(a % b);
    }

    // public static void mathOper(int a, int b){
    //     System.out.println(a + b);
    //     System.out.println(a - b);
    //     System.out.println(a * b);
    //     System.out.println(a / b);
    //     System.out.println(a % b);
    // }

//     public static void add(int a, int b){
//         System.out.println(a + b);
//     }

//     public static void subtract(int a, int b){
//         System.out.println(a - b);
//     }

}