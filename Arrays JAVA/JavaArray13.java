// Kadanes algorithm important for interviews most optimal approarch / method for solving the max Subarray sum method.

//it takes the time complexity less than that of the brute force approach and from the prefix method.

//Brute force method - O(n^3) time complexity and sapce complexity O(1).

//Second is the prefix sum method which reduces it to the time complexity to O(n^2) and space complexity is O(1).

// third it comes to the Kadanes algorithm which is the best minimal appproach to less the time complexity to O(n) and space complexity to O(1).

public class JavaArray13 {

    public static void KadanesAlgo(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);

        }
        System.out.print("the max subarray sum is : " +ms);

    }

    public static void main(String[] args) throws Exception {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        KadanesAlgo(numbers);

    }
}
