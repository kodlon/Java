/*
Завдання No 6.
Транспонувати матрицю 5х3.
*/

package Lab1;

import java.util.Arrays; //Бібліотека для роботи в масивами

public class Task6 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, //Оголошення початкової матриці
                          {4, 5, 6},
                          {7, 8, 9},
                          {10, 11, 12},
                          {13, 14, 15}};
        int[][] result = new int[3][5]; //Оголошення кінцевої матриці

        for (int i = 0; i < 3; i++) { //два цикла, тому що матриця це масив в масиві
            for (int j = 0; j < 5; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        for (int[] ints : matrix) System.out.println(Arrays.toString(ints)); //вивід
        for (int[] ints : result) System.out.println(Arrays.toString(ints));
    }
}
