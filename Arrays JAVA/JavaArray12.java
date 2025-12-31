public class JavaArray12 {

    public static void addsubMaxsubArray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        // Initialize the first element of the prefix array
        prefix[0] = numbers[0];

        // Calculate the prefix array starting from index 1
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
           

            // calculate the array like this

            // prefix[0] = numbers[0] = 1
            // prefix[1] = prefix[0] + numbers[1] = 1 + (-2) = -1
            // prefix[2] = prefix[1] + numbers[2] = -1 + 6 = 5
            // prefix[3] = prefix[2] + numbers[3] = 5 + (-1) = 4
            // prefix[4] = prefix[3] + numbers[4] = 4 + 3 = 7
        }

        // Iterate through the array to find the maximum subarray sum
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) { // Notice: `j = i`
                int end = j;

                // Use the prefix array to calculate the sum of the subarray
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The max sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };

        addsubMaxsubArray(numbers);
    }
}
