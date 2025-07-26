public class ArrayFunctions {
    public static void main(String args[]) {
        int a[] = {5, 8, 13, 12};
        
        // printArray(a);
        
        // sumArray(a);

        // sumOddEvenArray(a);

        // factorialArray(a);

        int result[] = getFactorialArray(a);
    }

    // find factorial of each of the elements in the array and print
    public static void factorialArray(int[] a) {
        for(int i=0;i<a.length;i++){
            int num = a[i];
            int factorial = 1;
            while(num > 1) {
                factorial = factorial * num;
                num = num - 1;
            }
            System.out.println("The factorial of " + a[i] + " is " + factorial);
        }    
    }

    public static int[] getFactorialArray(int[] a) {
        
        for(int i=0;i<a.length;i++){
            int num = a[i];
            int factorial = 1;
            while(num > 1) {
                factorial = factorial * num;
                num = num - 1;
            }
            System.out.println("The factorial of " + a[i] + " is " + factorial);
        }
        return factorial;    
    }

    public static void printArray(int[] a) {
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]); 

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void sumArray(int[] a) {
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
         System.out.println(sum);
    }

    public static void sumOddEvenArray(int[] a) {
        int sumodd = 0;
        int sumeven = 0;
        for(int i=0;i<a.length;i++){ 
            if (a[i] % 2 == 0) {
                sumeven = sumeven + a[i];
            } else {
                sumodd = sumodd + a[i];
            }

        
        }
        System.out.println(sumodd);
        System.out.println(sumeven);
    }

}

