package Recursion_06;

public class n_to_1 {

    public static void printback(int n){
        if(n==0){
            return;
        }
        System.out.println(n+ " ");
        printback(n-1);
    }
    public static void main(String [] args){
        int b = 5;
        printback(b);

    }
}
