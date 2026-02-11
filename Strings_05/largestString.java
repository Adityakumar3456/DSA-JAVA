package Strings_05;

public class largestString {
    public static void main(String [] args){
        String st[] = {"Apple", "Mango", "Banana"};
        String Largst = st[0];
        for(int i = 0; i<st.length; i++){
            if(Largst.compareTo(st[i])<0){
                Largst = st[i];
            }
        }

        System.out.println(Largst);
    }
}
