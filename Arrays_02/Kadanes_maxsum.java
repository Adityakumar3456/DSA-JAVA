package Arrays_02;

public class Kadanes_maxsum {

    public static void kadaneMaxSum(int []arr){
        int cs = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            }
            max = Math.max(cs, max);
        }
        System.out.println("max sum is : " + max);
    }
    public static void main(String [] args){
        int [] arr = {3,4,-2,-3,-1,5,2,1};
        kadaneMaxSum(arr);
    }
}
