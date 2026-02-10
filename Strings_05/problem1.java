package Strings_05;
import java.util.*;

//Given a route containing 4 direction (E,W,S,N) find the shortest path to reach the destination

//Going
// North Y+1
// South Y-1
// East X+1
// West X-1 


public class problem1 {

    public static float getPath(String path){
        int x=0, y=0;

        for(int i = 0; i<path.length(); i++){
            char ch = path.charAt(i);

            if(ch == 'S'){
                y--;
            }
            else if(ch == 'N'){
                y++;
            }
            else if(ch == 'W'){
                x--;
            }
            else{
                x++;
            }
            

            
        }
        int X2 = x*x;
            int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args){
        String path = "WEENNESSEN";
        System.out.println(getPath(path));
    }
    
}
