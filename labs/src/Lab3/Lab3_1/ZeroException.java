package Lab3.Lab3_1;

public class ZeroException extends Exception{
    public ZeroException() {
        super("""
                Ділити на нуль заборонено!
                Кожен раз коли ви ділете на 0,
                на вашому процесорі згоряє 1 транзистор.""");
    }
}
