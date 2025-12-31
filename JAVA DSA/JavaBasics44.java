public class JavaBasics44 {
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public static int binomialCoefficient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r); 
        int binomialCoefficient = fact_n / (fact_r * fact_nmr);
        return binomialCoefficient;
    }

    public static void main(String[] args) {
        System.out.print(binomialCoefficient(5, 2)); 
    }
}