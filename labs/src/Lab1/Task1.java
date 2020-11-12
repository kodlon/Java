/*
Завдання № 1. Калькулятор.
Реалізувати калькулятор, який буде виконувати операції додавання,
віднімання, множення та ділення для двох змінних. Знак операціїповинен
бути заданим як char або String. Необхідно коректно обробляти такі
виключні ситуації: ділення на 0; введення невірного знаку операції.
*/

package Lab1;

import java.util.Scanner; //підключення бібліотеки, яка зраховує дані з джерала

public class Task1 {
    public static void main(String[] args) { //головний метод
        Scanner in = new Scanner(System.in); //підключення до сканера, потік вхідних даних

        int flag = 1; //змінна прапорець

        while (flag >= 1) {
            System.out.println("Введіть перше число:");
            Double a = in.nextDouble(); //ввід першого числа
            System.out.println("Введіть знак операції:");
            char signOperation = in.next().charAt(0); //ввід знаку операції
            System.out.println("Введіть друге число:");
            Double b = in.nextDouble(); //ввід другого числа

            switch (signOperation) { //визначення введеної операції
                case '+' -> System.out.println("Результат: " + (a + b));
                case '-' -> System.out.println("Результат: " + (a - b));
                case '*' -> System.out.println("Результат: " + (a * b));
                case '/' -> {
                    if (b == 0) {//перевірка на нуль
                        System.out.println("Помилка. Ділення на 0.");
                        break;
                    }
                    System.out.println("Результат: " + (a / b));
                }
                default -> System.out.println("Помилка. Невірний знак операції: " + signOperation + '\n'
                        + "Вірні знаки операцій: +, -, *, /.");
            }

            System.out.println("Якщо хочете продовжити введіть 1." + '\n'
                    + "Якщо не хочете продовжити введіть 0");
            flag = in.nextInt(); //перевірка чи продовжувати цикл
        }
    }
}

