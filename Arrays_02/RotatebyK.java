package Arrays_02;

public class RotatebyK {

    public static void rotateByOne(int[]arr){
        int first = arr[0];

        for(int i = 0; i<arr.length-1; i++ ){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = first;
    }
    public static void main(String[] args) {

        int []arr = {2,3,4,5};

        int k = 2;
        for(int t=0; t<k; t++){
            rotateByOne(arr);
        }

        for(int x : arr){
            System.out.println(x);
        }
        
    }
}
