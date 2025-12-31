public class JavaArray18 {

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        int j;
        for (int i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                // primary diagonal rows==column
                if (i == j) {
                    sum += matrix[i][j];
                }
                // secondary column condition (i+j ==n-1) that is [rows +columns == matrix.length-1].
                else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int result =diagonalSum(matrix);
        System.out.println("The sum of the matrix consisting diagonals is : " + result);

    }
}
