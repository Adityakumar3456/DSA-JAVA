package Arrays_02;

public class nonzero_twopointer {

    public static void twopointers(int [] args){
        int left = 0;
        for(int i = 0; i<args.length; i++){
            if(args[i] != 0){
                args[left] = args[i];
                left++;
            }
        }

        for(int j = left; j<args.length; j++ ){
            args[j] = 0;
        }
    }


    public static void main(String [] args){
        int [] arr = {2,0,3,0,4};
        twopointers(arr);
        for(int x: arr){
            System.out.print(x + " ");
        }

    }
}
