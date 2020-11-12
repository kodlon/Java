/*
Завдання No 2.Реалізувати сортування масиву String за довжиною.
*/

package Lab1;

import java.util.Arrays; //Бібліотека для роботи в масивами

public class Task2 {
    public static void main(String[] args) {
        String[] array = {"!", "Hello", "world", "first man"};   //оголошення масиву
        String tmp; //тимчасова змінна
        int i = 0;

        while (i < array.length - 1) {
            if (array[i + 1].length() <= array[i].length()) ++i; //перевірка чи одне значення масиву
            else {                                               //більше за попереднє
                tmp = array[i];                                  //Сортування бульбашкою
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                i = 0;
            }
        }
        System.out.println(Arrays.toString(array));              //Вивід масиву
    }
}

