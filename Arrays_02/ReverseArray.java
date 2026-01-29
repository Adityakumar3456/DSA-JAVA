package Arrays_02;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};

        int[] rev = new int[4];

        for(int i = arr.length-1; i>=0; i--){
            rev[(arr.length-1)-i]= arr[i] ;
        }

        for(int j = 0; j<rev.length; j++){
            System.out.print(rev[j] + " ");
        }

    }
    

}
