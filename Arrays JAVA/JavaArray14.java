public class JavaArray14 {

    public static int trappingRainwater(int height[]) {
        int n = height.length;

        // Calculate left max boundary -- array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) { // Start from i = 1
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary -- array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        // Loop
        for (int i = 0; i < n; i++) {
            // Water level = min(left max bound, right max bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater; // Correct return
    }

    public static void main(String[] args) throws Exception {
        int numbers[] = {4, 2, 0, 6, 3, 2, 5}; // Use correct variable name
        System.out.println(trappingRainwater(numbers)); // Correct method call
    }

}
