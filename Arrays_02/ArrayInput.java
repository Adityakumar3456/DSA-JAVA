package Arrays_02;
import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        System.out.println("Enter your array input");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array");
        for(int j = 0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
