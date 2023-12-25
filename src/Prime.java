public class Prime {
    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i=2; i<n; i++) {
            if (n % i == 0) {
                prime = false;
            }
        } 

        return prime;
    }

    public static int factorial(int b) {
        if (b != 0) {
            if (b == 1) {
            return 1;
        }
            return b*factorial(b-1);

        }
        else {
            return 1;
        }
        
         
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
        System.out.println(factorial(6));
    }


}
