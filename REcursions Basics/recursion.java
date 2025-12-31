// public class recursion {
//     public static void main(String[] args) {
//         // print numbers that in a number and prints it'
//         // that is 1,2,3,4,5
//         print1(1);
//     }

//     static void print1(int n) {
//         System.out.println(n);
//         print2(2); 
//     }

//     static void print2(int n) {
//         System.out.println(n);
//         print3(3);
//     }

//     static void print3(int n) {
//         System.out.println(n);
//         print4(4);
//     }

//     static void print4(int n) {
//         System.out.println(n);
//         print5(5);
//     }
//     static void print5(int n) {
//         System.out.println(n);
//     }
// }

public class recursion {
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n) {
        if (n == 5) { // base condition
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print1(n + 1); 
    }
}
