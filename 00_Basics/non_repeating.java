import java.util.*;
public class non_repeating {
    public static void main(String [] args){
        int [] arr = {2,3,3,2,4,5,6,6};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x: arr){
            if(map.get(x) == 1){
                System.out.println(x);
                break;
            }
        }
    }
}
