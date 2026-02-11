package Strings_05;

public class subString {

    public static String substring(String st, int start, int end){
        String subString = "";
        for(int i = start; i<end; i++){
            subString += st.charAt(i);
        }

        return subString;
    }
    public static void main(String [] args){
        String ab = "Hello world";
        System.out.println(ab.substring(0,5));
        System.out.println(substring(ab,0,5));
    }
}
