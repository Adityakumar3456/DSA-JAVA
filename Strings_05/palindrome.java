package Strings_05;

public class palindrome {

    public static boolean palindrome(String st){
        int left = 0;
        int right = st.length()-1;

        boolean isPalindrome = true;

        while(left<right){
            if(st.charAt(left) != st.charAt(right)){
                isPalindrome =  false;
                break;
            }
            left++;
            right--;

        }
        return isPalindrome;
    }
    public static void main(String [] args){
        String st = "papt";
        System.out.print(palindrome(st));
    }
}
