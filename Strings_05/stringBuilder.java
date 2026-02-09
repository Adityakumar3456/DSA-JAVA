package Strings_05;

public class stringBuilder {
    public static void main(String [] args){
        StringBuilder st = new StringBuilder();

        for(char ch = 'a'; ch<'z'; ch++){
            st.append(ch);
        }
        System.out.print(st);
    }
}
