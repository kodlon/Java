/*--------------------------------------------
Завдання № 5.
Згенерувати масив зі 100 чисел від 1 до 7.
Добавити усі числа у Set та вивести результат.
--------------------------------------------*/

package Lab2.Lab2_5;

import java.util.Arrays;
import java.util.LinkedHashSet;//Бібліотека для сет

public class Class {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();//Створення сету, лінкед бо не сортує
        int[] array = new int[100];//Створення масиву

        for (int i = 0; i < 100; i++){
            array[i] = (int) (Math.random() * 7) + 1;//Заповнення масиву різними числами
            set.add(array[i]);//Заповнення сету
        }

        System.out.println(Arrays.toString(array));//Виведення масиву згенерованих чисел
        System.out.println();
        System.out.println(set);//Виведення сету
        }
}
