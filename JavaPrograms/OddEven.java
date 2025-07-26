public class OddEven {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        if(a % 2 == 0) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd!");
        }
    }

}