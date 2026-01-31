package Arrays_02;

public class ReverseString2 {

    public static void reverseArray(char[] c){
        int left = 0;
        int right = c.length-1;

        while(left<right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            right--;
            left++;
        }
    }
    public static void main(String[] args) {
        char [] c = {'h','i','j','k'};

        reverseArray(c);
        for(char ch : c){
            System.out.print(ch +" ");
        }
        

    }
}
