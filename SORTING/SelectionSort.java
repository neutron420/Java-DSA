public class SelectionSort {

    public void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            // Find the maximum item in the remaining array and swap with correct index
            int last = n - i - 1;
            int maxIndex = getMaxIndex(array, 0, last);
            
            // Swap the found maximum element with the last element
            int temp = array[maxIndex];
            array[maxIndex] = array[last];
            array[last] = temp;
        }
    }

    private static int getMaxIndex(int[] array, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {-4,-78,67,45,342,56,67,89,67,43,23,11,23,45,67,88,100,123,123456789};
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort(array);
        
        // Print sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
