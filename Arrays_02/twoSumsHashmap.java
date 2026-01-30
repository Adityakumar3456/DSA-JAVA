package Arrays_02;

import java.util.HashMap;

public class twoSumsHashmap {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7};
        int target = 7;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            
            int need = target - arr[i];

            if(map.containsKey(need)){
                System.out.println(need +" & "+ arr[i]);
                break;
            }

            map.put(i, arr[i]);
        }
    }
}
