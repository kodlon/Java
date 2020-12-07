/*------------------------------------------
Написати програму для обчислення простих
калькуляцій використовуючи багатопотоковість
в Java.
------------------------------------------*/

package Lab3.Lab3_4;

public class ManyThreads {
    public static void main(String[] args) {
        //Створення нового потоку, Фібоначчі
        new Fibonacci("Fibonacci").start();

        //Створення нового потоку, Факторіалу
        new Factorial("Factorial").start();
    }
}
