import java.util.Scanner;
public class JavaBasics17 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();

        if (number%2==0){
           System.out.print("the number is even");
        } else{
            System.out.print("the number is odd");
        }
    }
}
