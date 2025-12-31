public class Javabasics57 {

    public static void Diamond_Pattern(int n){
        // for upper diagram pattern
        // for outer loop
        for (int i = 1; i <= n; i++) {
            //for spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //for stars 2*(i-1)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for lower diagram pattern
        for (int i = n - 2; i >= 1; i--) {
            // for lower spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for starts in lower half
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Diamond_Pattern(4);
    }
}
