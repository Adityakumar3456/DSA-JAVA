package Array2D_03;

public class spiral_2dArray {

    public static void printspiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <=endCol){

            //top row
            for(int j = startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");                
            }

            //right col
            for(int i = startRow + 1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //end row
            for(int  j =endCol - 1 ; j>= startCol ; j--  ){
                System.out.print(matrix[endRow][j] + " ");
            }

            //start Col

            for(int i = endRow -1; i >= startCol+1; i--){
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        printspiral(matrix);
    }
}
