import java.util.Scanner;

class matrix {
    int arr[][];
    int r, c;

    matrix(int r, int c) {
        this.r = r;
        this.c = c;
        arr = new int[r][c];
    }

    int[][] getMatrix() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Enter element at arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;  
    }

    int[][] addMatrix(int a[][], int b[][]) {
        int sum[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    void displayMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MatrixSum {
    public static void main(String[] args) {
        matrix obj1 = new matrix(3, 3);
        matrix obj2 = new matrix(3, 3);
        
        int x[][], y[][], z[][];

        System.out.println("\nEnter the numbers in the first matrix:");
        x = obj1.getMatrix();
        
        System.out.println("\nEnter the numbers in the second matrix:");
        y = obj2.getMatrix();
        
        z = obj1.addMatrix(x, y);

        System.out.println("\nSum of the matrices:");
        obj1.displayMatrix(z);
    }
}
