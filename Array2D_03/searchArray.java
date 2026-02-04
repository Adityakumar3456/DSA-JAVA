package Array2D_03;
import java.util.*;

public class searchArray {
    public static boolean arraysearch(int Matrix[][], int key){
        int n = Matrix.length;
        int m = Matrix[0].length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <m; j++){
                if(Matrix[i][j] == key){
                    System.out.println("The value found at " + i +" & " + j);
                    return true;
                }
                
            }
        }
        return false;
    }
    public static void main(String [] args){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i =0 ; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i =0 ; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }

        arraysearch(matrix, 6);
    }
}
