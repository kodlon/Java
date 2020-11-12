package Lab2.Lab2_3;

public class Queue {
    private String[] peopleNearShop; //Черга
    private int next = 0;//Лічильник черги

    public Queue(int size) {//Конструктор, ініціалізація масиву черги
        peopleNearShop = new String[size];
    }

    public String[] add(String human) {//додає людину в кінець черги
        //Перевірка на пустоту
        if (next == peopleNearShop.length) System.out.print("Черга заповнена, неможливо добавити ще 1 людину: ");
        else {
            peopleNearShop[next] = human;//Додавання елементу
            next++;//Збільшення лічильника
        }
        return peopleNearShop;
    }

    public String[] delete() {//видаляє першу людину з черги
        //Перевірка на пустоту
        if (next == 0) System.out.print("Черга вже пуста, нема що видаляти: ");
        else {
            int i;//Ітератор
            for (i = 0; i < peopleNearShop.length - 1; i++) peopleNearShop[i] = peopleNearShop[i + 1];//зміщення черги
            peopleNearShop[i] = null;//заповнення останнього місця
            next--;//зменшення лічильника
        }
        return peopleNearShop;
    }

}
