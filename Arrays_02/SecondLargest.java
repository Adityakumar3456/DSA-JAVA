package Arrays_02;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};

        int largest = arr[0];
        int second = -1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
                
            }
            else if(arr[i] <largest  && arr[i]>second){
                second = arr[i];
            }
        }

        System.out.println("Second Largest element is : " + second);
    }
}
