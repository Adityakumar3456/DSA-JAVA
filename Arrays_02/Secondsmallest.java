package Arrays_02;
import java.util.*;
public class Secondsmallest {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        int second = -1;

        for(int j = 0; j<arr.length; j++){
            if(arr[j]<smallest){
                second = smallest;
                smallest = arr[j];
            }
            else if(arr[j]> smallest && arr[j]<second){
                second = arr[j];
            }
        }
        System.out.println("The second Smallest value is : " + second);
    }
}
