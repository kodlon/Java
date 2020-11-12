/*
Завдання № 3.
Реалізувати сортування масиву String за кількістю великих літер.
*/

package Lab1;

import java.util.Arrays; //Бібліотека для роботи в масивами

public class Task3 {
    public static void main(String[] args) {
        String[] array = {"hEllO", "WoRLD", "!", "First", "СЛАВА УКРАЇНІ!"}; //оголошення масиву
        String tmp; //тимчасова змінна
        int i = 0;

        while (i < array.length - 1){ //Бульбашка
            if (check(array[i]) >= check(array[i + 1])) ++i;
            else{
                tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                i = 0;
            }
        }
        System.out.println(Arrays.toString(array)); //Виведення
    }

    static int check(String array) { //Перевірка
        int countUpperCase = 0;

        for (int i = 0; i < array.length(); i++) {
            if (Character.isUpperCase(array.charAt(i))) {
                ++countUpperCase;
            }
        }
        return countUpperCase;
    }
}


