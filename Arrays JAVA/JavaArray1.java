import java.util.*;
public class JavaArray1{
   public static void main(String[] args) throws Exception{
         int marks[]= new int[100];

         Scanner sc = new Scanner(System.in);
// to print out the lenth of the array
         System.out.println("length of array =" + marks.length);

    //array indexing
         marks[0] =sc.nextInt();
         marks[1] =sc.nextInt();
         marks[2] =sc.nextInt();
      // print statement
         System.out.println("phy :" +marks[0]);
         System.out.println("maths :" +marks[1]);
         System.out.println("chem :" +marks[2]);
      // to update the marks

         marks[0]= marks[0]+1;
         System.out.println("phy :" +marks[0]);
      // to find out the percentage
         int percentage = (marks[0] + marks[1] + marks[2])/3;
         System.out.println("percentage:" + percentage +'%');
    
        
   }  
}