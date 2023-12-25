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

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }


}
