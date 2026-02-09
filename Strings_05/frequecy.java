package Strings_05;

public class frequecy {
    public static void main(String [] args){
        String s = "aba";
int[] freq = new int[26];

for(int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    freq[ch - 'a']++;
}


        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                System.out.println((char)(i + 'a') + " -> " + freq[i]);
             }
        }

    }
}
