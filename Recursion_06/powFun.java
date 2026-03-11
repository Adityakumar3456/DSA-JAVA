package Recursion_06;

public class powFun {

    public static int powerFun(int i, int n){

        if(n == 0)
            return 1;
        
        return i * powerFun(i,n-1);
    }
    public static void main(String [] args){
        System.out.println(powerFun(2,10));
    }
}
