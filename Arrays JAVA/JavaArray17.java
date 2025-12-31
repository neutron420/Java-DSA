public class JavaArray17 {

    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            // Top boundary
            for (int j = startColumn; j <= endColumn; j++) {  
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right boundary
            for (int i = startRow + 1; i <= endRow; i++) {  
                System.out.print(matrix[i][endColumn] + " ");
            }

            // Bottom boundary
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) break;
                System.out.print(matrix[endRow][j] + " ");
            }

            // Left boundary
            for (int i = endRow - 1; i > startRow; i--) {  
                if (startColumn == endColumn) break;  
                System.out.print(matrix[i][startColumn] + " ");
            }

            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }

        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
        };

        spiralMatrix(matrix);
    }
}
