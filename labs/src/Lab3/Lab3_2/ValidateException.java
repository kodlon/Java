package Lab3.Lab3_2;

public class ValidateException extends Exception { //Опрацювання вірності заповнення

    enum http { //Коди, в залежності від заповнення видаються різні
        SUCCESS("200"),//Успіх
        CLIENT_ERROR("400"),//Помилка на сторні клієнта
        SERVER_ERROR("500");//Помилка на сторні сервера

        private final String httpStatusCode;
        //конструктор
        http(final String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
        }
    }

    //Конструктор ексепшина, оскільи походить від класу то і він юзається
    public ValidateException(final String message) {
        super("Код: " + message);
    }


    //Перевірка логіну юзера
    static String loginCheck(final User user) throws ValidateException {
        //Вся перевірка відбувається в 1 булеані для зручності. Вся перевірка зводиться до перевірки
        //цифр і стрічок
        final boolean checkUser = checkStrings(user.surName) &&
                checkStrings(user.fistName) &&
                checkStrings(user.middleName) &&
                checkAge(user.age);

        //Якщо перевірка успішна то повертається відповідний код
        if (checkUser)
            return http.SUCCESS.httpStatusCode;

        //Якщо перевірка не успішна, то кидається ексепшин. І передається туди код помилки
        throw new ValidateException(http.CLIENT_ERROR.httpStatusCode);
    }

    //Перевірка стрічок, стрічки це всі імена. Перевіряється чи є цифри, пробіли, і чи перша буква велика
    private static boolean checkStrings(final String name) { //Перевірка
        for (final Character i :
                name.toCharArray()) {

            if (Character.isDigit(i) || Character.isSpaceChar(i)) return false;
        }
        return Character.isUpperCase(name.charAt(0));
    }

    //Перевірка віку, просто є обмеження по віку
    private static boolean checkAge(final int age) {
        return age > 18 && age < 150;
    }
}
