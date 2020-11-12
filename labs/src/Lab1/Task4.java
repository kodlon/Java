/*
Завдання № 4.
Реалізувати алгоритм сортування бульбашкою.
*/

package Lab1;

import java.util.Arrays; //Бібліотека для роботи в масивами

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {5, 6, 8, 4}; //оголошення масиву
        int i = 0, tmp; //тимчасова змінна

        while (i < numbers.length - 1) { //бульбашка
            if (numbers[i + 1] <= numbers[i]) ++i;
            else {
                tmp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = tmp;
                i = 0;
            }
        }

        System.out.println(Arrays.toString(numbers)); //Виведення
    }
}

