
// finding the index for the value 
import java.util.*;

@SuppressWarnings("unused")
public class JavaArray6 {
    public static int binarySearch(int numbers[], int key){
        int start =0 , 
        end = numbers.length-1;

        while(start<= end){//while loop over
        int mid =(start +end)/2;


        // comparisons
        if(numbers[mid]==key){//found condition
            return mid;
        }
        else if(numbers[mid]<key){// right half
            start=mid+1;
        }
        else{ // left half
            end=mid-1;
        }
        }
        return -1;
        }


    public static void main(String[] args) throws Exception {
        int numbers[]= {2,4,6,8,10,12,14};
        int key= 10;


        System.out.println("index for key 10 is : " + binarySearch(numbers , key));
    }
}

