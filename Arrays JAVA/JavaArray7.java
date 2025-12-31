// reverse the arrays

public class JavaArray7 {
    public static void reverse(int number[]) {
        int first = 0, last = number.length - 1;
  // while loop
        while (first < last) {
            int temp = number[first]; // temporary variable
            number[first] = number[last]; // swapping variable
            number[last] = temp;  

            first++;
            last--;
        }
    }

    public static void main(String[] args) throws Exception {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
     // print the array
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
