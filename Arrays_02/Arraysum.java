package Arrays_02;

public class Arraysum {
    public static void main(String[] args) {
        int sum = 0;
        int [] arr = {10,20,30,40,50};

        for(int i = 0; i<=arr.length-1; i++){
            sum = sum + arr[i];
        }

        System.out.println("The sum of an array is : " + sum);
    }
}
