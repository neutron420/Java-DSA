import java.util.Arrays;
public class BubbleSort {
    public static void main(String args[]) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr)); // Print original array
        
        BubbleSort(arr); // Call the sorting function
        
        System.out.println(Arrays.toString(arr)); // Print sorted array
    }

    static void BubbleSort(int[] arr) {
        boolean swapped;

        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) { // external loop
            swapped = false;

            // for each step, max item will come in the last respective index
            for (int j = 1; j < arr.length; j++) { // Start from j = 1 to prevent out-of-bounds error
                // compare the adjacent elements
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    swapped = true;
                }
            }

            // if no swapping happened in a pass, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
