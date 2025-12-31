public class Javabasics55 {
    public static void Solid_Rhombus_Pattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) { 
            // for spaces n-i
            for (int j = 1; j <= n - i; j++) { 
                System.out.print(" ");
            }
            // for stars 
            for (int j = 1; j <= n; j++) { 
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Solid_Rhombus_Pattern(5);
    }
}
