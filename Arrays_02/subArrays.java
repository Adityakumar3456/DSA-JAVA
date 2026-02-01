package Arrays_02;

public class subArrays {

    public static void subArray(int [] arr){
        int ts = 0;
         int sum = 0;
        for(int i = 0; i<arr.length; i++){
            
            for(int j =i; j<arr.length; j++){
                sum = 0;
                for(int k = i; k<= j; k++){
                    System.out.print(arr[k] + " ");
                    sum +=arr[k];
                }
                ts++;
                System.out.println();
                System.out.println("The sum of subArray : " +sum);
            }
            System.out.println();
        }
        System.out.println("Total subArray : " + ts);
        
    }
    public static void main(String [] args){
        int [] arr = {2,3,4,5,6};
        subArray(arr);
    }
}
