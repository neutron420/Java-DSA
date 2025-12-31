// Print Subarrays

public class JavaArray9 {

    public static void subarrays(int numbers[]) {
        int ts =0;

        // Loop through each starting index of subarrays


        for (int i = 0; i < numbers.length; i++) {

            // Loop through each ending index of subarrays

            for (int j = i; j < numbers.length; j++) {
                // Print the subarray from i to j

                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                // Print a new line after printing each subarray
                System.out.println();
            }
        }

        System.out.println("total subarrays = "+  ts);
    }

    public static void main(String[] args) throws Exception {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subarrays(numbers);
    }
}
