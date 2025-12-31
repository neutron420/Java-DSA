// code for linear search finding element in the given array order
public class JavaArray3 {
    public static class ArrayCC {
        // Method to perform linear search
        public static int linearSearch(int numbers[], int key) {
            // Iterate through the array to find the key
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == key) {
                    return i; // Return the index if key is found
                }
            }
            return -1; // Return -1 if key is not found
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key= 12;

        // Call the linearSearch method
        int result = ArrayCC.linearSearch(numbers, key);

        // Check the result and print the output
        if (result != -1) {
            System.out.println("Key " + key + " found at index: " + result);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }
}



