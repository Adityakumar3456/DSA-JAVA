package Arrays_02;
import java.util.*;

public class maxsubArrays {

    public static void subArray(int [] arr){
        int max = Integer.MIN_VALUE;
         int sum = 0;
        for(int i = 0; i<arr.length; i++){
            
            for(int j =i; j<arr.length; j++){
                sum = 0;
                for(int k = i; k<= j; k++){
                    
                    sum +=arr[k];
                }
                if(max<sum){
                    max = sum;
                }
            }
            
        }
        System.out.println("The sum of subArray : " +max);
        
    }
    public static void main(String [] args){
        int [] arr = {2,3,4,5,6};
        subArray(arr);
    }
}
