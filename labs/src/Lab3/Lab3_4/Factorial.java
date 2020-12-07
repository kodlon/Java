package Lab3.Lab3_4;

public class Factorial extends  Thread{
    //Конструктор
    public Factorial(String name) {
        super(name);
    }

    //Метод, який входить в потік
    public void run(){
        int fact = 1;
        //Факторіал
        for(int i=1;i<=5;i++){
            fact=fact*i;
            System.out.println(fact);
        }
        //Вивід інформації про потік
        System.out.println(this);
    }


}

