package Arrays_02;

public class ArrayBasic {
    public static void main(String[] args) {
       int [] price = {10,20,30,40,50}; // Method of array
       int [] arr = new int[5];  //Method 2
       for(int i = 0; i< price.length; i++){
            System.out.println(price[i]);
       }
       System.out.println("Second Arr");
       for(int i =0; i<=arr.length; i++){
            System.out.println(arr[i]);
       }
    }
}
