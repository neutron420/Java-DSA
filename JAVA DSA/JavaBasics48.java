public class JavaBasics48 {
    public static void primeInRange(int n) {
        if (n < 2) {
            System.out.println("No prime numbers in this range.");
            return;
        }
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; 
                    break; 
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 20; 
        primeInRange(n);
    }
}