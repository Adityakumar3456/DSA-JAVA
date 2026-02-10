package Strings_05;
import java.util.*;

public class string {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);  //input
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = firstName +" "+ lastName;

        System.out.println(fullName);  // concatenation
        System.out.println(firstName.length());
    }
}
