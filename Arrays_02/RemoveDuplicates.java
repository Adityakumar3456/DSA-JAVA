package Arrays_02;

public class RemoveDuplicates {

    public static int removeDuplic(int [] arr){
        int left = 1;

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] != arr[i + 1]) {
                arr[left] = arr[i + 1];
                left++;
            }
        }

        return left; 
    }
    public static void main(String [] args){
        int [] arr = {1,1,1,2,2,3};

        int k = removeDuplic(arr);

        for(int i = 0; i<k; i++){
            System.out.println(i+ " ");
        }

    }
}
