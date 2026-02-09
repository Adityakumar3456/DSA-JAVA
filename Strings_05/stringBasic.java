package Strings_05;

public class stringBasic {

    public static void stringprint(String val){
        for(int i = 0; i<val.length(); i++){
            System.out.print(val.charAt(i) + " ");
        }
    }
    public static void main(String[] args){
        String val = "Hello";
        stringprint(val);
    }
}
