public class JavaBasics46 {
   public static int sum( int a , int b, int c){
    return a + b + c;
   } 
   public static int sum(int a, int b){
   return a + b;
   }

   public static float sum(float a, float b){
     return a + b ;
   }

   public static void main ( String[] args )  {
    System.out.println(sum(3.5f, 4.5f));
    System.out.println(sum(5, 6));
    System.out.println(sum(1, 2, 3));
}
}
