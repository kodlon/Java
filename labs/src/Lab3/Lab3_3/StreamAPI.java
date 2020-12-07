/*-----------------------------------------------
Завдання № 3.
Використовуючи Stream API та класи User
i Address із завдання №2 продемонструвати
використання методів map(), filter(), distinct()
peek(), limit(), sorted(), findFirst(), collect()
forEach() та reduce().
-----------------------------------------------*/

package Lab3.Lab3_3;
//Імпорти
import Lab3.Lab3_2.Address;
import Lab3.Lab3_2.User;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        //Класи з попереднього завдання
        Address office = new Address("Європа", "Україна", "Львів", "Шевченка", 358, 106, 79039);
        User igor = new User("Чучман", "Ігор", "Вікторович", 19, office);
        User chuchman = new User("Чучман", "Ігор", "Вікторович", 18, office);
        User ivan = new User("Чучман", "Іван", "Вікторович", 19, office);
        User vova = new User("Чучман", "Володимир", "Вікторович", 91, office);

        //Перший приклад використання методів
        System.out.println(Stream.of(igor.fistName, chuchman.fistName, ivan.fistName, vova.fistName).
                distinct().limit(2).sorted().skip(1).map(String::toUpperCase).collect(Collectors.toList()));

        //Другий приклад використання методів
        Stream.of(igor.age, ivan.age, chuchman.age, vova.age).filter(i -> i > 18).peek(s -> age()).forEach(System.out::println);

        //Третій приклад використання методів
        System.out.println(Stream.of(10, 10, 2).reduce((i, j) -> i + j));


    }
    //Тестовий метод, для піку
    public static void age(){
        System.out.print("age is: ");
    }


}
