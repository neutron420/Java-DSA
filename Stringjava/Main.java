// // public class Main{

// //     public static void main(String[] args){
// //         String a =new String("Ritesh");
// //         String b =new String(" Ritesh");
// //         System.out.println(a == b);   
// //         System.out.println(a.equals(b));
// //         System.out.println(a.charAt(3));
// //     }
// // } 

// public class Main {
//     public static void main(String[] args) {
//         System.out.println(  56);
//         System.out.println( "Ritesh");
//         System.out.println( new int[]{3,4,5,6,7,8});
// // function overloading

//        String name = null;
//        System.out.println(name);
//     }

// }

// pretty printing

// public class Main{
//     public static void main(String[] args){
//         float a = 45.7854f;
//         //  System.out.printf("Formatted number is %.3f" , a);
//         //  System.out.printf(" Pie : %.3f",Math.PI);
//          System.out.printf("Hello my name is %s and i am %s" , "Ritesh" ,"cool");
//     }
// }


// public class Main{
//     public static void main(String[] args){
//        System.out.println('a'+'b');
//        System.out.println("a"+"b");
//        System.out.println((char)('a'+ 3));
       
//        System.out.println("a"+ 1);
       // integer will be converted to integer that will be called toString()
//     }
// }

// Q1.)

public class Main{
    public static void main(String[] args){
        String str = "abccba";
        System.out.println(isPalindrome(str));

    }
    static boolean isPalindrome(String str){
      str = str.toLowerCase();
      for( int i= 0; i<=str.length()/ 2; i++){
           char start = str.charAt(i);
           char end = str.charAt(str.length() - 1 -i);

           if(start != end){
            return false;
           }
      }
      return true;
    }

}


