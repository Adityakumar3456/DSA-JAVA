package Arrays_02;

public class moveZeros {
    public static void moveZero(int [] arr){
        int index = 0;

        for(int i = 0; i <arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }

        while(index<arr.length){
            arr[index] = 0;
            index++;
        }

    }

    public static void main(String[] args) {
        int [] arr1 = {10,20,0,0,10,30};

        moveZero(arr1);

        for(int x : arr1){
            System.out.print(x +" ");
        }
    }
}
