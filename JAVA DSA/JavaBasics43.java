public class JavaBasics43 {
    public static void factorial() {
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }

    public static void main(String[] args) {
        factorial();
    }
}