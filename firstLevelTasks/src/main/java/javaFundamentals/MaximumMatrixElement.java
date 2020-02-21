package javaFundamentals;

//Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие

public class MaximumMatrixElement {
    private static int row;
    private static int column;

    public static void main(String[] args){
        printMatrix(matrixData());
        searchForTheMaxMatrixElement(matrixData());
        printMatrix(deleteRowAndColumnWithMaxElementFromMatrix(matrixData()));
    }

    private static int[][] matrixData(){
        int[][] twoDimArray = {{65, 33, 21, 16}, {95, 5, 28, 97}, {64, 2, 0, 85}, {85, 55, 4, 17}};
        return twoDimArray;
    }

    private static void searchForTheMaxMatrixElement(int[][] matrix){
       int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == max){
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(max);
    }

    private static int[][] deleteRowAndColumnWithMaxElementFromMatrix(int[][] matrix){
        int[][] copyMatrix = new int[3][3];
        for (int i=0, iCopy=0; iCopy<matrix.length-1;) {
            if (i!=row) {
                for (int j=0, jCopy=0; jCopy<matrix.length-1; j++, jCopy++) {
                    if (j==column) j++;
                    copyMatrix[iCopy][jCopy]=matrix[i][j];
                }
                i++;
                iCopy++;
            } else i++;
        }
       return copyMatrix;
    }

    private static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
