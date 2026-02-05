package Array2D_03;
import java.util.*;

public class sum_row {

    public static void rowsum(int matrix[][]){
        int rows = matrix.length-1;
        int cols = matrix[0].length - 1; 
        for(int i = 0; i < rows; i++) {
            int sum = 0;
            for(int j = 0; j < cols; j++) {
                sum += matrix[i][j];
    }
    System.out.println("Row " + i + " sum = " + sum);
}

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

        // for(int i =0 ; i<n; i++){
        //     for(int j = 0; j<m; j++){
        //         System.out.print(matrix[i][j] + " ");
                
        //     }
        //     System.out.println();
        // } 

        rowsum(matrix);
        System.out.println();
    }
}
