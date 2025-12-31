import java.util.*;

public class JavaArray2 {
    // Modify the method to accept the nonChangable array as well
    public static void update(int marks[], int[] nonChangable) {
        // You cannot assign a number to an array like this
        // If you want to modify the first element of the array:
        nonChangable[0] = 10;

        // Update the marks array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {98, 99, 97};
        int nonChangable[] = {5}; // Initialize it as an array
        update(marks, nonChangable);

        // Print nonChangable array
        System.out.println(nonChangable[0]); // Print the first element of the array

        // Loop to print marks array
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        
        // Print a new line
        System.out.println();
    }
}
