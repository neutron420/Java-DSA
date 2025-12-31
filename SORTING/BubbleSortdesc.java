import java.util.Arrays;

public class BubbleSortdesc {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;  // Reset swap flag for each pass
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {  // Swap if the left element is smaller
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // If no swaps, array is already sorted
        }
    }
}
