package Recursion_06;

public class fiboo {

    public static int fibo(int n){
        if(n ==0 || n==1){
            return n;
        }

        int f1 = fibo(n-1);
        int f2 = fibo(n-2);
        int fn = f1 + f2;
        return fn;
    }
    public static void main(String [] args){
        int n = 10;
        System.out.print(fibo(n));
    }
}
