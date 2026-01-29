package Arrays_02;

public class Arraymin {
    public static void main(String[] args) {

        int []arr = {20,30,10,40,5};

        int min = arr[0];

        for(int i =0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("The minimum value in the array is : " + min);

        
    }
}
