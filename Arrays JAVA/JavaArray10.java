public class JavaArray10 {

    public static void subarrays(int numbers[]) {
        int ts = 0; // To count the total number of subarrays
        int maxSum = Integer.MIN_VALUE; // To store the maximum sum
        int minSum = Integer.MAX_VALUE; // To store the minimum sum
        int totalSum = 0; // To store the sum of all subarray sums

        // Loop through each starting index of subarrays
        for (int i = 0; i < numbers.length; i++) {

            // Loop through each ending index of subarrays
            for (int j = i; j < numbers.length; j++) {
                int currentSum = 0; // To store the sum of the current subarray

                // Print the subarray from i to j and calculate its sum
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    currentSum += numbers[k];
                }

                // Update total subarray count
                ts++;

                // Update total sum of all subarray sums
                totalSum += currentSum;

                // Update max and min sums
                maxSum = Math.max(maxSum, currentSum);
                minSum = Math.min(minSum, currentSum);

                // Print the current sum for debugging
                System.out.println("=> Sum: " + currentSum);
            }
        }

        // Print results
        System.out.println("Total subarrays = " + ts);

        System.out.println("Total sum of all subarray sums = " + totalSum);

        System.out.println("Maximum sum of subarrays = " + maxSum);

        System.out.println("Minimum sum of subarrays = " + minSum);
    }

    public static void main(String[] args) throws Exception {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subarrays(numbers);
    }
}
