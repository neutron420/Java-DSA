// Print the Pairs of arrays

import java.util.*;

public class JavaArray8 {

    static int tp = 0; // Declare tp as a static class variable

    public static void pairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i]; // 2,4,6,8,10 it will sequentially go through one by one

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
                // //(2,4)(2,6)(2,8)(2,10)
                //   (4,6)(4,8)(4,10)
                //   (6,8)(6,10)
                //   (8,10)

                tp++;

            } 
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        pairs(numbers);

        System.out.println("total pairs =" + tp);
    }
}
