package Arrays_02;

public class prefixmaxArray {

    public static void prefixSum(int [] arr){
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {

                int currSum;
                if(i == 0) {
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }

                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println(maxSum);
    }
    public static void main(String[] args){
        int [] arr = {1,2,-2,3,-4,5};

        prefixSum(arr);
    }
}
