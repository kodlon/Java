/*---------------------------------
Завдання № 3.
Реалізувати структуру даних “черга”
та методи add(...) i delete(...).
---------------------------------*/


package Lab2.Lab2_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(3);//Створення черги і задання її розміру

        System.out.println(Arrays.toString(queue.add("Igor")));//Додавання в чергу
        System.out.println(Arrays.toString(queue.add("Vova")));
        System.out.println(Arrays.toString(queue.add("Ivan")));
        System.out.println(Arrays.toString(queue.add("Mike")));

        System.out.println();


        System.out.println(Arrays.toString(queue.delete()));//Видалення з черги
        System.out.println(Arrays.toString(queue.delete()));
        System.out.println(Arrays.toString(queue.delete()));

        System.out.println();

        System.out.println(Arrays.toString(queue.delete()));
    }
}
