package Lab3.Lab3_4;

public class Fibonacci extends Thread{
    //Конструктор
    public Fibonacci(String name) {
        super(name);
    }

    //Метод, який входить в потік
    public void run(){
        int n = 9;
        System.out.println(fib(n));

        //Вивід інформації про потік
        System.out.println(this);
    }

    //Фібоначчі
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
