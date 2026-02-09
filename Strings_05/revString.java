package Strings_05;

public class revString {

    public static void reverseString(String st){
        String rev = "";

        for(int i = st.length()-1; i>=0; i--){
            rev += st.charAt(i);
        }

        System.out.print(rev);
    }
    public static void main(String [] args){
        String st = "Java";
        reverseString(st);
    }
}
