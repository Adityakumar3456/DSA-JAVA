package Recursion_06;

public class factorial {

    public static int fact(int n){
        if(n==1){
            return 1;
        }else{
           return n* fact(n-1);
        }
    }
    public static void main(String [] args){
        int a = 1;
        System.out.print(a); 
        
    }
}
