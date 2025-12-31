import java.util.Arrays; 

class CycleSort {
    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 1, 2 };
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    static void sort(int[] array) {  
        int i = 0;
        while (i < array.length) {
            int correct = array[i] - 1;
            if (correct >= 0 && correct < array.length && array[i] != array[correct]) {
                swap(array, i, correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
