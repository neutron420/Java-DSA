public class JavaBasics54 {

    public static void Butterfly_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in between
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in between
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Butterfly_pattern(4);
    }
}
