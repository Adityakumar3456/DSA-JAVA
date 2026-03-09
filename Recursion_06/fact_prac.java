package Recursion_06;

public class fact_prac {
    public static int fact(int n){
        if(n == 0){
            
            return 1;
        }
        
        int fn = fact(n-1);
        int fact = n * fact(n-1);
        return fact;
    } 

    public static void main(String [] args){
        int n = 5;
        int z = fact(n);
        System.out.print(z);
    }
}
