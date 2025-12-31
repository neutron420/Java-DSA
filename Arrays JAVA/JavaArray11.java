//print the sum of max subarray

public class JavaArray11 {

    public static void maxsubarraySum(int number[]) {
      // iterate through all subarrays
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // iterate through all subarrays starting from the first element
        for (int i = 0; i < number.length; i++) {
            int start = i; // start of the subarray
            
            for (int j = 0; j < number.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // subarray sum
                    currSum += number[k];
                }
                System.out.println(currSum);
                if(maxSum< currSum){
                    maxSum = currSum;
                }
            }
        }

       System.out.println("Maximum Subarray:" +maxSum);
    }

    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxsubarraySum(numbers); // calling main funtion

    }
}
