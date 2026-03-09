package Recursion_06;

public class sumofn {

    public static int sum(int n){
        if(n == 1){
            return 1;
        }

        // int total = sum(n-1);
        int su = n + sum(n-1);
        return su;
    }
    public static void main(String [] args){
        System.out.print(sum(10));
    }
}
