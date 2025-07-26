public class PrimeNumberFor {
    public static void main(String args[]){
         int a = Integer.parseInt(args[0]);
        prime1(a);
        prime2(a);
    }

    public static void prime1(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
                return;
            } 
        }
        System.out.println("Prime");
    }



    public static void prime2(int n) {
        prime = True
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                prime = False
                break;
            }
        }
        if (prime == True) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}

