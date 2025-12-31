// finding out the largest no amomg the given array

import java.util.*;

public class JavaArray5 {
    
    public static class ArrayCC {
        // Method to find the largest number in an array
        public static int getLargest(int number[]) {
            int largest = Integer.MIN_VALUE;  // - INFINITY
            
            // Loop through the array to find the largest number
            for (int i = 0; i < number.length; i++) {
                if (number[i] > largest) {
                    largest = number[i];  // Update largest if a larger number is found
                }
            }
            return largest;  // Return the largest number
        }
    }

    public static void main(String[] args) throws Exception {
        
        // Array of numbers
        int number[] = {1, 2, 6, 3, 5};
        
        // Call the getLargest method and store the result
        int largest = ArrayCC.getLargest(number);
        
        // Output
        System.out.println("The largest number is: " + largest);
    }
}
