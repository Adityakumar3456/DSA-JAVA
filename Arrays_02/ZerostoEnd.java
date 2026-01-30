package Arrays_02;

public class ZerostoEnd {
    public static void main(String[] args) {
        int [] arr = {1,2,0,0,44,5};

        int [] temp = new int[arr.length-1];
        int index =0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != 0){
                temp[index] = arr[i];
                index++;
            }
        }

        for(int x=0; x<temp.length; x++){
            System.out.print(temp[x]+ ",");
        }
    }
}
