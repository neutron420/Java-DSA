import java.util.Scanner;
public class JavaBasics42 {
    public static int product(int num1,int num2){
        int product= num1* num2;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int  product = product(a, b);// arguments or actual parameters
        System.out.println("product: " + product  );
    }
}

