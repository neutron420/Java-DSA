// finding the giuven string in the particular index

public class JavaAarray4 {
    public static void main(String[] args) {
        // Define the array of strings
        String[] foodArray = {"samosa", "chole bhature", "burger", "pizaa"};
        
        // Key to search
        String key = "pizaa";
        
        // Perform linear search
        int resultIndex = linearSearch(foodArray, key);
        
        // Output the result
        if (resultIndex != -1) {
            System.out.println("The key \"" + key + "\" is found at index: " + resultIndex);
        } else {
            System.out.println("The key \"" + key + "\" is not found in the array.");
        }
    }

    // Linear search method
    public static int linearSearch(String[] array, String key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return i; // Return the index if key is found
            }
        }
        return -1; // Return -1 if key is not found
    }
}
