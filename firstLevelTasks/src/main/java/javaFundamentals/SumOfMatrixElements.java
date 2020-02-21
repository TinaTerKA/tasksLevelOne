package javaFundamentals;

//Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
//Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SumOfMatrixElements {
    public static void main(String[] args){
        sumNumbersLocatedBetweenTheFirstAndSecondPositiveMatrixElement(matrixData());
    }
     private static int[][] matrixData(){
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int n = 0;
         try {
              n = Integer.parseInt(reader.readLine());
         } catch (IOException e) {
             e.printStackTrace();
         }
         int[][] matrix = new int[n][n];
         int min = -18;
         int max = 64;
         int bound = Math.abs(min) + max +1;
         Random random = new Random();
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix.length; j++) {
                 matrix[i][j] = random.nextInt(bound) - Math.abs(min);
             }
         }
         return matrix;
     }

     private static void printMatrix(int[][] matrix){
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix.length; j++) {
                 System.out.print(" " + matrix[i][j] + " ");
             }
             System.out.println();
         }
     }

     private static void sumNumbersLocatedBetweenTheFirstAndSecondPositiveMatrixElement(int[][] matrix){
        printMatrix(matrix);
        int sum = 0;
        int count = 0;
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 if(count == 1 && matrix[i][j] < 0){
                    sum += matrix[i][j];
                 }
                 if(matrix[i][j] > 0){
                     count++;
                 }
             }
             System.out.println(sum);
             sum = 0;
             count = 0;
         }
     }
}
