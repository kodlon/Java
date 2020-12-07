/*--------------------------------------------------
Завдання № 1.
Створити власний checked exception у якому повинні
бути 1-2 поля для інформації про виключну ситуацію.
Скопіювати завдання № 1 з лабораторної роботи № 1
(Калькулятор) і обробити ділення на 0 використовуючи
створений exception.
--------------------------------------------------*/

package Lab3.Lab3_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws ZeroException{ //головний метод, оголошення експешина
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
                    if (b == 0) throw new ZeroException(); //перевірка на нуль, якщо тру то кидає ексепшин
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
