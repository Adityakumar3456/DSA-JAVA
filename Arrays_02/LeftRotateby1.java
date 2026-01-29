package Arrays_02;

public class LeftRotateby1 {
    public static void main(String[] args) {
        int [] arr = {10,20,40,30,50};
        int start = arr[0];
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = start;
        for(int x: arr){
            System.out.print(x + " ");
        }
        
    }
}
