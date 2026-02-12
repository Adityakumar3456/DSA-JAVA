package Recursion_06;

public class one_to_n {
    public static void printfront(int n){
        if(n == 0){
            return;
        }
        printfront(n-1);
        System.out.println(n + " ");
        
    }
    public static void main(String [] args){
        int a = 3;
        printfront(a);
    }
}
