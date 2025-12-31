import java.util.*;

public class Practice2 {
    public static void show(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
    }
    public static void main(String [] args){
        System.out.println("Hello World");
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
        int arr[]={ 5,8,5,8,5,8,44,5,5};
        show(arr);
    }
}