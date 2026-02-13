package Recursion_06;


public class powerfunction {

    public static int powfun(int a, int n){
        if(n==0){
            return 1;
        }
        return a * powfun(a,n-1);
    }
    public static void main(String[] args){
        int a = 2;
        int n = 4;
        System.out.println(powfun(a,n));
    }
}
