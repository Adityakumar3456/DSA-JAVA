package Recursion_06;
public class sum_of_n {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args){
        int n = 4;
        System.out.print(sum(n));
    }
}
