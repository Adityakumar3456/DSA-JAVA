import java.util.*;
public class hashing {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
    }
}
