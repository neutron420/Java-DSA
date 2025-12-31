import java.util.*;

public class JavaArray16 { 
    public static boolean searchelements(int matrix[][], int key) { 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) { 
                    System.out.println("Found at cell (" + i + ", " + j + ")"); 
                    return true;
                }
            }
        }
        return false; 
    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3]; 

        int n = matrix.length;
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();

        sc.close();
        if (!searchelements(matrix, key)) {
            System.out.println("Element not found.");
        }
        System.out.println("The entered matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
